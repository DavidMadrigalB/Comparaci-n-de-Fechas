public class Main {
    public static void main (String[] args) {
        try {
            System.out.println(Fecha.getFechaActualString());
            System.out.println(Fecha.getFechaActualString("dd/MM/yyyy"));
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
