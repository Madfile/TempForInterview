package com.company.Util;

import java.text.DecimalFormat;

public class FloatFormatUtil {
    public static String floatFormat(float input){
        DecimalFormat decimalFormat = new DecimalFormat(".00");
        return decimalFormat.format(input);
    }
}
