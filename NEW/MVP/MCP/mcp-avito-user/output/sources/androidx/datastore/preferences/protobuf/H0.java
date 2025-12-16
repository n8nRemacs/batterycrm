package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC22934w;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MessageLiteToString.java */
/* loaded from: classes.dex */
final class H0 {
    public static final String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    public static final void b(StringBuilder sb2, int i12, String str, Object obj) {
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
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            AbstractC22934w abstractC22934w = AbstractC22934w.f45925c;
            sb2.append(u1.a(new AbstractC22934w.j(((String) obj).getBytes(C22914m0.f45874a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC22934w) {
            sb2.append(": \"");
            sb2.append(u1.a((AbstractC22934w) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb2.append(" {");
            c((GeneratedMessageLite) obj, sb2, i12 + 2);
            sb2.append("\n");
            while (i13 < i12) {
                sb2.append(' ');
                i13++;
            }
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj.toString());
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i15 = i12 + 2;
        b(sb2, i15, "key", entry.getKey());
        b(sb2, i15, "value", entry.getValue());
        sb2.append("\n");
        while (i13 < i12) {
            sb2.append(' ');
            i13++;
        }
        sb2.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(androidx.datastore.preferences.protobuf.GeneratedMessageLite r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.H0.c(androidx.datastore.preferences.protobuf.GeneratedMessageLite, java.lang.StringBuilder, int):void");
    }
}
