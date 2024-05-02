public class task3 {
    public static void main(String[] args) {

        int[] a = new int[10];

        for (int i=0; i<10; i++){
            a[i]=i+1;
        }

        for (int i=0; i<10; i++){
            if (a[i]%2==0) System.out.println(a[i]);
        }

    }
}