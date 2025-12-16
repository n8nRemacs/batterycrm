package com.huawei.updatesdk.a.a.d;

import androidx.compose.foundation.H;
import java.util.List;

/* loaded from: classes7.dex */
public class f {
    private static String a(String str) {
        return str == null ? "" : str;
    }

    public static String a(List<String> list, String str) {
        return a(list, str, (String) null, (String) null);
    }

    public static String a(List<String> list, String str, String str2, String str3) {
        return (list == null || list.isEmpty()) ? "" : a((String[]) list.toArray(new String[0]), str, str2, str3);
    }

    public static String a(String[] strArr, String str) {
        return a(strArr, str, (String) null, (String) null);
    }

    public static String a(String[] strArr, String str, String str2, String str3) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        String strA = a(str);
        String strA2 = a(str2);
        String strA3 = a(str3);
        StringBuilder sbR = H.r(strA2);
        sbR.append(strArr[0]);
        sbR.append(strA3);
        for (int i12 = 1; i12 < strArr.length; i12++) {
            sbR.append(strA);
            sbR.append(strA2);
            sbR.append(strArr[i12]);
            sbR.append(strA3);
        }
        return sbR.toString();
    }
}
