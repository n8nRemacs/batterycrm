package defpackage;

/* loaded from: classes2.dex */
public final class q5b {
    public final bwf a;
    public final bwf b;

    public q5b(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6) {
        this.a = new bwf(new o5b(k18Var, k18Var2, k18Var3, k18Var4, k18Var5, k18Var6, 0));
        this.b = new bwf(new da1(k18Var, k18Var2, k18Var5, 13));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(defpackage.ds4 r8, java.lang.String r9) throws java.lang.InterruptedException {
        /*
            lg8 r0 = defpackage.lg8.d
            java.lang.String r1 = "OneMeInitialDataStorage"
            defpackage.wqi.d(r1, r9)
            vy r2 = r8.n()
            r3 = 0
            byte[] r2 = r2.d()     // Catch: java.lang.Throwable -> L11 java.lang.InterruptedException -> L1d java.util.concurrent.CancellationException -> L1f java.io.FileNotFoundException -> L21
            goto L49
        L11:
            r2 = move-exception
            java.lang.String r4 = r8.p()
            java.lang.String r5 = "load failed"
            defpackage.wqi.e(r4, r5, r2)
        L1b:
            r2 = r3
            goto L49
        L1d:
            r8 = move-exception
            throw r8
        L1f:
            r8 = move-exception
            throw r8
        L21:
            java.lang.String r4 = r8.p()
            l6b r5 = defpackage.wqi.a
            if (r5 != 0) goto L2a
            goto L1b
        L2a:
            boolean r6 = r5.b(r0)
            if (r6 == 0) goto L1b
            java.io.File r2 = r2.c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "file "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = " not found"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.c(r0, r4, r2, r3)
            goto L1b
        L49:
            if (r2 != 0) goto L4d
            r8 = 1
            goto L51
        L4d:
            boolean r8 = r8.r(r2)
        L51:
            l6b r2 = defpackage.wqi.a
            if (r2 != 0) goto L56
            goto L73
        L56:
            boolean r4 = r2.b(r0)
            if (r4 == 0) goto L73
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            java.lang.String r9 = ") finished "
            r4.append(r9)
            r4.append(r8)
            java.lang.String r9 = r4.toString()
            r2.c(r0, r1, r9, r3)
        L73:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q5b.a(ds4, java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r6.i(r0) == r4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.q44 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.p5b
            if (r0 == 0) goto L13
            r0 = r6
            p5b r0 = (defpackage.p5b) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            p5b r0 = new p5b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.o
            int r1 = r0.Y
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.g8j.b(r6)
            goto L6a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            q5b r1 = r0.d
            defpackage.g8j.b(r6)
            goto L56
        L38:
            defpackage.g8j.b(r6)
            java.lang.String r6 = "OneMeInitialDataStorage"
            java.lang.String r1 = "reset"
            defpackage.wqi.d(r6, r1)
            bwf r6 = r5.a
            java.lang.Object r6 = r6.getValue()
            c0a r6 = (defpackage.c0a) r6
            r0.d = r5
            r0.Y = r3
            java.lang.Object r6 = r6.i(r0)
            if (r6 != r4) goto L55
            goto L69
        L55:
            r1 = r5
        L56:
            bwf r6 = r1.b
            java.lang.Object r6 = r6.getValue()
            m0a r6 = (defpackage.m0a) r6
            r1 = 0
            r0.d = r1
            r0.Y = r2
            java.lang.Object r6 = r6.i(r0)
            if (r6 != r4) goto L6a
        L69:
            return r4
        L6a:
            qqg r6 = defpackage.qqg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q5b.b(q44):java.lang.Object");
    }
}
