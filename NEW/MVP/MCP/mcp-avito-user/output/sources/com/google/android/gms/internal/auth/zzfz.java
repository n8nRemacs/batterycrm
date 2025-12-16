package com.google.android.gms.internal.auth;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzfz {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f350120a;

    static {
        char[] cArr = new char[80];
        f350120a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i12, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i12, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i12, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        b(i12, sb2);
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
            sb2.append(zzgx.a(new zzec(((String) obj).getBytes(zzfa.f350106a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzef) {
            sb2.append(": \"");
            sb2.append(zzgx.a((zzef) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzev) {
            sb2.append(" {");
            c((zzev) obj, sb2, i12 + 2);
            sb2.append("\n");
            b(i12, sb2);
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
        a(sb2, i14, "key", entry.getKey());
        a(sb2, i14, "value", entry.getValue());
        sb2.append("\n");
        b(i12, sb2);
        sb2.append("}");
    }

    public static void b(int i12, StringBuilder sb2) {
        while (i12 > 0) {
            int i13 = 80;
            if (i12 <= 80) {
                i13 = i12;
            }
            sb2.append(f350120a, 0, i13);
            i12 -= i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(com.google.android.gms.internal.auth.zzev r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.c(com.google.android.gms.internal.auth.zzev, java.lang.StringBuilder, int):void");
    }
}
