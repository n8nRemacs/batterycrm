package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hq4 extends wq4 implements Comparable {
    public final boolean A0;
    public final int B0;
    public final int C0;
    public final int D0;
    public final int E0;
    public final boolean F0;
    public final boolean G0;
    public final boolean H0;
    public final boolean X;
    public final String Y;
    public final nq4 Z;
    public final int o;
    public final boolean s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final boolean w0;
    public final boolean x0;
    public final int y0;
    public final int z0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public hq4(int r8, defpackage.lfg r9, int r10, defpackage.nq4 r11, int r12, boolean r13, defpackage.fq4 r14, int r15) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq4.<init>(int, lfg, int, nq4, int, boolean, fq4, int):void");
    }

    @Override // defpackage.wq4
    public final int a() {
        return this.o;
    }

    @Override // defpackage.wq4
    public final boolean c(wq4 wq4Var) {
        int i;
        String str;
        hq4 hq4Var = (hq4) wq4Var;
        hf6 hf6Var = hq4Var.d;
        this.Z.getClass();
        hf6 hf6Var2 = this.d;
        int i2 = hf6Var2.F;
        if (i2 == -1 || i2 != hf6Var.F) {
            return false;
        }
        return (this.w0 || ((str = hf6Var2.n) != null && TextUtils.equals(str, hf6Var.n))) && (i = hf6Var2.G) != -1 && i == hf6Var.G && this.F0 == hq4Var.F0 && this.G0 == hq4Var.G0;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(hq4 hq4Var) {
        boolean z = this.s0;
        boolean z2 = this.X;
        ijb ijbVarB = (z2 && z) ? ar4.k : ar4.k.b();
        boolean z3 = hq4Var.s0;
        int i = hq4Var.D0;
        cj3 cj3VarD = cj3.a.d(z, z3);
        Integer numValueOf = Integer.valueOf(this.u0);
        Integer numValueOf2 = Integer.valueOf(hq4Var.u0);
        yca ycaVar = yca.c;
        cj3 cj3VarC = cj3VarD.c(numValueOf, numValueOf2, ycaVar).a(this.t0, hq4Var.t0).a(this.v0, hq4Var.v0).d(this.A0, hq4Var.A0).d(this.x0, hq4Var.x0).c(Integer.valueOf(this.y0), Integer.valueOf(hq4Var.y0), ycaVar).a(this.z0, hq4Var.z0).d(z2, hq4Var.X).c(Integer.valueOf(this.E0), Integer.valueOf(hq4Var.E0), ycaVar);
        boolean z4 = this.Z.B;
        int i2 = this.D0;
        if (z4) {
            cj3VarC = cj3VarC.c(Integer.valueOf(i2), Integer.valueOf(i), ar4.k.b());
        }
        cj3 cj3VarC2 = cj3VarC.d(this.F0, hq4Var.F0).d(this.G0, hq4Var.G0).d(this.H0, hq4Var.H0).c(Integer.valueOf(this.B0), Integer.valueOf(hq4Var.B0), ijbVarB).c(Integer.valueOf(this.C0), Integer.valueOf(hq4Var.C0), ijbVarB);
        if (Objects.equals(this.Y, hq4Var.Y)) {
            cj3VarC2 = cj3VarC2.c(Integer.valueOf(i2), Integer.valueOf(i), ijbVarB);
        }
        return cj3VarC2.f();
    }
}
