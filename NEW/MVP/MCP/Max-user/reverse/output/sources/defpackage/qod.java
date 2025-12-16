package defpackage;

import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class qod implements Closeable {
    public abstract wv0 P();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[Catch: all -> 0x0053, TRY_ENTER, TryCatch #1 {all -> 0x0053, blocks: (B:3:0x0004, B:5:0x000a, B:10:0x002b, B:12:0x0033, B:18:0x003e, B:22:0x0047, B:21:0x0045), top: B:33:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Q() throws java.io.IOException {
        /*
            r9 = this;
            wv0 r0 = r9.P()
            ua9 r1 = r9.y()     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L45
            java.nio.charset.Charset r2 = defpackage.lb2.a     // Catch: java.lang.Throwable -> L53
            java.lang.String r3 = "charset"
            java.lang.String[] r1 = r1.c     // Catch: java.lang.Throwable -> L53
            to7 r4 = new to7     // Catch: java.lang.Throwable -> L53
            int r5 = r1.length     // Catch: java.lang.Throwable -> L53
            r6 = 1
            int r5 = r5 - r6
            r7 = 0
            r4.<init>(r7, r5, r6)     // Catch: java.lang.Throwable -> L53
            r5 = 2
            ro7 r4 = defpackage.n7j.g(r4, r5)     // Catch: java.lang.Throwable -> L53
            int r5 = r4.a     // Catch: java.lang.Throwable -> L53
            int r7 = r4.b     // Catch: java.lang.Throwable -> L53
            int r4 = r4.c     // Catch: java.lang.Throwable -> L53
            if (r4 < 0) goto L29
            if (r5 > r7) goto L3b
            goto L2b
        L29:
            if (r5 < r7) goto L3b
        L2b:
            r8 = r1[r5]     // Catch: java.lang.Throwable -> L53
            boolean r8 = defpackage.dnf.n(r8, r3, r6)     // Catch: java.lang.Throwable -> L53
            if (r8 == 0) goto L37
            int r5 = r5 + r6
            r1 = r1[r5]     // Catch: java.lang.Throwable -> L53
            goto L3c
        L37:
            if (r5 == r7) goto L3b
            int r5 = r5 + r4
            goto L2b
        L3b:
            r1 = 0
        L3c:
            if (r1 == 0) goto L42
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r1)     // Catch: java.lang.IllegalArgumentException -> L42 java.lang.Throwable -> L53
        L42:
            if (r2 == 0) goto L45
            goto L47
        L45:
            java.nio.charset.Charset r2 = defpackage.lb2.a     // Catch: java.lang.Throwable -> L53
        L47:
            java.nio.charset.Charset r1 = defpackage.yxg.r(r0, r2)     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = r0.M(r1)     // Catch: java.lang.Throwable -> L53
            r0.close()
            return r1
        L53:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L55
        L55:
            r2 = move-exception
            defpackage.r4j.a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qod.Q():java.lang.String");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        yxg.c(P());
    }

    public final InputStream l() {
        return P().g0();
    }

    public abstract long w();

    public abstract ua9 y();
}
