package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class yq4 extends wq4 {
    public final int A0;
    public final boolean B0;
    public final int C0;
    public final boolean D0;
    public final boolean E0;
    public final int F0;
    public final nq4 X;
    public final boolean Y;
    public final boolean Z;
    public final boolean o;
    public final boolean s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final int x0;
    public final int y0;
    public final boolean z0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yq4(int r7, defpackage.lfg r8, int r9, defpackage.nq4 r10, int r11, java.lang.String r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq4.<init>(int, lfg, int, nq4, int, java.lang.String, int, boolean):void");
    }

    public static int d(yq4 yq4Var, yq4 yq4Var2) {
        cj3 cj3VarD = cj3.a.d(yq4Var.Z, yq4Var2.Z);
        Integer numValueOf = Integer.valueOf(yq4Var.w0);
        Integer numValueOf2 = Integer.valueOf(yq4Var2.w0);
        yca ycaVar = yca.c;
        cj3 cj3VarC = cj3VarD.c(numValueOf, numValueOf2, ycaVar).a(yq4Var.x0, yq4Var2.x0).a(yq4Var.y0, yq4Var2.y0).d(yq4Var.z0, yq4Var2.z0).a(yq4Var.A0, yq4Var2.A0).d(yq4Var.s0, yq4Var2.s0).d(yq4Var.o, yq4Var2.o).d(yq4Var.Y, yq4Var2.Y).c(Integer.valueOf(yq4Var.v0), Integer.valueOf(yq4Var2.v0), ycaVar);
        boolean z = yq4Var.D0;
        cj3 cj3VarD2 = cj3VarC.d(z, yq4Var2.D0);
        boolean z2 = yq4Var.E0;
        cj3 cj3VarD3 = cj3VarD2.d(z2, yq4Var2.E0);
        if (z && z2) {
            cj3VarD3 = cj3VarD3.a(yq4Var.F0, yq4Var2.F0);
        }
        return cj3VarD3.f();
    }

    @Override // defpackage.wq4
    public final int a() {
        return this.C0;
    }

    @Override // defpackage.wq4
    public final boolean c(wq4 wq4Var) {
        yq4 yq4Var = (yq4) wq4Var;
        if (!this.B0 && !Objects.equals(this.d.n, yq4Var.d.n)) {
            return false;
        }
        this.X.getClass();
        return this.D0 == yq4Var.D0 && this.E0 == yq4Var.E0;
    }
}
