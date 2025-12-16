package io.sentry.util;

import androidx.compose.ui.graphics.colorspace.e;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Util.java */
/* loaded from: classes8.dex */
public final class b {
    public static boolean a(String str) {
        return str == null || str.length() == 0;
    }

    public static Map<String, String> b(String str, String str2) {
        if (a(str)) {
            return Collections.emptyMap();
        }
        String[] strArrSplit = str.split(",");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str3 : strArrSplit) {
            String[] strArrSplit2 = str3.split(":");
            if (strArrSplit2.length != 2) {
                throw new IllegalArgumentException(e.n("Invalid ", str2, " entry: ", str3));
            }
            linkedHashMap.put(strArrSplit2[0], strArrSplit2[1]);
        }
        return linkedHashMap;
    }

    public static Integer c(Integer num, String str) {
        return a(str) ? num : Integer.valueOf(Integer.parseInt(str));
    }

    public static String d(int i12, String str) {
        if (str == null) {
            return null;
        }
        if (str.length() <= i12) {
            return str;
        }
        return str.substring(0, i12 - 3) + "...";
    }
}
