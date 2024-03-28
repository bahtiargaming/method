package yussemester2;


public class method {
    public double luas_lingkaran( int diameter) {
        int jari2 = diameter /  10;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }
    
    public static void main(String[] args) {
        method mt = new method ();
        System.out.print(mt.luas_lingkaran(20));
        System.exit(0);
    }
    
    
}
