import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Comparacion_Compleja {
    // MENOR
    public static boolean esNumMenorQueNum(String numUno, String numDos) throws ParseException {
        int numInicial= Integer.parseInt(numUno);
        int numFinal= Integer.parseInt(numDos);
        return (numInicial < numFinal);
    }

    private static boolean esFechaParteMenorQueFechaParte(Date fechaUno, Date fechaDos, String formato) throws ParseException {
        SimpleDateFormat fecha = new SimpleDateFormat(formato);
        String fechaFormatoUno= fecha.format(fechaUno);
        String fechaFormatoDos= fecha.format(fechaDos);
        return esNumMenorQueNum(fechaFormatoUno, fechaFormatoDos);
    }

    public static boolean esDiaMenorQueDia(Date diaUno, Date diaDos) throws ParseException {
        return esFechaParteMenorQueFechaParte(diaUno, diaDos, "dd");
    }

    public static boolean esMesMenorQueMes(Date mesUno, Date mesDos) throws ParseException {
        return esFechaParteMenorQueFechaParte(mesUno, mesDos, "MM");
    }

    public static boolean esAnioMenorQueAnio(Date anioUno, Date anioDos) throws ParseException {
        return esFechaParteMenorQueFechaParte(anioUno, anioDos, "yyyy");
    }
    // IGUAL
    public static boolean esNumIgualQueNum(String numUno, String numDos) throws ParseException {
        int numInicial= Integer.parseInt(numUno);
        int numFinal= Integer.parseInt(numDos);
        return (numInicial == numFinal);
    }

    private static boolean esFechaParteIgualQueFechaParte(Date fechaUno, Date fechaDos, String formato) throws ParseException {
        SimpleDateFormat fecha = new SimpleDateFormat(formato);
        String fechaFormatoUno= fecha.format(fechaUno);
        String fechaFormatoDos= fecha.format(fechaDos);
        return esNumIgualQueNum(fechaFormatoUno, fechaFormatoDos);
    }

    public static boolean esDiaIgualQueDia(Date diaUno, Date diaDos) throws ParseException {
        return esFechaParteIgualQueFechaParte(diaUno, diaDos, "dd");
    }

    public static boolean esMesIgualQueMes(Date mesUno, Date mesDos) throws ParseException {
        return esFechaParteIgualQueFechaParte(mesUno, mesDos, "MM");
    }

    public static boolean esAnioIgualQueAnio(Date anioUno, Date anioDos) throws ParseException {
        return esFechaParteIgualQueFechaParte(anioUno, anioDos, "yyyy");
    }
    // MAYOR
    public static boolean esNumMayorQueNum(String numUno, String numDos) throws ParseException {
        int numInicial= Integer.parseInt(numUno);
        int numFinal= Integer.parseInt(numDos);
        return (numInicial > numFinal);
    }

    private static boolean esFechaParteMayorQueFechaParte(Date fechaUno, Date fechaDos, String formato) throws ParseException {
        SimpleDateFormat fecha = new SimpleDateFormat(formato);
        String fechaFormatoUno= fecha.format(fechaUno);
        String fechaFormatoDos= fecha.format(fechaDos);
        return esNumIgualQueNum(fechaFormatoUno, fechaFormatoDos);
    }

    public static boolean esDiaMayorQueDia(Date diaUno, Date diaDos) throws ParseException {
        return esFechaParteMayorQueFechaParte(diaUno, diaDos, "dd");
    }

    public static boolean esMesMayorQueMes(Date mesUno, Date mesDos) throws ParseException {
        return esFechaParteMayorQueFechaParte(mesUno, mesDos, "MM");
    }

    public static boolean esAnioMayorQueAnio(Date anioUno, Date anioDos) throws ParseException {
        return esFechaParteMayorQueFechaParte(anioUno, anioDos, "yyyy");
    }
    // IGUAL O MENOR
    public static boolean esDiaMenorIgualQueDia(Date diaUno, Date diaDos) throws ParseException {
        return esDiaMenorQueDia(diaUno, diaDos) 
            || esDiaIgualQueDia(diaUno, diaDos);
    }

    public static boolean esMesMenorIgualQueMes(Date mesUno, Date mesDos) throws ParseException {
        return esMesMenorQueMes(mesUno, mesDos) 
            || esMesIgualQueMes(mesUno, mesDos);
    }

    public static boolean esAnioMenorIgualQueAnio(Date anioUno, Date anioDos) throws ParseException {
        return esAnioMenorQueAnio(anioUno, anioDos) 
            || esAnioIgualQueAnio(anioUno, anioDos);
    }
    // IGUAL O MAYOR
    public static boolean esDiaMayorIgualQueDia(Date diaUno, Date diaDos) throws ParseException {
        return esDiaMayorQueDia(diaUno, diaDos) 
            || esDiaIgualQueDia(diaUno, diaDos);
    }

    public static boolean esMesMayorIgualQueMes(Date mesUno, Date mesDos) throws ParseException {
        return esMesMenorQueMes(mesUno, mesDos) 
            || esMesIgualQueMes(mesUno, mesDos);
    }

    public static boolean esAnioMayorIgualQueAnio(Date anioUno, Date anioDos) throws ParseException {
        return esAnioMayorQueAnio(anioUno, anioDos) 
            || esAnioIgualQueAnio(anioUno, anioDos);
    }
    // DIA MES
    public static boolean esDiaMesMenorQueDiaMes(Date diaMesUno, Date diaMesDos) throws ParseException {
        return (esMesMenorQueMes(diaMesUno, diaMesDos))? 
            true : (esMesIgualQueMes(diaMesUno, diaMesDos))? 
            esDiaMenorQueDia(diaMesUno, diaMesDos) : false;
    }

    public static boolean esDiaMesIgualQueDiaMes(Date diaMesUno, Date diaMesDos) throws ParseException {
        return esMesIgualQueMes(diaMesUno, diaMesDos) 
            && esDiaIgualQueDia(diaMesUno, diaMesDos);
    }

    public static boolean esDiaMesMayorQueDiaMes(Date diaMesUno, Date diaMesDos) throws ParseException {
        return (esMesMayorQueMes(diaMesUno, diaMesDos))? 
            true : (esMesIgualQueMes(diaMesUno, diaMesDos))? 
            esDiaMayorQueDia(diaMesUno, diaMesDos) : false;
    }

    public static boolean esDiaMesMenorIgualQueDiaMes(Date diaMesUno, Date diaMesDos) throws ParseException {
        return esDiaMesMenorQueDiaMes(diaMesUno, diaMesDos) 
            || esDiaMesIgualQueDiaMes(diaMesUno, diaMesDos);
    }

    public static boolean esDiaMesMayorIgualQueDiaMes(Date diaMesUno, Date diaMesDos) throws ParseException {
        return esDiaMesMayorQueDiaMes(diaMesUno, diaMesDos)
            || esDiaMesIgualQueDiaMes(diaMesUno, diaMesDos);
    }
    // MES ANIO
    public static boolean esMesAnioMenorQueMesAnio(Date mesAnioUno, Date mesAnioDos) throws ParseException {
        return (esAnioMenorQueAnio(mesAnioUno, mesAnioDos))? 
            true : (esAnioIgualQueAnio(mesAnioUno, mesAnioDos))? 
            esMesMenorQueMes(mesAnioUno, mesAnioDos) : false;
    }

    public static boolean esMesAnioIgualQueMesAnio(Date mesAnioUno, Date mesAnioDos) throws ParseException {
        return esAnioIgualQueAnio(mesAnioUno, mesAnioDos) 
            && esMesIgualQueMes(mesAnioUno, mesAnioDos);
    }

    public static boolean esMesAnioMayorQueMesAnio(Date mesAnioUno, Date mesAnioDos) throws ParseException {
        return (esAnioMayorQueAnio(mesAnioUno, mesAnioDos))? 
            true : (esAnioIgualQueAnio(mesAnioUno, mesAnioDos))? 
            esMesMayorQueMes(mesAnioUno, mesAnioDos) : false;
    }

    public static boolean esMesAnioMenorIgualQueMesAnio(Date mesAnioUno, Date mesAnioDos) throws ParseException {
        return esMesAnioMenorQueMesAnio(mesAnioUno, mesAnioDos) 
            || esMesAnioIgualQueMesAnio(mesAnioUno, mesAnioDos);
    }

    public static boolean esMesAnioMayorIgualQueMesAnio(Date mesAnioUno, Date mesAnioDos) throws ParseException {
        return esMesAnioMayorQueMesAnio(mesAnioUno, mesAnioDos)
            || esMesAnioIgualQueMesAnio(mesAnioUno, mesAnioDos);
    }
}
