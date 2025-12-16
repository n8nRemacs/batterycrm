package defpackage;

/* loaded from: classes.dex */
public final class hv7 implements z26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z26 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hv7(z26 z26Var, Object obj, int i) {
        this.a = i;
        this.b = z26Var;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            hkf r0 = (defpackage.hkf) r0
            boolean r1 = r9 instanceof defpackage.zjf
            if (r1 == 0) goto L17
            r1 = r9
            zjf r1 = (defpackage.zjf) r1
            int r2 = r1.o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.o = r2
            goto L1c
        L17:
            zjf r1 = new zjf
            r1.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r1.d
            int r2 = r1.o
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.g8j.b(r9)
            goto L75
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.g8j.b(r9)
            imb r8 = (defpackage.imb) r8
            java.lang.Object r9 = r8.a
            sff r9 = (defpackage.sff) r9
            java.lang.Object r8 = r8.b
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            sjf r2 = new sjf
            java.lang.String r4 = r9.b
            if (r4 != 0) goto L46
            java.lang.String r4 = ""
        L46:
            r5g r5 = new r5g
            r5.<init>(r4)
            java.util.List r4 = r9.h
            if (r4 == 0) goto L54
            int r4 = r4.size()
            goto L55
        L54:
            r4 = 0
        L55:
            yy7[] r6 = defpackage.hkf.A0
            java.lang.String r4 = r0.v(r4)
            java.lang.String r9 = r9.g
            boolean r8 = r8.booleanValue()
            o98 r8 = r0.t(r8)
            r2.<init>(r5, r4, r9, r8)
            r1.o = r3
            z26 r8 = r7.b
            java.lang.Object r8 = r8.a(r2, r1)
            g84 r9 = defpackage.g84.a
            if (r8 != r9) goto L75
            return r9
        L75:
            qqg r8 = defpackage.qqg.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv7.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.xsf
            if (r0 == 0) goto L13
            r0 = r7
            xsf r0 = (defpackage.xsf) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            xsf r0 = new xsf
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.o
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r7)
            goto L7a
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            defpackage.g8j.b(r7)
            k2h r6 = (defpackage.k2h) r6
            java.lang.Object r7 = r5.c
            um9 r7 = (defpackage.um9) r7
            wo8 r7 = r7.a()
            java.lang.String r1 = r6.d
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L4a
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L4a
            long r3 = r3.lastModified()     // Catch: java.lang.Throwable -> L4a
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L4a
            goto L51
        L4a:
            r1 = move-exception
            ipd r3 = new ipd
            r3.<init>(r1)
            r1 = r3
        L51:
            r3 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r4 = r1 instanceof defpackage.ipd
            if (r4 == 0) goto L5c
            r1 = r3
        L5c:
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
            r7.a = r3
            java.lang.String r6 = r6.d
            r7.b = r6
            um9 r6 = new um9
            r6.<init>(r7)
            r0.o = r2
            z26 r7 = r5.b
            java.lang.Object r6 = r7.a(r6, r0)
            g84 r7 = defpackage.g84.a
            if (r6 != r7) goto L7a
            return r7
        L7a:
            qqg r6 = defpackage.qqg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv7.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv7.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r9 == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r1.a(r3, r0) != r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cuf
            if (r0 == 0) goto L13
            r0 = r9
            cuf r0 = (defpackage.cuf) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            cuf r0 = new cuf
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.d
            int r1 = r0.o
            r2 = 2
            r3 = 1
            r4 = 0
            g84 r5 = defpackage.g84.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            defpackage.g8j.b(r9)
            goto L8d
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            ttg r8 = r0.Z
            z26 r1 = r0.X
            defpackage.g8j.b(r9)
            goto L73
        L3b:
            defpackage.g8j.b(r9)
            ttg r8 = (defpackage.ttg) r8
            bug r9 = r8.a
            wvg r9 = r9.c
            boolean r9 = r9.c()
            z26 r1 = r7.b
            if (r9 == 0) goto L7b
            boolean r9 = r8.a()
            if (r9 == 0) goto L7b
            java.lang.Object r9 = r7.c
            duf r9 = (defpackage.duf) r9
            k18 r9 = r9.e
            java.lang.Object r9 = r9.getValue()
            wef r9 = (defpackage.wef) r9
            tvg r6 = r8.h
            java.lang.String r6 = r6.a
            m76 r9 = r9.a(r6)
            r0.X = r1
            r0.Z = r8
            r0.o = r3
            java.lang.Object r9 = defpackage.n8j.b(r9, r0)
            if (r9 != r5) goto L73
            goto L8c
        L73:
            jef r9 = (defpackage.jef) r9
            xm9 r3 = new xm9
            r3.<init>(r8, r9)
            goto L80
        L7b:
            xm9 r3 = new xm9
            r3.<init>(r8, r4)
        L80:
            r0.X = r4
            r0.Z = r4
            r0.o = r2
            java.lang.Object r8 = r1.a(r3, r0)
            if (r8 != r5) goto L8d
        L8c:
            return r5
        L8d:
            qqg r8 = defpackage.qqg.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv7.j(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object k(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.f6g
            if (r0 == 0) goto L13
            r0 = r6
            f6g r0 = (defpackage.f6g) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            f6g r0 = new f6g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.d
            int r1 = r0.o
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r6)
            goto L5e
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.g8j.b(r6)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            java.lang.Object r6 = r4.c
            g6g r6 = (defpackage.g6g) r6
            android.widget.TextView r6 = r6.b
            r6.getContext()
            android.content.res.Resources r6 = defpackage.vw4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            r1 = 2
            float r5 = android.util.TypedValue.applyDimension(r1, r5, r6)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            r0.o = r2
            z26 r5 = r4.b
            java.lang.Object r5 = r5.a(r6, r0)
            g84 r6 = defpackage.g84.a
            if (r5 != r6) goto L5e
            return r6
        L5e:
            qqg r5 = defpackage.qqg.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv7.k(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        if (r1.a(r6, r0) == r5) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.z6h
            if (r0 == 0) goto L13
            r0 = r10
            z6h r0 = (defpackage.z6h) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            z6h r0 = new z6h
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d
            int r1 = r0.o
            r2 = 2
            r3 = 1
            r4 = 0
            g84 r5 = defpackage.g84.a
            if (r1 == 0) goto L40
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            defpackage.g8j.b(r10)
            goto L9e
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            n9a r9 = r0.t0
            z26 r1 = r0.s0
            java.lang.Object r6 = r0.Y
            hv7 r7 = r0.X
            defpackage.g8j.b(r10)
            goto L62
        L40:
            defpackage.g8j.b(r10)
            r10 = r9
            qqg r10 = (defpackage.qqg) r10
            java.lang.Object r10 = r8.c
            k7h r10 = (defpackage.k7h) r10
            n9a r10 = r10.f
            r0.X = r8
            r0.Y = r9
            z26 r1 = r8.b
            r0.s0 = r1
            r0.t0 = r10
            r0.o = r3
            java.lang.Object r6 = r10.e(r4, r0)
            if (r6 != r5) goto L5f
            goto L9d
        L5f:
            r7 = r8
            r6 = r9
            r9 = r10
        L62:
            java.lang.Object r10 = r7.c     // Catch: java.lang.Throwable -> L71
            k7h r10 = (defpackage.k7h) r10     // Catch: java.lang.Throwable -> L71
            js r10 = r10.g     // Catch: java.lang.Throwable -> L71
            if (r10 == 0) goto L73
            boolean r7 = r10.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r7 == 0) goto L73
            goto L88
        L71:
            r10 = move-exception
            goto La1
        L73:
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L71
        L77:
            boolean r7 = r10.hasNext()     // Catch: java.lang.Throwable -> L71
            if (r7 == 0) goto L88
            java.lang.Object r7 = r10.next()     // Catch: java.lang.Throwable -> L71
            y6h r7 = (defpackage.y6h) r7     // Catch: java.lang.Throwable -> L71
            boolean r7 = r7.b     // Catch: java.lang.Throwable -> L71
            if (r7 != 0) goto L77
            r3 = 0
        L88:
            r9.g(r4)
            if (r3 == 0) goto L9e
            r0.X = r4
            r0.Y = r4
            r0.s0 = r4
            r0.t0 = r4
            r0.o = r2
            java.lang.Object r9 = r1.a(r6, r0)
            if (r9 != r5) goto L9e
        L9d:
            return r5
        L9e:
            qqg r9 = defpackage.qqg.a
            return r9
        La1:
            r9.g(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv7.l(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0a2a  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0a50  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:659:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:664:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:673:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v20, types: [z26] */
    /* JADX WARN: Type inference failed for: r2v75, types: [z26] */
    @Override // defpackage.z26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instructions count: 2860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv7.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(int r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.bcf
            if (r0 == 0) goto L13
            r0 = r6
            bcf r0 = (defpackage.bcf) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            bcf r0 = new bcf
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.d
            int r1 = r0.X
            qqg r2 = defpackage.qqg.a
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 != r3) goto L27
            defpackage.g8j.b(r6)
            return r2
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.g8j.b(r6)
            if (r5 <= 0) goto L4d
            java.lang.Object r5 = r4.c
            rid r5 = (defpackage.rid) r5
            boolean r6 = r5.a
            if (r6 != 0) goto L4d
            r5.a = r3
            r0.X = r3
            z26 r5 = r4.b
            xve r6 = defpackage.xve.a
            java.lang.Object r5 = r5.a(r6, r0)
            g84 r6 = defpackage.g84.a
            if (r5 != r6) goto L4d
            return r6
        L4d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv7.b(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public hv7(rid ridVar, z26 z26Var) {
        this.a = 21;
        this.c = ridVar;
        this.b = z26Var;
    }
}
