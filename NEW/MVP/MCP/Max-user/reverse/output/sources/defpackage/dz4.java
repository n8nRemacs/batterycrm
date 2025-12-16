package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class dz4 implements f97 {
    public final t9f a;
    public volatile long b = Long.MIN_VALUE;
    public volatile Uri c;

    public dz4(t9f t9fVar) {
        this.a = t9fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    @Override // defpackage.f97
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri v(java.lang.String r8) {
        /*
            r7 = this;
            t9f r0 = r7.a
            android.net.Uri r0 = r0.v(r8)
            java.lang.String r1 = "api"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto Lf
            return r0
        Lf:
            android.net.Uri r8 = defpackage.wm.a
            java.lang.String r1 = r0.toString()
            java.lang.String r8 = r8.toString()
            boolean r2 = r1.equals(r8)
            r3 = 47
            r4 = 0
            if (r2 == 0) goto L23
            goto L49
        L23:
            boolean r2 = defpackage.vmf.v(r1, r3)
            if (r2 == 0) goto L2e
            int r2 = defpackage.vmf.y(r1)
            goto L32
        L2e:
            int r2 = r1.length()
        L32:
            boolean r5 = defpackage.vmf.v(r8, r3)
            if (r5 == 0) goto L3d
            int r5 = defpackage.vmf.y(r8)
            goto L41
        L3d:
            int r5 = r8.length()
        L41:
            if (r2 != r5) goto Le3
            boolean r8 = r1.regionMatches(r4, r8, r4, r2)
            if (r8 == 0) goto Le3
        L49:
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r5 = r7.b
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 <= 0) goto Ldd
            monitor-enter(r7)
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> La6
            long r5 = r7.b     // Catch: java.lang.Throwable -> La6
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 <= 0) goto Ld9
            hz4 r8 = defpackage.v17.x()     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lca
            java.lang.String r0 = r8.b     // Catch: java.lang.Throwable -> La6
            r1 = 34
            boolean r2 = defpackage.vmf.V(r0, r1)     // Catch: java.lang.Throwable -> La6
            r5 = 1
            if (r2 == 0) goto L7b
            boolean r1 = defpackage.vmf.v(r0, r1)     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L7b
            int r1 = defpackage.vmf.y(r0)     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = r0.substring(r5, r1)     // Catch: java.lang.Throwable -> La6
        L7b:
            java.lang.String r1 = "\"\""
            boolean r1 = defpackage.vmf.s(r0, r1, r4)     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L8b
            java.lang.String r1 = "\"\""
            java.lang.String r2 = ""
            java.lang.String r0 = defpackage.dnf.q(r0, r1, r2)     // Catch: java.lang.Throwable -> La6
        L8b:
            java.lang.CharSequence r0 = defpackage.vmf.c0(r0)     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La6
            r1 = 32
            boolean r2 = defpackage.vmf.t(r0, r1)     // Catch: java.lang.Throwable -> La6
            if (r2 == 0) goto La8
            r2 = 6
            int r1 = defpackage.vmf.G(r0, r1, r4, r2)     // Catch: java.lang.Throwable -> La6
            int r1 = r1 + r5
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Throwable -> La6
            goto La8
        La6:
            r8 = move-exception
            goto Ldb
        La8:
            boolean r1 = defpackage.vmf.v(r0, r3)     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto Lb6
            int r1 = defpackage.vmf.y(r0)     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = r0.substring(r4, r1)     // Catch: java.lang.Throwable -> La6
        Lb6:
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> La6
            r7.c = r0     // Catch: java.lang.Throwable -> La6
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> La6
            int r8 = r8.a     // Catch: java.lang.Throwable -> La6
            int r8 = r8 * 1000
            long r3 = (long) r8     // Catch: java.lang.Throwable -> La6
            long r1 = r1 + r3
            r7.b = r1     // Catch: java.lang.Throwable -> La6
            monitor-exit(r7)
            return r0
        Lca:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7.b = r1     // Catch: java.lang.Throwable -> La6
            android.net.Uri r8 = r7.c     // Catch: java.lang.Throwable -> La6
            if (r8 != 0) goto Ld6
            goto Ld7
        Ld6:
            r0 = r8
        Ld7:
            monitor-exit(r7)
            return r0
        Ld9:
            monitor-exit(r7)
            goto Ldd
        Ldb:
            monitor-exit(r7)
            throw r8
        Ldd:
            android.net.Uri r8 = r7.c
            if (r8 != 0) goto Le2
            goto Le3
        Le2:
            return r8
        Le3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz4.v(java.lang.String):android.net.Uri");
    }
}
