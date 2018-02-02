public class FindPointsTest {
    public static void main(String[] args) {
        System.out.println(getIntegerPointsCount(2,8,10,0));
    }
    /*Найти количество целочисленных точек в отрезке можно по такой формуле, используя НОД:
    N = 1 + НОД (|x2-x1|,|y2-y1|)
     */
    public static int getIntegerPointsCount(int x1, int y1, int x2, int y2){
        if(Math.abs(x2)>1000||Math.abs(x1)>1000||Math.abs(y2)>1000||Math.abs(y1)>1000){//Если вершина больше чем 1000 по модулю
            throw new ArithmeticException();//бросаем Exception
        }
        return 1 + getNOD(Math.abs(x2-x1), Math.abs(y2-y1));//Получаем количество вершин
    }
    private static int getNOD(int a,int b) {//алгоритм поиска НОД
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
