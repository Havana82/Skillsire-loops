public class Main {
    public static void main(String[] args) {
        forLoop(6);
        whileLoop(8);
        doWhileLoop(9);
    }

    public static void forLoop( int num) {
        for(int i = 0; i <= num; i++){
            System.out.println(i);
        }
    } public static void whileLoop( int num) {
        int start = 0;
        while (start <= num){
            System.out.println(start);
            start++;
        }
    } public static void doWhileLoop( int num) {
        int start = 0;
        do{
            System.out.println(start);
            start++;
        }
        while (start <= num);
    }
}