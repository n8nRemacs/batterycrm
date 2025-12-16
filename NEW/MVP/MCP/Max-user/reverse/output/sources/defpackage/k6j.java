package defpackage;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class k6j {
    public static int a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && '9' >= cCharAt) || (('a' <= cCharAt && 'z' >= cCharAt) || (('A' <= cCharAt && 'Z' >= cCharAt) || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static ojc b(Collection collection, s5g s5gVar, r5g r5gVar) {
        return new ojc(s5gVar, r5gVar, ve3.j(new pq3(v8b.E0, new n5g(x8b.h2), 1, 56), new pq3(v8b.G0, new n5g(mvd.p), 2, 56)), gwi.b(new imb("profile:memberslist:ids_to_delete", ue3.e0(collection))));
    }

    public static ojc c(Collection collection, s5g s5gVar, r5g r5gVar) {
        return new ojc(s5gVar, r5gVar, ve3.j(new pq3(v8b.F0, new n5g(x8b.h2), 1, 56), new pq3(v8b.H0, new n5g(x8b.i2), 1, 56), new pq3(v8b.G0, new n5g(mvd.p), 2, 56)), gwi.b(new imb("profile:memberslist:ids_to_delete", ue3.e0(collection))));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long d(int r13, java.lang.String r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k6j.d(int, java.lang.String):long");
    }
}
