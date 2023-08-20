// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Stack ps = new StaticStack(10);
        for (int i=0; i<10; i++){
            ps.add(i);
        }
        while (!ps.isEmpty()){
            System.out.println(ps.remove()+ " ");
        }
    }
}