package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class mt0 implements bp7 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ mt0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static int d(ood oodVar, int i) {
        String strC = ood.c(oodVar, "Retry-After");
        if (strC == null) {
            return i;
        }
        if (Pattern.compile("\\d+").matcher(strC).matches()) {
            return Integer.valueOf(strC).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x020d  */
    @Override // defpackage.bp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ood a(defpackage.rbd r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt0.a(rbd):ood");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.zmd b(defpackage.ood r12, defpackage.gge r13) throws java.net.ProtocolException {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt0.b(ood, gge):zmd");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(java.io.IOException r4, defpackage.mbd r5, defpackage.zmd r6, boolean r7) {
        /*
            r3 = this;
            java.lang.Object r6 = r3.b
            sua r6 = (defpackage.sua) r6
            boolean r6 = r6.X
            r0 = 0
            if (r6 != 0) goto Lb
            goto L98
        Lb:
            if (r7 == 0) goto L12
            boolean r6 = r4 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L12
            return r0
        L12:
            boolean r6 = r4 instanceof java.net.ProtocolException
            if (r6 == 0) goto L17
            return r0
        L17:
            boolean r6 = r4 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L22
            boolean r4 = r4 instanceof java.net.SocketTimeoutException
            if (r4 == 0) goto L98
            if (r7 != 0) goto L98
            goto L35
        L22:
            boolean r6 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r6 == 0) goto L30
            java.lang.Throwable r6 = r4.getCause()
            boolean r6 = r6 instanceof java.security.cert.CertificateException
            if (r6 == 0) goto L30
            goto L98
        L30:
            boolean r4 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L35
            return r0
        L35:
            gj5 r4 = r5.o
            int r5 = r4.c
            r6 = 1
            if (r5 != 0) goto L46
            int r7 = r4.d
            if (r7 != 0) goto L46
            int r7 = r4.e
            if (r7 != 0) goto L46
            r4 = r0
            goto L96
        L46:
            wtd r7 = r4.f
            if (r7 == 0) goto L4b
            goto L81
        L4b:
            r7 = 0
            if (r5 > r6) goto L7d
            int r5 = r4.d
            if (r5 > r6) goto L7d
            int r5 = r4.e
            if (r5 <= 0) goto L57
            goto L7d
        L57:
            mbd r5 = r4.i
            qbd r5 = r5.X
            if (r5 == 0) goto L7d
            monitor-enter(r5)
            int r1 = r5.k     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L64
            monitor-exit(r5)
            goto L7d
        L64:
            wtd r1 = r5.q     // Catch: java.lang.Throwable -> L7a
            aa r1 = r1.a     // Catch: java.lang.Throwable -> L7a
            ga7 r1 = r1.a     // Catch: java.lang.Throwable -> L7a
            aa r2 = r4.h     // Catch: java.lang.Throwable -> L7a
            ga7 r2 = r2.a     // Catch: java.lang.Throwable -> L7a
            boolean r1 = defpackage.yxg.a(r1, r2)     // Catch: java.lang.Throwable -> L7a
            if (r1 != 0) goto L76
            monitor-exit(r5)
            goto L7d
        L76:
            wtd r7 = r5.q     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r5)
            goto L7d
        L7a:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L7d:
            if (r7 == 0) goto L83
            r4.f = r7
        L81:
            r4 = r6
            goto L96
        L83:
            bj r5 = r4.a
            if (r5 == 0) goto L8e
            boolean r5 = r5.i()
            if (r5 != r6) goto L8e
            goto L81
        L8e:
            a9 r4 = r4.b
            if (r4 == 0) goto L81
            boolean r4 = r4.t()
        L96:
            if (r4 != 0) goto L99
        L98:
            return r0
        L99:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt0.c(java.io.IOException, mbd, zmd, boolean):boolean");
    }
}
