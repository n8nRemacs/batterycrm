package org.joda.time.tz;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.joda.time.C44866h;

/* compiled from: DefaultNameProvider.java */
/* loaded from: classes7.dex */
public class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<Locale, Map<String, Map<String, Object>>> f420993a = c();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<Locale, Map<String, Map<Boolean, Object>>> f420994b = c();

    public static HashMap c() {
        return new HashMap(7);
    }

    @Override // org.joda.time.tz.e
    public final String a(Locale locale, String str, String str2) {
        String[] strArrD = d(locale, str, str2);
        if (strArrD == null) {
            return null;
        }
        return strArrD[0];
    }

    @Override // org.joda.time.tz.e
    public final String b(Locale locale, String str, String str2) {
        String[] strArrD = d(locale, str, str2);
        if (strArrD == null) {
            return null;
        }
        return strArrD[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.HashMap] */
    public final synchronized String[] d(Locale locale, String str, String str2) {
        String[] strArr;
        String[] strArr2 = null;
        if (locale == null || str == 0) {
            return null;
        }
        try {
            Map map = this.f420993a.get(locale);
            if (map == null) {
                HashMap<Locale, Map<String, Map<String, Object>>> map2 = this.f420993a;
                HashMap mapC = c();
                map2.put(locale, mapC);
                map = mapC;
            }
            ?? C12 = (Map) map.get(str);
            if (C12 == 0) {
                C12 = c();
                map.put(str, C12);
                String[][] zoneStrings = C44866h.b(Locale.ENGLISH).getZoneStrings();
                int length = zoneStrings.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        strArr = null;
                        break;
                    }
                    strArr = zoneStrings[i12];
                    if (strArr != null && strArr.length >= 5 && str.equals(strArr[0])) {
                        break;
                    }
                    i12++;
                }
                String[][] zoneStrings2 = C44866h.b(locale).getZoneStrings();
                int length2 = zoneStrings2.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length2) {
                        String[] strArr3 = zoneStrings2[i13];
                        if (strArr3 != null && strArr3.length >= 5 && str.equals(strArr3[0])) {
                            strArr2 = strArr3;
                            break;
                        }
                        i13++;
                    } else {
                        break;
                    }
                }
                if (strArr != null && strArr2 != null) {
                    C12.put(strArr[2], new String[]{strArr2[2], strArr2[1]});
                    if (strArr[2].equals(strArr[4])) {
                        C12.put(strArr[4] + "-Summer", new String[]{strArr2[4], strArr2[3]});
                    } else {
                        C12.put(strArr[4], new String[]{strArr2[4], strArr2[3]});
                    }
                }
            }
            return (String[]) C12.get(str2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.HashMap] */
    public final synchronized String[] e(Locale locale, String str, String str2, boolean z12) {
        String[] strArr;
        String[] strArr2 = null;
        if (locale == null || str == null) {
            return null;
        }
        try {
            if (str.startsWith("Etc/")) {
                str = str.substring(4);
            }
            Map map = this.f420994b.get(locale);
            if (map == null) {
                HashMap<Locale, Map<String, Map<Boolean, Object>>> map2 = this.f420994b;
                HashMap mapC = c();
                map2.put(locale, mapC);
                map = mapC;
            }
            ?? C12 = (Map) map.get(str);
            if (C12 == 0) {
                C12 = c();
                map.put(str, C12);
                String[][] zoneStrings = C44866h.b(Locale.ENGLISH).getZoneStrings();
                int length = zoneStrings.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        strArr = null;
                        break;
                    }
                    strArr = zoneStrings[i12];
                    if (strArr != null && strArr.length >= 5 && str.equals(strArr[0])) {
                        break;
                    }
                    i12++;
                }
                String[][] zoneStrings2 = C44866h.b(locale).getZoneStrings();
                int length2 = zoneStrings2.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length2) {
                        String[] strArr3 = zoneStrings2[i13];
                        if (strArr3 != null && strArr3.length >= 5 && str.equals(strArr3[0])) {
                            strArr2 = strArr3;
                            break;
                        }
                        i13++;
                    } else {
                        break;
                    }
                }
                if (strArr != null && strArr2 != null) {
                    C12.put(Boolean.TRUE, new String[]{strArr2[2], strArr2[1]});
                    C12.put(Boolean.FALSE, new String[]{strArr2[4], strArr2[3]});
                }
            }
            return (String[]) C12.get(Boolean.valueOf(z12));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
