package defpackage;

/* loaded from: classes2.dex */
public final class rr0 {
    public final k18 a;
    public final k18 b;
    public final String c = rr0.class.getName();

    public rr0(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public static final Object a(rr0 rr0Var, ir0 ir0Var) {
        Object objI = svi.i(((q2b) ((lzf) rr0Var.b.getValue())).b(), new jr0(rr0Var, null), ir0Var);
        return objI == g84.a ? objI : qqg.a;
    }

    public static final Object b(rr0 rr0Var, long j, sr0 sr0Var, or0 or0Var) {
        Object objI = svi.i(((q2b) ((lzf) rr0Var.b.getValue())).b(), new qr0(sr0Var, rr0Var, j, null), or0Var);
        return objI == g84.a ? objI : qqg.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.q44 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ir0
            if (r0 == 0) goto L13
            r0 = r5
            ir0 r0 = (defpackage.ir0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ir0 r0 = new ir0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            rr0 r0 = r0.d
            defpackage.g8j.b(r5)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L4c
        L27:
            r5 = move-exception
            goto L45
        L29:
            r5 = move-exception
            goto L4f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.g8j.b(r5)
            r0.d = r4     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Throwable -> L43
            r0.Y = r2     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Throwable -> L43
            java.lang.Object r5 = a(r4, r0)     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Throwable -> L43
            g84 r0 = defpackage.g84.a
            if (r5 != r0) goto L4c
            return r0
        L43:
            r5 = move-exception
            r0 = r4
        L45:
            java.lang.String r0 = r0.c
            java.lang.String r1 = "Failed to delete all botCommands"
            defpackage.wqi.e(r0, r1, r5)
        L4c:
            qqg r5 = defpackage.qqg.a
            return r5
        L4f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr0.c(q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(long r5, defpackage.q44 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.mr0
            if (r0 == 0) goto L13
            r0 = r7
            mr0 r0 = (defpackage.mr0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            mr0 r0 = new mr0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.X
            int r1 = r0.Z
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            long r5 = r0.o
            rr0 r0 = r0.d
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            goto L5c
        L2a:
            r7 = move-exception
            goto L66
        L2c:
            r5 = move-exception
            goto L7a
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            defpackage.g8j.b(r7)
            k18 r7 = r4.b     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Throwable -> L64
            java.lang.Object r7 = r7.getValue()     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Throwable -> L64
            lzf r7 = (defpackage.lzf) r7     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Throwable -> L64
            q2b r7 = (defpackage.q2b) r7     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Throwable -> L64
            z74 r7 = r7.b()     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Throwable -> L64
            nr0 r1 = new nr0     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Throwable -> L64
            r1.<init>(r4, r5, r3)     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Throwable -> L64
            r0.d = r4     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Throwable -> L64
            r0.o = r5     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Throwable -> L64
            r0.Z = r2     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Throwable -> L64
            java.lang.Object r7 = defpackage.svi.i(r7, r1, r0)     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Throwable -> L64
            g84 r0 = defpackage.g84.a
            if (r7 != r0) goto L5b
            return r0
        L5b:
            r0 = r4
        L5c:
            boolean r1 = r7 instanceof defpackage.sr0     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            if (r1 == 0) goto L63
            sr0 r7 = (defpackage.sr0) r7     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            return r7
        L63:
            return r3
        L64:
            r7 = move-exception
            r0 = r4
        L66:
            java.lang.String r0 = r0.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to load botCommands, chatId = %d, exception message = "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            defpackage.wqi.b(r0, r5, r7)
            return r3
        L7a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr0.d(long, q44):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r5, defpackage.sr0 r7, defpackage.q44 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.or0
            if (r0 == 0) goto L13
            r0 = r8
            or0 r0 = (defpackage.or0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            or0 r0 = new or0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            rr0 r5 = r0.d
            defpackage.g8j.b(r8)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L4c
        L27:
            r6 = move-exception
            goto L45
        L29:
            r5 = move-exception
            goto L4f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.g8j.b(r8)
            r0.d = r4     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Throwable -> L43
            r0.Y = r2     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Throwable -> L43
            java.lang.Object r5 = b(r4, r5, r7, r0)     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Throwable -> L43
            g84 r6 = defpackage.g84.a
            if (r5 != r6) goto L4c
            return r6
        L43:
            r6 = move-exception
            r5 = r4
        L45:
            java.lang.String r5 = r5.c
            java.lang.String r7 = "Failed to store botCommands"
            defpackage.wqi.e(r5, r7, r6)
        L4c:
            qqg r5 = defpackage.qqg.a
            return r5
        L4f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr0.e(long, sr0, q44):java.lang.Object");
    }
}
