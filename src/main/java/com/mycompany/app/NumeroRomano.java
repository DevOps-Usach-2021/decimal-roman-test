package com.mycompany.app;

public class NumeroRomano {

    public static Object decToRomano(int num) {
        String m[] = { "", "M", "MM", "MMM" };
        String c[] = { "",  "C",  "CC",  "CCC",  "CD",
                       "D", "DC", "DCC", "DCCC", "CM" };
        String x[] = { "",  "X",  "XX",  "XXX",  "XL",
                       "L", "LX", "LXX", "LXXX", "XC" };
        String i[] = { "",  "I",  "II",  "III",  "IV",
                       "V", "VI", "VII", "VIII", "IX" };
 
        String miles = m[num / 1000];
        String centenas = c[(num % 1000) / 100];
        String decenas = x[(num % 100) / 10];
        String unidades = i[num % 10];
 
        String decimal = miles + centenas + decenas + unidades;
 
        return decimal;
    }

}
