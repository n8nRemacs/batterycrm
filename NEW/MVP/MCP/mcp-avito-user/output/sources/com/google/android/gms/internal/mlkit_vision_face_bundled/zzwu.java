package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzwu {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f354087a;

    static {
        char[] cArr = new char[80];
        f354087a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i12, String str, Object obj) throws SecurityException {
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
            sb2.append(zzxu.a(new zzui(((String) obj).getBytes(zzvt.f354067a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzul) {
            sb2.append(": \"");
            sb2.append(zzxu.a((zzul) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzvn) {
            sb2.append(" {");
            c((zzvn) obj, sb2, i12 + 2);
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
        int i14 = i12 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
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
            sb2.append(f354087a, 0, i13);
            i12 -= i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn r18, java.lang.StringBuilder r19, int r20) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzwu.c(com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn, java.lang.StringBuilder, int):void");
    }
}
