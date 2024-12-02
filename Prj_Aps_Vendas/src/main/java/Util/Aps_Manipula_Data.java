package Util;

import java.sql.Date;

public class Aps_Manipula_Data {
    public Date aps_String2Date(String aps_Data)
    {
        DateTimeFormatter aps_Formato = 
                DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        Date dataSaida = Date.valueOf(LocalDate.parse(data, formato));
                
        return dataSaida;
    }
    
    public String date2String(String data)
    {
        try
        {
            java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").
                    parse(data);
            data = new SimpleDateFormat("dd/MM/yyyy").format(date);
        }
        catch(ParseException e)
        {
            System.out.println(e);
        }
        return data;
    }
}
