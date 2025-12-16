package defpackage;

/* loaded from: classes2.dex */
public final class wr7 extends xfh implements mr3 {
    public final hbd A0;
    public x9f B0;
    public final tcf C0;
    public final hbd D0;
    public final t9f E0;
    public final t9f F0;
    public final t9f G0;
    public final yid H0;
    public int I0;
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final /* synthetic */ agh b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final ci5 v0;
    public final ci5 w0;
    public final jve x0;
    public final u92 y0;
    public final tcf z0;
    public static final /* synthetic */ yy7[] K0 = {new z8a(wr7.class, "findContactByPhoneJob", "getFindContactByPhoneJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, wr7.class, "jobPhoneValidation", "getJobPhoneValidation()Lkotlinx/coroutines/Job;"), new z8a(wr7.class, "showInviteDialogJob", "getShowInviteDialogJob()Lkotlinx/coroutines/Job;")};
    public static final q85 J0 = new q85(22);

    public wr7() {
        vq7 vq7Var = vq7.a;
        bwf bwfVarD = vq7Var.getAccessor().d(485);
        bwf bwfVarD2 = vq7Var.getAccessor().d(108);
        bwf bwfVarD3 = vq7Var.getAccessor().d(481);
        bwf bwfVarD4 = vq7Var.getAccessor().d(109);
        bwf bwfVarD5 = vq7Var.getAccessor().d(110);
        bwf bwfVarD6 = vq7Var.getAccessor().d(139);
        bwf bwfVarD7 = vq7Var.getAccessor().d(8);
        bwf bwfVarD8 = vq7Var.getAccessor().d(46);
        bwf bwfVarD9 = vq7Var.getAccessor().d(12);
        bwf bwfVarD10 = vq7Var.getAccessor().d(84);
        bwf bwfVarD11 = vq7Var.getAccessor().d(479);
        agh aghVar = new agh(bwfVarD6, new wm7(6));
        this.b = aghVar;
        this.c = bwfVarD;
        this.d = bwfVarD2;
        this.o = bwfVarD4;
        this.X = bwfVarD5;
        this.Y = bwfVarD7;
        this.Z = bwfVarD8;
        this.s0 = bwfVarD9;
        this.t0 = bwfVarD10;
        this.u0 = bwfVarD11;
        this.v0 = new ci5(0);
        this.w0 = new ci5(0);
        jve jveVarB = kve.b(0, 0, 7);
        this.x0 = jveVarB;
        this.y0 = gw0.y(jveVarB, new d53(aghVar.d, 12));
        tcf tcfVarA = ucf.a(hd5.a);
        this.z0 = tcfVarA;
        this.A0 = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(y2b.a);
        this.C0 = tcfVarA2;
        this.D0 = gw0.C(new fe1(tcfVarA2, this, bwfVarD7, bwfVarD3, 3), this.a, yve.a, new a94((x2b) tcfVarA2.getValue(), Integer.MAX_VALUE, new n5g(u5b.i)));
        this.E0 = c7j.c();
        this.F0 = c7j.c();
        this.G0 = c7j.c();
        this.H0 = new yid("[^0-9+]");
        this.I0 = Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r9 == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        if (r7.a(r8, r0) == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.wr7 r6, java.lang.String r7, java.lang.String r8, defpackage.q44 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.mr7
            if (r0 == 0) goto L13
            r0 = r9
            mr7 r0 = (defpackage.mr7) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            mr7 r0 = new mr7
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.o
            int r1 = r0.Y
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r6 = r0.d
            s5g r6 = (defpackage.s5g) r6
            defpackage.g8j.b(r9)
            goto L95
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            java.lang.Object r6 = r0.d
            wr7 r6 = (defpackage.wr7) r6
            defpackage.g8j.b(r9)
            goto L6d
        L3f:
            defpackage.g8j.b(r9)
            int r8 = r8.length()
            if (r8 != 0) goto L52
            int r7 = defpackage.avd.j0
            n5g r8 = new n5g
            r8.<init>(r7)
        L4f:
            r7 = r6
            r6 = r8
            goto L81
        L52:
            int r8 = r7.length()
            int r9 = r6.I0
            if (r8 <= r9) goto L62
            int r7 = defpackage.avd.k0
            n5g r8 = new n5g
            r8.<init>(r7)
            goto L4f
        L62:
            r0.d = r6
            r0.Y = r3
            java.lang.Object r9 = u(r7, r6, r0)
            if (r9 != r4) goto L6d
            goto L94
        L6d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            if (r7 == 0) goto L7d
            int r7 = defpackage.u5b.d
            n5g r8 = new n5g
            r8.<init>(r7)
            goto L4f
        L7d:
            r7 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L81:
            if (r6 == 0) goto L95
            jve r7 = r7.x0
            zq7 r8 = new zq7
            r8.<init>(r6)
            r0.d = r6
            r0.Y = r2
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r4) goto L95
        L94:
            return r4
        L95:
            if (r6 != 0) goto L98
            goto L99
        L98:
            r3 = 0
        L99:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr7.t(wr7, java.lang.String, java.lang.String, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(java.lang.String r7, defpackage.wr7 r8, defpackage.q44 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.nr7
            if (r0 == 0) goto L13
            r0 = r9
            nr7 r0 = (defpackage.nr7) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            nr7 r0 = new nr7
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.o
            int r1 = r0.X
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L28
            java.lang.Long r7 = r0.d
            defpackage.g8j.b(r9)
            goto L7c
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            defpackage.g8j.b(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r1 = r7.length()
            r4 = r2
        L3d:
            if (r4 >= r1) goto L51
            char r5 = r7.charAt(r4)
            char r5 = (char) r5
            char r6 = (char) r5
            boolean r6 = java.lang.Character.isDigit(r6)
            if (r6 == 0) goto L4e
            r9.append(r5)
        L4e:
            int r4 = r4 + 1
            goto L3d
        L51:
            java.lang.String r7 = r9.toString()
            java.lang.Long r7 = defpackage.cnf.i(r7)
            k18 r9 = r8.X
            java.lang.Object r9 = r9.getValue()
            klc r9 = (defpackage.klc) r9
            k18 r8 = r8.Z
            java.lang.Object r8 = r8.getValue()
            pb3 r8 = (defpackage.pb3) r8
            w4e r8 = (defpackage.w4e) r8
            long r4 = r8.s()
            r0.d = r7
            r0.X = r3
            java.lang.Object r9 = r9.a(r4, r0)
            g84 r8 = defpackage.g84.a
            if (r9 != r8) goto L7c
            return r8
        L7c:
            xac r9 = (defpackage.xac) r9
            ku3 r8 = r9.d
            long r8 = r8.q()
            if (r7 != 0) goto L87
            goto L90
        L87:
            long r0 = r7.longValue()
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L90
            r2 = r3
        L90:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr7.u(java.lang.String, wr7, q44):java.lang.Object");
    }

    @Override // defpackage.mr3
    public final gbd i() {
        return this.b.d;
    }

    @Override // defpackage.xfh
    public final void s() {
        yy7[] yy7VarArr = K0;
        yy7 yy7Var = yy7VarArr[0];
        t9f t9fVar = this.E0;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[0], null);
        yy7 yy7Var2 = yy7VarArr[1];
        t9f t9fVar2 = this.F0;
        qt7 qt7Var2 = (qt7) t9fVar2.D(this, yy7Var2);
        if (qt7Var2 != null) {
            qt7Var2.cancel(null);
        }
        t9fVar2.O(this, yy7VarArr[1], null);
        yy7 yy7Var3 = yy7VarArr[2];
        t9f t9fVar3 = this.G0;
        qt7 qt7Var3 = (qt7) t9fVar3.D(this, yy7Var3);
        if (qt7Var3 != null) {
            qt7Var3.cancel(null);
        }
        t9fVar3.O(this, yy7VarArr[2], null);
    }
}
