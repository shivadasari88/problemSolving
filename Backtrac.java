class Backtrac{

    static void f(int i, int n){
        if(i<0){
            return ;
        }
        f(i-1,n);
        System.out.println(n-i);
    }
    public static void main(String[] args){
        int n =3;
        Backtrac.f(n-1, n);
        
    }
}