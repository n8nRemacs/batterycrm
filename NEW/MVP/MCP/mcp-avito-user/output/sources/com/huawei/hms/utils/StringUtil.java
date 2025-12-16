package com.huawei.hms.utils;

import com.huawei.hms.framework.common.ExceptionCode;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class StringUtil {
    public static String addByteForNum(String str, int i12, char c12) {
        int length = str.length();
        if (length == i12) {
            return str;
        }
        if (length > i12) {
            return str.substring(length - i12);
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (length < i12) {
            stringBuffer.append(c12);
            length++;
        }
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public static boolean checkVersion(String str) {
        return Pattern.compile("(^([0-9]{1,2}\\.){2}[0-9]{1,2}$)|(^([0-9]{1,2}\\.){3}[0-9]{1,3}$)").matcher(str).find();
    }

    public static int convertVersion2Integer(String str) {
        if (!checkVersion(str)) {
            return 0;
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 3) {
            return 0;
        }
        int i12 = (Integer.parseInt(strArrSplit[2]) * 1000) + (Integer.parseInt(strArrSplit[1]) * 100000) + (Integer.parseInt(strArrSplit[0]) * ExceptionCode.CRASH_EXCEPTION);
        return strArrSplit.length == 4 ? i12 + Integer.parseInt(strArrSplit[3]) : i12;
    }

    public static String objDesc(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getName() + '@' + Integer.toHexString(obj.hashCode());
    }
}
