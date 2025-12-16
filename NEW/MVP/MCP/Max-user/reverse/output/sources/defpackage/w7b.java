package defpackage;

/* loaded from: classes.dex */
public final class w7b {
    public final k18 a;

    public w7b(k18 k18Var) {
        this.a = k18Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable a(java.lang.String r6, defpackage.rp7 r7, defpackage.q44 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.img
            if (r0 == 0) goto L13
            r0 = r8
            img r0 = (defpackage.img) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            img r0 = new img
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.d
            int r1 = r0.X
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.g8j.b(r8)     // Catch: java.lang.Throwable -> L28
            goto L59
        L28:
            r6 = move-exception
            goto L90
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.g8j.b(r8)     // Catch: java.lang.Throwable -> L28
            goto L86
        L36:
            defpackage.g8j.b(r8)
            int r7 = r7.ordinal()     // Catch: java.lang.Throwable -> L28
            k18 r8 = r5.a
            g84 r1 = defpackage.g84.a
            if (r7 == 0) goto L64
            if (r7 != r3) goto L5e
            java.lang.Object r6 = r8.getValue()     // Catch: java.lang.Throwable -> L28
            hwa r6 = (defpackage.hwa) r6     // Catch: java.lang.Throwable -> L28
            zf8 r7 = new zf8     // Catch: java.lang.Throwable -> L28
            r7.<init>(r3, r2)     // Catch: java.lang.Throwable -> L28
            r0.X = r2     // Catch: java.lang.Throwable -> L28
            java.lang.Object r8 = r6.F(r7, r0)     // Catch: java.lang.Throwable -> L28
            if (r8 != r1) goto L59
            goto L85
        L59:
            eld r8 = (defpackage.eld) r8     // Catch: java.lang.Throwable -> L28
            long r6 = r8.c     // Catch: java.lang.Throwable -> L28
            goto L8a
        L5e:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L28
            r6.<init>()     // Catch: java.lang.Throwable -> L28
            throw r6     // Catch: java.lang.Throwable -> L28
        L64:
            java.lang.Object r7 = r8.getValue()     // Catch: java.lang.Throwable -> L28
            hwa r7 = (defpackage.hwa) r7     // Catch: java.lang.Throwable -> L28
            wua r8 = new wua     // Catch: java.lang.Throwable -> L28
            xhb r2 = defpackage.xhb.F0     // Catch: java.lang.Throwable -> L28
            r4 = 14
            r8.<init>(r2, r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "trackId"
            r8.x(r2, r6)     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = "delete"
            r8.i(r6, r3)     // Catch: java.lang.Throwable -> L28
            r0.X = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r8 = r7.F(r8, r0)     // Catch: java.lang.Throwable -> L28
            if (r8 != r1) goto L86
        L85:
            return r1
        L86:
            s70 r8 = (defpackage.s70) r8     // Catch: java.lang.Throwable -> L28
            long r6 = r8.c     // Catch: java.lang.Throwable -> L28
        L8a:
            java.lang.Long r8 = new java.lang.Long     // Catch: java.lang.Throwable -> L28
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L28
            return r8
        L90:
            ipd r7 = new ipd
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w7b.a(java.lang.String, rp7, q44):java.io.Serializable");
    }

    public w7b() {
        this.a = ykg.a.a();
    }
}
