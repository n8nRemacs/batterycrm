package defpackage;

/* loaded from: classes.dex */
public final class h77 implements cm6 {
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final k18 s0;
    public final bwf t0;

    public h77() {
        k18 k18Var = s1b.a;
        t1b t1bVar = t1b.a;
        bwf bwfVarD = t1bVar.getAccessor().d(0);
        bwf bwfVarD2 = t1bVar.getAccessor().d(75);
        bwf bwfVarD3 = t1bVar.getAccessor().d(8);
        k18 k18Var2 = s1b.a;
        bwf bwfVarD4 = t1bVar.getAccessor().d(177);
        bwf bwfVarD5 = t1bVar.getAccessor().d(142);
        bwf bwfVarD6 = t1bVar.getAccessor().d(48);
        bwf bwfVarD7 = t1bVar.getAccessor().d(139);
        bwf bwfVarD8 = t1bVar.getAccessor().d(12);
        this.a = k18Var2;
        this.b = bwfVarD4;
        this.c = bwfVarD5;
        this.d = bwfVarD;
        this.o = bwfVarD6;
        this.X = bwfVarD3;
        this.Y = bwfVarD7;
        this.Z = bwfVarD2;
        this.s0 = bwfVarD8;
        this.t0 = new bwf(new nq5(19));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.h77 r5, java.lang.String r6, defpackage.q44 r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.g77
            if (r0 == 0) goto L13
            r0 = r7
            g77 r0 = (defpackage.g77) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            g77 r0 = new g77
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.o
            int r7 = r0.Y
            r1 = 1
            if (r7 == 0) goto L38
            if (r7 != r1) goto L30
            uid r6 = r0.d
            defpackage.g8j.b(r5)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L2a java.lang.InterruptedException -> L2d java.lang.Exception -> L7c
            goto L5e
        L27:
            r5 = move-exception
            goto L8d
        L2a:
            r5 = move-exception
            goto L8b
        L2d:
            r5 = move-exception
            goto L8c
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            defpackage.g8j.b(r5)
            uid r5 = new uid
            r5.<init>()
            java.net.Socket r7 = new java.net.Socket     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> L78 java.lang.InterruptedException -> L7a
            r7.<init>()     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> L78 java.lang.InterruptedException -> L7a
            r5.a = r7     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> L78 java.lang.InterruptedException -> L7a
            qn2 r7 = new qn2     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> L78 java.lang.InterruptedException -> L7a
            r2 = 22
            r7.<init>(r6, r2, r5)     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> L78 java.lang.InterruptedException -> L7a
            r0.d = r5     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> L78 java.lang.InterruptedException -> L7a
            r0.Y = r1     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> L78 java.lang.InterruptedException -> L7a
            bd5 r6 = defpackage.bd5.a     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> L78 java.lang.InterruptedException -> L7a
            java.lang.Object r6 = defpackage.vmi.i(r6, r7, r0)     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> L78 java.lang.InterruptedException -> L7a
            g84 r7 = defpackage.g84.a
            if (r6 != r7) goto L5d
            return r7
        L5d:
            r6 = r5
        L5e:
            java.lang.Object r5 = r6.a
            java.net.Socket r5 = (java.net.Socket) r5
            if (r5 == 0) goto L86
            r5.close()
            goto L86
        L68:
            r4 = r6
            r6 = r5
            r5 = r4
            goto L8d
        L6c:
            r6 = r5
            goto L7c
        L6e:
            r4 = r6
            r6 = r5
            r5 = r4
            goto L8b
        L72:
            r4 = r6
            r6 = r5
            r5 = r4
            goto L8c
        L76:
            r6 = move-exception
            goto L68
        L78:
            r6 = move-exception
            goto L6e
        L7a:
            r6 = move-exception
            goto L72
        L7c:
            java.lang.Object r5 = r6.a
            java.net.Socket r5 = (java.net.Socket) r5
            if (r5 == 0) goto L85
            r5.close()
        L85:
            r1 = 0
        L86:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L8b:
            throw r5     // Catch: java.lang.Throwable -> L27
        L8c:
            throw r5     // Catch: java.lang.Throwable -> L27
        L8d:
            java.lang.Object r6 = r6.a
            java.net.Socket r6 = (java.net.Socket) r6
            if (r6 == 0) goto L96
            r6.close()
        L96:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h77.a(h77, java.lang.String, q44):java.lang.Object");
    }

    public final void c() {
        gv4 gv4VarO = ((gu5) ((rt5) this.o.getValue())).o();
        yy7 yy7Var = gv4.c[2];
        if (gv4VarO.a("host_reachability")) {
            ((tih) this.Z.getValue()).c(new wd6(this));
        }
    }

    @Override // defpackage.cm6
    public final /* bridge */ /* synthetic */ Object invoke() {
        c();
        return qqg.a;
    }
}
