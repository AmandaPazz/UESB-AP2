 class Maior {

    static int maior(int a[], int t) {
       if (t == 1){
        return a[0];
       }

       int resto = maior(a, t-1);

       return Math.max(resto, a[t-1]);
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6};
        System.out.println(maior(array, array.length));

        System.out.println("\n\n");
    }
}
 
    

