package defpackage;

/* loaded from: classes2.dex */
public final class g9 extends io4 {
    public final /* synthetic */ int e;
    public final long f;
    public final k18 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g9(long j, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, int i) {
        super(k18Var2, k18Var3, k18Var4, k18Var5);
        this.e = i;
        this.f = j;
        this.g = k18Var;
    }

    @Override // defpackage.io4
    public s5g a(ku3 ku3Var) {
        switch (this.e) {
            case 1:
                pb2 pb2VarG = g();
                if (pb2VarG == null) {
                    return null;
                }
                long jP = ku3Var.p();
                String str = (pb2VarG.F() && pb2VarG.H(jP)) ? ((ze2) pb2VarG.b.R.get(Long.valueOf(jP))).d : null;
                if (str != null && !vmf.F(str)) {
                    return new r5g(str);
                }
                if (pb2VarG.d0(ku3Var.p())) {
                    return new n5g(x8b.q2);
                }
                if (pb2VarG.H(ku3Var.p())) {
                    return new n5g(x8b.d2);
                }
                return null;
            default:
                return super.a(ku3Var);
        }
    }

    @Override // defpackage.io4
    public s5g c(ku3 ku3Var) {
        switch (this.e) {
            case 0:
                if (!ku3Var.X) {
                    pb2 pb2Var = (pb2) ((w63) this.g.getValue()).j(this.f).a.getValue();
                    if (pb2Var != null && pb2Var.H(ku3Var.p())) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return super.c(ku3Var);
    }

    @Override // defpackage.io4
    public boolean d(ku3 ku3Var) {
        pb2 pb2Var;
        switch (this.e) {
            case 0:
                return !ku3Var.X && ((pb2Var = (pb2) ((w63) this.g.getValue()).j(this.f).a.getValue()) == null || !pb2Var.H(ku3Var.p()));
            default:
                return super.d(ku3Var);
        }
    }

    @Override // defpackage.io4
    public boolean e(ku3 ku3Var) {
        pb2 pb2VarG;
        switch (this.e) {
            case 1:
                boolean z = ku3Var.p() != ((w4e) b()).s();
                pb2 pb2VarG2 = g();
                boolean z2 = (pb2VarG2 == null || pb2VarG2.d0(ku3Var.p())) ? false : true;
                pb2 pb2VarG3 = g();
                boolean z3 = pb2VarG3 != null && ppi.d(pb2VarG3.g(((w4e) b()).s()), 4) && (pb2VarG = g()) != null && pb2VarG.H(ku3Var.p());
                pb2 pb2VarG4 = g();
                boolean z4 = pb2VarG4 != null && pb2VarG4.H(ku3Var.p());
                if (z2 && z) {
                    return z3 || !z4;
                }
                return false;
            default:
                return super.e(ku3Var);
        }
    }

    @Override // defpackage.io4
    public lc9 f(ku3 ku3Var) {
        switch (this.e) {
            case 1:
                lc9 lc9VarF = super.f(ku3Var);
                pb2 pb2VarG = g();
                boolean z = false;
                if (pb2VarG != null && pb2VarG.d0(ku3Var.p())) {
                    z = true;
                }
                return lc9.l(lc9VarF, z);
            default:
                return super.f(ku3Var);
        }
    }

    public pb2 g() {
        return (pb2) ((w63) this.g.getValue()).j(this.f).a.getValue();
    }
}
