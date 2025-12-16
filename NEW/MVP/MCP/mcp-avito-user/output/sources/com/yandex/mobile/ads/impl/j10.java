package com.yandex.mobile.ads.impl;

import com.avito.android.remote.model.category_parameters.DateTimeParameterKt;
import com.huawei.hms.framework.common.ContainerUtils;
import com.yandex.mobile.ads.impl.zg;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes8.dex */
public final class j10 {
    @j.P
    public static zg.a a(zo0 zo0Var) throws NumberFormatException {
        boolean z12;
        long j12;
        long j13;
        long j14;
        long j15;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = zo0Var.f392317c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long jA2 = str != null ? a(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i12 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z12 = false;
            j12 = 0;
            j13 = 0;
            while (i12 < strArrSplit.length) {
                String strTrim = strArrSplit[i12].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j12 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j13 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z12 = true;
                }
                i12++;
            }
            i12 = 1;
        } else {
            z12 = false;
            j12 = 0;
            j13 = 0;
        }
        String str3 = map.get("Expires");
        long jA3 = str3 != null ? a(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long jA4 = str4 != null ? a(str4) : 0L;
        String str5 = map.get("ETag");
        if (i12 != 0) {
            j15 = jCurrentTimeMillis + (j12 * 1000);
            if (z12) {
                j14 = j15;
            } else {
                j14 = j15;
                j15 = (j13 * 1000) + j15;
            }
        } else {
            j14 = 0;
            if (jA2 <= 0 || jA3 < jA2) {
                j15 = 0;
            } else {
                j15 = jCurrentTimeMillis + (jA3 - jA2);
                j14 = j15;
            }
        }
        zg.a aVar = new zg.a();
        aVar.f392254a = zo0Var.f392316b;
        aVar.f392255b = str5;
        aVar.f392259f = j14;
        aVar.f392258e = j15;
        aVar.f392256c = jA2;
        aVar.f392257d = jA4;
        aVar.f392260g = map;
        aVar.f392261h = zo0Var.f392318d;
        return aVar;
    }

    public static long a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            if (!"0".equals(str) && !DateTimeParameterKt.DATE_TIME_PARAMETER_PRESENT_TIME.equals(str)) {
                boolean z12 = pk1.f388875a;
                return 0L;
            }
            boolean z13 = pk1.f388875a;
            return 0L;
        }
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

    public static Map<String, String> a(zg.a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        String str = aVar.f392255b;
        if (str != null) {
            map.put("If-None-Match", str);
        }
        long j12 = aVar.f392257d;
        if (j12 > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            map.put("If-Modified-Since", simpleDateFormat.format(new Date(j12)));
        }
        return map;
    }
}
