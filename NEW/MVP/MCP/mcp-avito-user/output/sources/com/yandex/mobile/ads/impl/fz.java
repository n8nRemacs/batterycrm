package com.yandex.mobile.ads.impl;

import com.adjust.sdk.Constants;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes8.dex */
public final class fz {

    public interface a<T> {
        @j.P
        T a(String str);
    }

    public static boolean a(@j.N Map map, @j.N int i12) {
        String str = (String) map.get(i10.b(i12));
        if (str == null) {
            return false;
        }
        return Boolean.parseBoolean(str);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/Object;)I */
    public static int b(Map map, int i12) {
        String str = (String) map.get(i10.b(i12));
        int i13 = g7.f385602b;
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/Object;)Ljava/lang/Integer; */
    @j.P
    public static Integer c(@j.N Map map, @j.N int i12) {
        String str = (String) map.get(i10.b(i12));
        int i13 = g7.f385602b;
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/Object;)Ljava/lang/String; */
    @j.P
    public static String d(@j.N Map map, @j.N int i12) throws UnsupportedEncodingException {
        ArrayList arrayListE = e(map, i12);
        if (arrayListE.isEmpty()) {
            return null;
        }
        return (String) arrayListE.get(0);
    }

    @j.N
    public static ArrayList e(Map map, int i12) throws UnsupportedEncodingException {
        ArrayList arrayList = new ArrayList();
        String str = (String) map.get(i10.b(i12));
        if (str != null && !str.isEmpty()) {
            Object objSplit = str.split(",");
            if (objSplit == null) {
                objSplit = new Object[0];
            }
            for (String str2 : (String[]) objSplit) {
                try {
                    String strDecode = URLDecoder.decode(str2.trim(), Constants.ENCODING);
                    if (strDecode != null) {
                        arrayList.add(strDecode);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    @j.N
    public static ArrayList a(Map map, int i12, a aVar) throws UnsupportedEncodingException {
        ArrayList arrayList = new ArrayList();
        String str = (String) map.get(i10.b(i12));
        if (str != null && !str.isEmpty()) {
            Object objSplit = str.split(",");
            if (objSplit == null) {
                objSplit = new Object[0];
            }
            for (String str2 : (String[]) objSplit) {
                try {
                    String strDecode = URLDecoder.decode(str2.trim(), Constants.ENCODING);
                    if (aVar.a(strDecode) != null) {
                        arrayList.add(aVar.a(strDecode));
                    }
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    public static String a(@j.P Map<String, String> map) {
        String str;
        if (map != null && (str = map.get("Content-Type")) != null) {
            String[] strArrSplit = str.split(";", 0);
            for (int i12 = 1; i12 < strArrSplit.length; i12++) {
                String[] strArrSplit2 = strArrSplit[i12].trim().split(ContainerUtils.KEY_VALUE_DELIMITER, 0);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                    return strArrSplit2[1];
                }
            }
        }
        return "ISO-8859-1";
    }
}
