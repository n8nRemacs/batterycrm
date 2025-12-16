package com.huawei.hms.framework.common;

/* loaded from: classes7.dex */
public class CheckParamUtils {
    public static <T> T checkNotNull(T t12, String str) {
        if (t12 != null) {
            return t12;
        }
        throw new NullPointerException(str);
    }

    public static int checkNumParam(int i12, int i13, int i14, int i15, String str) {
        if (i12 > i14 || i12 < i13) {
            return i15;
        }
        Logger.d("CheckParamUtils", str);
        return i12;
    }

    public static void checkOffsetAndCount(long j12, long j13, long j14) {
        if ((j13 | j14) < 0 || j13 > j12 || j12 - j13 < j14) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean isIpV4(String str) {
        if (str == null || str.isEmpty() || str.length() > 15 || !str.replace(".", "").matches("[0-9]+")) {
            return false;
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length != 4) {
            return false;
        }
        for (String str2 : strArrSplit) {
            if (str2.length() > 4 || Integer.parseInt(str2) > 255) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIpV6(String str) {
        if (str == null || str.isEmpty() || str.length() > 39) {
            return false;
        }
        int i12 = 0;
        for (char c12 : str.toCharArray()) {
            if (':' == c12) {
                i12++;
            }
        }
        if (i12 != 7) {
            return false;
        }
        for (String str2 : str.split("\\:")) {
            if (str2.length() > 4) {
                return false;
            }
        }
        return str.replace(":", "").matches("[A-Fa-f0-9]+");
    }

    public static long checkNumParam(long j12, long j13, long j14, long j15, String str) {
        if (j12 > j14 || j12 < j13) {
            return j15;
        }
        Logger.d("CheckParamUtils", str);
        return j12;
    }
}
