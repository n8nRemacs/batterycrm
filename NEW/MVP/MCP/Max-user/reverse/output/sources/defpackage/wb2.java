package defpackage;

/* loaded from: classes2.dex */
public final class wb2 extends io4 {
    public final long e;
    public final k18 f;
    public final k18 g;

    public wb2(long j, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6) {
        super(k18Var3, k18Var4, k18Var5, k18Var6);
        this.e = j;
        this.f = k18Var;
        this.g = k18Var2;
    }

    @Override // defpackage.io4
    public final s5g c(ku3 ku3Var) {
        String strE;
        pb2 pb2VarG = g();
        Long lE = pb2VarG != null ? pb2VarG.e(ku3Var.p()) : null;
        if (ku3Var.X) {
            return new n5g(x8b.p2);
        }
        long jS = ((w4e) b()).s();
        if (lE != null && lE.longValue() == jS) {
            return new n5g(x8b.X);
        }
        pb2 pb2VarG2 = g();
        if (pb2VarG2 != null && pb2VarG2.d0(ku3Var.p())) {
            pb2 pb2VarG3 = g();
            return new n5g((pb2VarG3 == null || !pb2VarG3.M()) ? x8b.s2 : x8b.r2);
        }
        if (lE == null) {
            return super.c(ku3Var);
        }
        ku3 ku3Var2 = (ku3) ((l24) this.g.getValue()).c(lE.longValue()).a.getValue();
        return (ku3Var2 == null || (strE = ku3Var2.e()) == null) ? super.c(ku3Var) : new p5g(x8b.W, ys.D(new Object[]{strE}));
    }

    @Override // defpackage.io4
    public final boolean e(ku3 ku3Var) {
        pb2 pb2VarG;
        boolean z = ku3Var.p() != ((w4e) b()).s();
        pb2 pb2VarG2 = g();
        boolean z2 = (pb2VarG2 == null || pb2VarG2.d0(ku3Var.p())) ? false : true;
        pb2 pb2VarG3 = g();
        boolean z3 = pb2VarG3 != null && ppi.d(pb2VarG3.g(((w4e) b()).s()), 4) && (pb2VarG = g()) != null && pb2VarG.H(ku3Var.p());
        pb2 pb2VarG4 = g();
        return z2 && z && (z3 || !(pb2VarG4 != null && pb2VarG4.H(ku3Var.p())));
    }

    @Override // defpackage.io4
    public final lc9 f(ku3 ku3Var) {
        lc9 lc9VarF = super.f(ku3Var);
        pb2 pb2VarG = g();
        boolean z = false;
        if (pb2VarG != null && pb2VarG.d0(ku3Var.p())) {
            z = true;
        }
        return lc9.l(lc9VarF, z);
    }

    public final pb2 g() {
        return (pb2) ((w63) this.f.getValue()).j(this.e).a.getValue();
    }
}
