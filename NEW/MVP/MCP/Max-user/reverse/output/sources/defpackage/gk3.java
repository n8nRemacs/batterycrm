package defpackage;

/* loaded from: classes2.dex */
public final class gk3 extends xfh {
    public final bwf A0;
    public x9f B0;
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final long[] b;
    public final Long c;
    public final zr6 d;
    public final String o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final tcf w0;
    public final hbd x0;
    public volatile rj3 y0;
    public final ci5 z0;

    public gk3(Long l, long[] jArr) {
        wj3 wj3Var = wj3.a;
        zr6 zr6Var = (zr6) wj3Var.getAccessor().c(453);
        bwf bwfVarD = wj3Var.getAccessor().d(79);
        bwf bwfVarD2 = wj3Var.getAccessor().d(8);
        bwf bwfVarD3 = wj3Var.getAccessor().d(48);
        bwf bwfVarD4 = wj3Var.getAccessor().d(109);
        bwf bwfVarD5 = wj3Var.getAccessor().d(138);
        bwf bwfVarD6 = wj3Var.getAccessor().d(197);
        bwf bwfVarD7 = wj3Var.getAccessor().d(167);
        this.b = jArr;
        this.c = l;
        this.d = zr6Var;
        this.o = gk3.class.getName();
        this.X = bwfVarD;
        this.Y = bwfVarD2;
        this.Z = bwfVarD3;
        this.s0 = bwfVarD4;
        this.t0 = bwfVarD5;
        this.u0 = bwfVarD6;
        this.v0 = bwfVarD7;
        tcf tcfVarA = ucf.a(null);
        this.w0 = tcfVarA;
        this.x0 = new hbd(tcfVarA);
        this.z0 = new ci5(0);
        this.A0 = new bwf(new hk1(18, this));
        xfh.o(this, null, new ck3(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r11 == r5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        if (r11 == r5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum t(defpackage.gk3 r8, java.lang.Long r9, long[] r10, defpackage.q44 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.ak3
            if (r0 == 0) goto L13
            r0 = r11
            ak3 r0 = (defpackage.ak3) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ak3 r0 = new ak3
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.X
            int r1 = r0.Z
            r2 = 2
            r3 = 0
            r4 = 1
            g84 r5 = defpackage.g84.a
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L33
            if (r1 != r2) goto L2b
            defpackage.g8j.b(r11)
            goto L8d
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            long[] r10 = r0.o
            gk3 r8 = r0.d
            defpackage.g8j.b(r11)
            goto L59
        L3b:
            defpackage.g8j.b(r11)
            if (r9 == 0) goto L5c
            long r6 = r9.longValue()
            k18 r9 = r8.s0
            java.lang.Object r9 = r9.getValue()
            w63 r9 = (defpackage.w63) r9
            r0.d = r8
            r0.o = r10
            r0.Z = r4
            java.lang.Object r11 = r9.r(r6, r0)
            if (r11 != r5) goto L59
            goto L8c
        L59:
            pb2 r11 = (defpackage.pb2) r11
            goto L5d
        L5c:
            r11 = r3
        L5d:
            if (r11 == 0) goto L74
            boolean r8 = r11.Q()
            if (r8 == 0) goto L68
            rj3 r8 = defpackage.rj3.d
            return r8
        L68:
            boolean r8 = r11.M()
            if (r8 == 0) goto L71
            rj3 r8 = defpackage.rj3.X
            return r8
        L71:
            rj3 r8 = defpackage.rj3.o
            return r8
        L74:
            long r9 = defpackage.ys.u(r10)
            k18 r8 = r8.s0
            java.lang.Object r8 = r8.getValue()
            w63 r8 = (defpackage.w63) r8
            r0.d = r3
            r0.o = r3
            r0.Z = r2
            java.lang.Object r11 = r8.r(r9, r0)
            if (r11 != r5) goto L8d
        L8c:
            return r5
        L8d:
            pb2 r11 = (defpackage.pb2) r11
            boolean r8 = r11.M()
            if (r8 == 0) goto L98
            rj3 r8 = defpackage.rj3.c
            return r8
        L98:
            boolean r8 = r11.Q()
            if (r8 == 0) goto Lad
            ku3 r8 = r11.n()
            if (r8 == 0) goto Lad
            boolean r8 = r8.v()
            if (r8 != r4) goto Lad
            rj3 r8 = defpackage.rj3.Z
            return r8
        Lad:
            boolean r8 = r11.Q()
            if (r8 == 0) goto Lbc
            ku3 r8 = r11.n()
            if (r8 == 0) goto Lbc
            rj3 r8 = defpackage.rj3.Y
            return r8
        Lbc:
            rj3 r8 = defpackage.rj3.b
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk3.t(gk3, java.lang.Long, long[], q44):java.lang.Enum");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (r2 == r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        if (r2 == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(defpackage.gk3 r18, int r19, defpackage.q44 r20) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk3.u(gk3, int, q44):java.lang.Object");
    }

    public final void v(int i) {
        x9f x9fVar = this.B0;
        if (x9fVar == null || !x9fVar.isActive()) {
            this.B0 = xfh.o(this, bia.a, new dk3(this, i, null), 2);
        } else {
            wqi.c(this.o, "We already process complain", new Object[0]);
        }
    }
}
