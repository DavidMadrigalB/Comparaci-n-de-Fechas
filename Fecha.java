import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Fecha {
    public static Calendar getCalendar() {
        return Calendar.getInstance();
    }

    public static void asd(String fecha) throws ParseException {
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
        Calendar calen= Calendar.getInstance();
        calen.setTime(sdf.parse(fecha));
        calen.set(calen.get(calen.YEAR), calen.get(calen.MONTH), calen.get(calen.DAY_OF_MONTH));
        Calendar fechaIni= restarAlAnio(18);
        if(fechaIni.after(calen)) {
            System.out.println("Es mayor que 18" + sdf.format(calen.getTime()) + "," + sdf.format(fechaIni.getTime()));
        }else {
            System.out.println("Es menor que 18");
        }
        System.out.println(calen);
        System.out.println(fechaIni);
    }

    public static Calendar restarAlAnio(int num) {
        Calendar hoy = Calendar.getInstance();
        hoy.set(hoy.get(hoy.YEAR) - num, hoy.get(hoy.MONTH), hoy.get(hoy.DAY_OF_MONTH));
        return hoy;
    }

    public static Calendar restarAlMes(int num) {
        Calendar hoy = Calendar.getInstance();
        hoy.set(hoy.YEAR, hoy.MONTH - num, hoy.DAY_OF_MONTH);
        return hoy;
    }

    public static Calendar restarAlDia(int num) {
        Calendar hoy = Calendar.getInstance();
        hoy.set(hoy.YEAR, hoy.MONTH, hoy.DAY_OF_MONTH - num);
        return hoy;
    }
}
