package com.google.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MessageLiteToString.java */
/* renamed from: com.google.protobuf.y0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37711y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f363010a;

    static {
        char[] cArr = new char[80];
        f363010a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i12, StringBuilder sb2) {
        while (i12 > 0) {
            int i13 = 80;
            if (i12 <= 80) {
                i13 = i12;
            }
            sb2.append(f363010a, 0, i13);
            i12 -= i13;
        }
    }

    public static void b(StringBuilder sb2, int i12, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i12, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i12, str, (Map.Entry) it2.next());
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
            sb2.append(e1.a(AbstractC37700t.i((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC37700t) {
            sb2.append(": \"");
            sb2.append(e1.a((AbstractC37700t) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb2.append(" {");
            c((GeneratedMessageLite) obj, sb2, i12 + 2);
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
        b(sb2, i14, "key", entry.getKey());
        b(sb2, i14, "value", entry.getValue());
        sb2.append("\n");
        a(i12, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(com.google.protobuf.GeneratedMessageLite r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C37711y0.c(com.google.protobuf.GeneratedMessageLite, java.lang.StringBuilder, int):void");
    }
}
