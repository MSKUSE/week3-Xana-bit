public class FindGrade {
    public static void main(String[] args) {
        System.out.print("Notunuzu girin: ");
        int n = Integer.parseInt(System.console().readLine());

        if (n >= 90) System.out.println("A");
        else if (n >= 80) System.out.println("B");
        else if (n >= 70) System.out.println("C");
        else if (n >= 60) System.out.println("D");
        else System.out.println("F");
    }
}
