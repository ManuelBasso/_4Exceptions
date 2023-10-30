public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        int div = 0;

        checkArray(array, div);
    }

    static void checkArray(int[] a, int div){

    try{
        System.out.println(a[8] / div);
    } catch (ArithmeticException e){
        System.out.println("Non puoi dividere numero per zero");
    } catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Indice superiore alla lunghezza dell'array");
    } finally {
        System.out.println("Fine controllo");
    }
    }
}