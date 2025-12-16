package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzkw {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f350940a;

    static {
        char[] cArr = new char[80];
        f350940a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i12, StringBuilder sb2) {
        while (i12 > 0) {
            int i13 = 80;
            if (i12 <= 80) {
                i13 = i12;
            }
            sb2.append(f350940a, 0, i13);
            i12 -= i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.google.android.gms.internal.measurement.zzjf r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkw.b(com.google.android.gms.internal.measurement.zzjf, java.lang.StringBuilder, int):void");
    }

    public static void c(StringBuilder sb2, int i12, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb2, i12, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                c(sb2, i12, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(i12, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i13 = 1; i13 < str.length(); i13++) {
                char cCharAt = str.charAt(i13);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(zzme.a(zzhu.zza((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzhu) {
            sb2.append(": \"");
            sb2.append(zzme.a((zzhu) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzjf) {
            sb2.append(" {");
            b((zzjf) obj, sb2, i12 + 2);
            sb2.append("\n");
            a(i12, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i14 = i12 + 2;
        c(sb2, i14, "key", entry.getKey());
        c(sb2, i14, "value", entry.getValue());
        sb2.append("\n");
        a(i12, sb2);
        sb2.append("}");
    }
}
