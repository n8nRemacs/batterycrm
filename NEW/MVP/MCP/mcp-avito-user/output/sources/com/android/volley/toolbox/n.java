package com.android.volley.toolbox;

import com.android.volley.j;
import com.avito.android.remote.model.category_parameters.DateTimeParameterKt;
import com.huawei.hms.framework.common.ContainerUtils;
import j.P;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: HttpHeaderParser.java */
/* loaded from: classes10.dex */
public class n {
    public static Map<String, String> a(j.a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        String str = aVar.f67067b;
        if (str != null) {
            map.put("If-None-Match", str);
        }
        long j12 = aVar.f67069d;
        if (j12 > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            map.put("If-Modified-Since", simpleDateFormat.format(new Date(j12)));
        }
        return map;
    }

    @P
    public static j.a b(com.android.volley.r rVar) throws NumberFormatException {
        boolean z12;
        long j12;
        long j13;
        long j14;
        long j15;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = rVar.f67101c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long jD2 = str != null ? d(str) : 0L;
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
        long jD3 = str3 != null ? d(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long jD4 = str4 != null ? d(str4) : 0L;
        String str5 = map.get("ETag");
        if (i12 != 0) {
            j15 = jCurrentTimeMillis + (j12 * 1000);
            j14 = z12 ? j15 : (j13 * 1000) + j15;
        } else {
            j14 = 0;
            if (jD2 <= 0 || jD3 < jD2) {
                j15 = 0;
            } else {
                j15 = jCurrentTimeMillis + (jD3 - jD2);
                j14 = j15;
            }
        }
        j.a aVar = new j.a();
        aVar.f67066a = rVar.f67100b;
        aVar.f67067b = str5;
        aVar.f67071f = j15;
        aVar.f67070e = j14;
        aVar.f67068c = jD2;
        aVar.f67069d = jD4;
        aVar.f67072g = map;
        aVar.f67073h = rVar.f67102d;
        return aVar;
    }

    public static String c(String str, @P Map map) {
        String str2;
        if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
            String[] strArrSplit = str2.split(";", 0);
            for (int i12 = 1; i12 < strArrSplit.length; i12++) {
                String[] strArrSplit2 = strArrSplit[i12].trim().split(ContainerUtils.KEY_VALUE_DELIMITER, 0);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                    return strArrSplit2[1];
                }
            }
        }
        return str;
    }

    public static long d(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            if ("0".equals(str) || DateTimeParameterKt.DATE_TIME_PARAMETER_PRESENT_TIME.equals(str)) {
                com.android.volley.z.b("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            com.android.volley.z.a("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }
}
