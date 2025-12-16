package defpackage;

/* loaded from: classes.dex */
public final class xq4 extends vq4 {
    public final boolean A0;
    public final int B0;
    public final mq4 X;
    public final boolean Y;
    public final boolean Z;
    public final boolean o;
    public final int s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final boolean w0;
    public final boolean x0;
    public final int y0;
    public final boolean z0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xq4(int r6, defpackage.kfg r7, int r8, defpackage.mq4 r9, int r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xq4.<init>(int, kfg, int, mq4, int, int, boolean):void");
    }

    public static int d(xq4 xq4Var, xq4 xq4Var2) {
        cj3 cj3VarC = cj3.a.d(xq4Var.Z, xq4Var2.Z).a(xq4Var.v0, xq4Var2.v0).d(xq4Var.w0, xq4Var2.w0).d(xq4Var.o, xq4Var2.o).d(xq4Var.Y, xq4Var2.Y).c(Integer.valueOf(xq4Var.u0), Integer.valueOf(xq4Var2.u0), yca.c);
        boolean z = xq4Var.z0;
        cj3 cj3VarD = cj3VarC.d(z, xq4Var2.z0);
        boolean z2 = xq4Var.A0;
        cj3 cj3VarD2 = cj3VarD.d(z2, xq4Var2.A0);
        if (z && z2) {
            cj3VarD2 = cj3VarD2.a(xq4Var.B0, xq4Var2.B0);
        }
        return cj3VarD2.f();
    }

    @Override // defpackage.vq4
    public final int a() {
        return this.y0;
    }

    @Override // defpackage.vq4
    public final boolean c(vq4 vq4Var) {
        xq4 xq4Var = (xq4) vq4Var;
        if (!this.x0 && !xxg.a(this.d.v0, xq4Var.d.v0)) {
            return false;
        }
        if (this.X.N0) {
            return true;
        }
        return this.z0 == xq4Var.z0 && this.A0 == xq4Var.A0;
    }
}
