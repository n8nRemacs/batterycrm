package defpackage;

/* loaded from: classes.dex */
public abstract class wk5 extends tk0 {
    public long C0;
    public zwd D0;
    public sk4 E0;
    public boolean F0;
    public hf6 G0;
    public hf6 H0;
    public final v32 I0;
    public final zt J0;
    public final ph4 K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;

    public wk5(int i, v32 v32Var, zt ztVar) {
        super(i);
        this.I0 = v32Var;
        this.J0 = ztVar;
        this.K0 = new ph4(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B() throws androidx.media3.transformer.ExportException {
        /*
            r4 = this;
            zwd r0 = r4.D0
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            hf6 r0 = r4.H0
            r2 = 0
            if (r0 != 0) goto L32
            sk4 r0 = r4.E0
            if (r0 == 0) goto L2a
            hf6 r0 = r4.G0
            java.lang.String r0 = r0.n
            int r0 = defpackage.tfi.e(r0)
            if (r0 != r1) goto L2a
            sk4 r0 = r4.E0
            r0.g(r2)
            hf6 r0 = r0.j
            if (r0 != 0) goto L23
            goto L3c
        L23:
            hf6 r0 = r4.H(r0)
            r4.H0 = r0
            goto L32
        L2a:
            hf6 r0 = r4.G0
            hf6 r0 = r4.H(r0)
            r4.H0 = r0
        L32:
            zt r0 = r4.J0
            hf6 r3 = r4.H0
            zwd r0 = r0.b(r3)
            if (r0 != 0) goto L3d
        L3c:
            return r2
        L3d:
            r4.D0 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk5.B():boolean");
    }

    public abstract boolean C();

    public abstract void D(hf6 hf6Var);

    public void E(ph4 ph4Var) {
    }

    public void F(hf6 hf6Var) {
    }

    public hf6 G(hf6 hf6Var) {
        return hf6Var;
    }

    public hf6 H(hf6 hf6Var) {
        return hf6Var;
    }

    public final boolean I(ph4 ph4Var) {
        xt4 xt4Var = this.c;
        xt4Var.clear();
        int iV = v(xt4Var, ph4Var, 0);
        if (iV == -5) {
            throw new IllegalStateException("Format changes are not supported.");
        }
        if (iV != -4) {
            return false;
        }
        ph4Var.z();
        if (ph4Var.j(4)) {
            return true;
        }
        this.I0.h0(this.b, ph4Var.Y);
        return true;
    }

    public final boolean K() {
        hf6 hf6Var = this.G0;
        if (hf6Var == null || this.M0) {
            if (hf6Var == null) {
                xt4 xt4Var = this.c;
                xt4Var.clear();
                if (v(xt4Var, this.K0, 2) == -5) {
                    hf6 hf6Var2 = (hf6) xt4Var.c;
                    hf6Var2.getClass();
                    hf6 hf6VarG = G(hf6Var2);
                    this.G0 = hf6VarG;
                    F(hf6VarG);
                    this.M0 = this.J0.e(3, this.G0);
                }
                return false;
            }
            if (this.M0) {
                if (tfi.e(this.G0.n) != 2 || B()) {
                    D(this.G0);
                    this.M0 = false;
                }
                return false;
            }
        }
        return true;
    }

    public abstract boolean L(ph4 ph4Var);

    @Override // defpackage.tk0
    public final fw8 g() {
        return this.I0;
    }

    @Override // defpackage.tk0
    public final boolean j() {
        return this.F0;
    }

    @Override // defpackage.tk0
    public final boolean l() {
        return true;
    }

    @Override // defpackage.tk0
    public final void n(boolean z, boolean z2) {
        this.I0.h0(this.b, 0L);
    }

    @Override // defpackage.tk0
    public final void q() {
        sk4 sk4Var = this.E0;
        if (sk4Var != null) {
            sk4Var.i();
        }
    }

    @Override // defpackage.tk0
    public final void s() {
        this.L0 = true;
    }

    @Override // defpackage.tk0
    public final void t() {
        this.L0 = false;
    }

    @Override // defpackage.tk0
    public final void u(hf6[] hf6VarArr, long j, long j2, d99 d99Var) {
        this.C0 = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080 A[Catch: ExportException -> 0x0021, TRY_LEAVE, TryCatch #0 {ExportException -> 0x0021, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:10:0x0011, B:12:0x0016, B:14:0x001c, B:18:0x0025, B:28:0x0049, B:21:0x0031, B:24:0x0038, B:27:0x0040, B:31:0x004d, B:33:0x0053, B:36:0x005d, B:38:0x0061, B:41:0x0068, B:44:0x0070, B:45:0x0072, B:48:0x0080), top: B:55:0x0001 }] */
    @Override // defpackage.tk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(long r2, long r4) throws android.media.MediaCodec.CryptoException {
        /*
            r1 = this;
            r2 = 0
            boolean r3 = r1.L0     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r3 == 0) goto L89
            boolean r3 = r1.F0     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r3 != 0) goto L89
            boolean r3 = r1.K()     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r3 != 0) goto L11
            goto L89
        L11:
            sk4 r3 = r1.E0     // Catch: androidx.media3.transformer.ExportException -> L21
            r4 = 1
            if (r3 == 0) goto L4d
        L16:
            boolean r3 = r1.B()     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r3 == 0) goto L24
            boolean r3 = r1.C()     // Catch: androidx.media3.transformer.ExportException -> L21
            goto L25
        L21:
            r3 = move-exception
            goto L8a
        L24:
            r3 = r2
        L25:
            sk4 r5 = r1.E0     // Catch: androidx.media3.transformer.ExportException -> L21
            ph4 r0 = r1.K0     // Catch: androidx.media3.transformer.ExportException -> L21
            boolean r5 = r5.f(r0)     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r5 != 0) goto L31
        L2f:
            r5 = r2
            goto L49
        L31:
            boolean r5 = r1.I(r0)     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r5 != 0) goto L38
            goto L2f
        L38:
            boolean r5 = r1.L(r0)     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r5 == 0) goto L40
        L3e:
            r5 = r4
            goto L49
        L40:
            r1.E(r0)     // Catch: androidx.media3.transformer.ExportException -> L21
            sk4 r5 = r1.E0     // Catch: androidx.media3.transformer.ExportException -> L21
            r5.h(r0)     // Catch: androidx.media3.transformer.ExportException -> L21
            goto L3e
        L49:
            r3 = r3 | r5
            if (r3 != 0) goto L16
            goto L89
        L4d:
            boolean r3 = r1.B()     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r3 == 0) goto L89
        L53:
            zwd r3 = r1.D0     // Catch: androidx.media3.transformer.ExportException -> L21
            ph4 r3 = r3.e()     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r3 != 0) goto L5d
        L5b:
            r3 = r2
            goto L86
        L5d:
            boolean r5 = r1.N0     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r5 != 0) goto L72
            boolean r5 = r1.I(r3)     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r5 != 0) goto L68
            goto L5b
        L68:
            boolean r5 = r1.L(r3)     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r5 == 0) goto L70
            r3 = r4
            goto L86
        L70:
            r1.N0 = r4     // Catch: androidx.media3.transformer.ExportException -> L21
        L72:
            r5 = 4
            boolean r3 = r3.j(r5)     // Catch: androidx.media3.transformer.ExportException -> L21
            zwd r5 = r1.D0     // Catch: androidx.media3.transformer.ExportException -> L21
            boolean r5 = r5.g()     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r5 != 0) goto L80
            goto L5b
        L80:
            r1.N0 = r2     // Catch: androidx.media3.transformer.ExportException -> L21
            r1.F0 = r3     // Catch: androidx.media3.transformer.ExportException -> L21
            r3 = r3 ^ 1
        L86:
            if (r3 == 0) goto L89
            goto L53
        L89:
            return
        L8a:
            r1.L0 = r2
            zt r2 = r1.J0
            r2.c(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk5.w(long, long):void");
    }

    @Override // defpackage.tk0
    public final int z(hf6 hf6Var) {
        return tk0.b(xz9.h(hf6Var.n) == this.b ? 4 : 0, 0, 0, 0);
    }
}
