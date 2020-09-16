import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Comparacion_Basica {

    public static Date getFechaActual() {
        return new Date();
    }
    //dd/MM/yyyy
    public static String getFechaActualString() throws Exception {
        String formato= "dd/MM/yyyy";
        return getFechaActualString(formato);
    }

    public static String getFechaActualString(String formato) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formato);
        return simpleDateFormat.format(new Date());
    }
    //HH:mm:ss
    public static String getHoraActualString() throws Exception {
        String formato= "HH:mm:ss";
        return getHoraActualString(formato);
    }

    public static String getHoraActualString(String formato) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formato);
        return simpleDateFormat.format(new Date());
    }

    public static boolean fechaMenorQueFecha(Date fechaUno, Date fechaDos) throws Exception {
        return fechaUno.before(fechaDos);
    }

    public static boolean fechaActualMenorQue(Date fecha) throws Exception {
        return fechaMenorQueFecha(getFechaActual(), fecha);
    }

    public static boolean fechaIgualQueFecha(Date fechaUno, Date fechaDos) throws Exception {
        return fechaUno.equals(fechaDos);
    }

    public static boolean fechaActualIgualQue(Date fecha) throws Exception {
        return fechaIgualQueFecha(getFechaActual(), fecha);
    }

    public static boolean fechaMayorQueFecha(Date fechaUno, Date fechaDos) throws Exception {
        return fechaUno.after(fechaDos);
    }

    public static boolean fechaActualMayorQue(Date fecha) throws Exception {
        return fechaMayorQueFecha(getFechaActual(), fecha);
    }

    public static boolean fechaActualMenorQueString(String fecha, String formato) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formato);
        Date fechaUno= simpleDateFormat.parse(fecha);
        Date fechaDos= simpleDateFormat.parse(getFechaActualString(formato));
        return fechaMenorQueFecha(fechaUno, fechaDos);
    }

    public static boolean fechaActualIgualQueString(String fecha, String formato) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formato);
        Date fechaUno= simpleDateFormat.parse(fecha);
        Date fechaDos= simpleDateFormat.parse(getFechaActualString(formato));
        return fechaIgualQueFecha(fechaUno, fechaDos);
    }

    public static boolean fechaActualMayorQueString(String fecha, String formato) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formato);
        Date fechaUno= simpleDateFormat.parse(fecha);
        Date fechaDos= simpleDateFormat.parse(getFechaActualString(formato));
        return fechaMayorQueFecha(fechaUno, fechaDos);
    }

    public static boolean fechaMenorQueFecha(String fechaUnoString, String fechaDosString, String formato) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formato);
        Date fechaUno= simpleDateFormat.parse(fechaUnoString);
        Date fechaDos= simpleDateFormat.parse(fechaDosString);
        return fechaMenorQueFecha(fechaUno, fechaDos);
    }

    public static boolean fechaIgualQueFecha(String fechaUnoString, String fechaDosString, String formato) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formato);
        Date fechaUno= simpleDateFormat.parse(fechaUnoString);
        Date fechaDos= simpleDateFormat.parse(fechaDosString);
        return fechaIgualQueFecha(fechaUno, fechaDos);
    }

    public static boolean fechaMayorQueFecha(String fechaUnoString, String fechaDosString, String formato) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formato);
        Date fechaUno= simpleDateFormat.parse(fechaUnoString);
        Date fechaDos= simpleDateFormat.parse(fechaDosString);
        return fechaMayorQueFecha(fechaUno, fechaDos);
    }

    public static boolean fechaMenorQueFecha(String fechaUnoString, String fechaDosString) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date fechaUno= simpleDateFormat.parse(fechaUnoString);
        Date fechaDos= simpleDateFormat.parse(fechaDosString);
        return fechaMenorQueFecha(fechaUno, fechaDos);
    }

    public static boolean fechaIgualQueFecha(String fechaUnoString, String fechaDosString) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date fechaUno= simpleDateFormat.parse(fechaUnoString);
        Date fechaDos= simpleDateFormat.parse(fechaDosString);
        return fechaIgualQueFecha(fechaUno, fechaDos);
    }

    public static boolean fechaMayorQueFecha(String fechaUnoString, String fechaDosString) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date fechaUno= simpleDateFormat.parse(fechaUnoString);
        Date fechaDos= simpleDateFormat.parse(fechaDosString);
        return fechaMayorQueFecha(fechaUno, fechaDos);
    }

    public static boolean numMenorQueNum(int numUno, int numDos) {
        return (numUno < numDos);
    }

    public static boolean numMenorQueNumString(String numUnoString, String numDosString) throws ParseException {
        int numUno= Integer.parseInt(numUnoString);
        int numDos= Integer.parseInt(numDosString);
        return numMenorQueNum(numUno, numDos);
    }

    public static boolean diaMenorQueDia(Date fechaUno, Date fechaDos) throws Exception {
        SimpleDateFormat dia = new SimpleDateFormat("dd");
        String diaUnoString= dia.format(fechaUno);
        String diaDosString= dia.format(fechaDos);
        return numMenorQueNumString(diaUnoString, diaDosString);
    }

    public static boolean mesMenorQueMes(Date fechaUno, Date fechaDos) throws Exception {
        SimpleDateFormat mes = new SimpleDateFormat("MM");
        String mesUnoString= mes.format(fechaUno);
        String mesDosString= mes.format(fechaDos);
        return numMenorQueNumString(mesUnoString, mesDosString);
    }

    public static boolean anioMenorQueAnio(Date fechaUno, Date fechaDos) throws Exception {
        SimpleDateFormat anio = new SimpleDateFormat("yyyy");
        String anioUnoString= anio.format(fechaUno);
        String anioDosString= anio.format(fechaDos);
        return numMenorQueNumString(anioUnoString, anioDosString);
    }

    public static boolean numIgualQueNum(int numUno, int numDos) {
        return (numUno == numDos);
    }

    public static boolean numIgualQueNumString(String numUnoString, String numDosString) throws ParseException {
        int numUno= Integer.parseInt(numUnoString);
        int numDos= Integer.parseInt(numDosString);
        return numMenorQueNum(numUno, numDos);
    }

    public static boolean diaIgualQueDia(Date fechaUno, Date fechaDos) throws Exception {
        SimpleDateFormat dia = new SimpleDateFormat("dd");
        String diaUnoString= dia.format(fechaUno);
        String diaDosString= dia.format(fechaDos);
        return numIgualQueNumString(diaUnoString, diaDosString);
    }

    public static boolean mesIgualQueMes(Date fechaUno, Date fechaDos) throws Exception {
        SimpleDateFormat mes = new SimpleDateFormat("MM");
        String mesUnoString= mes.format(fechaUno);
        String mesDosString= mes.format(fechaDos);
        return numIgualQueNumString(mesUnoString, mesDosString);
    }

    public static boolean anioIgualQueAnio(Date fechaUno, Date fechaDos) throws Exception {
        SimpleDateFormat anio = new SimpleDateFormat("yyyy");
        String anioUnoString= anio.format(fechaUno);
        String anioDosString= anio.format(fechaDos);
        return numIgualQueNumString(anioUnoString, anioDosString);
    }

    public static boolean numMayorQueNum(int numUno, int numDos) {
        return (numUno > numDos);
    }

    public static boolean numMayorQueNumString(String numUnoString, String numDosString) throws ParseException {
        int numUno= Integer.parseInt(numUnoString);
        int numDos= Integer.parseInt(numDosString);
        return numMenorQueNum(numUno, numDos);
    }

    public static boolean diaMayorQueDia(Date fechaUno, Date fechaDos) throws Exception {
        SimpleDateFormat dia = new SimpleDateFormat("dd");
        String diaUnoString= dia.format(fechaUno);
        String diaDosString= dia.format(fechaDos);
        return numMayorQueNumString(diaUnoString, diaDosString);
    }

    public static boolean mesMayorQueMes(Date fechaUno, Date fechaDos) throws Exception {
        SimpleDateFormat mes = new SimpleDateFormat("MM");
        String mesUnoString= mes.format(fechaUno);
        String mesDosString= mes.format(fechaDos);
        return numMayorQueNumString(mesUnoString, mesDosString);
    }

    public static boolean anioMayorQueAnio(Date fechaUno, Date fechaDos) throws Exception {
        SimpleDateFormat anio = new SimpleDateFormat("yyyy");
        String anioUnoString= anio.format(fechaUno);
        String anioDosString= anio.format(fechaDos);
        return numMayorQueNumString(anioUnoString, anioDosString);
    }
}