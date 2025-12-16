package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public class io4 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;

    public io4(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var4;
        this.d = k18Var3;
    }

    public s5g a(ku3 ku3Var) {
        return null;
    }

    public final pb3 b() {
        return (pb3) this.b.getValue();
    }

    public s5g c(ku3 ku3Var) {
        return ku3Var.p() == ((w4e) b()).s() ? new n5g(fvd.L) : (ku3Var.v() && ku3Var.A()) ? new n5g(mvd.R1) : ku3Var.y((rt5) this.c.getValue()) ? new n5g(mvd.C) : ku3Var.v() ? new n5g(mvd.n) : new r5g(((h8c) ((i8c) this.d.getValue()).a.getValue()).b(ku3Var));
    }

    public boolean d(ku3 ku3Var) {
        return true;
    }

    public boolean e(ku3 ku3Var) {
        return true;
    }

    public lc9 f(ku3 ku3Var) {
        b8c b8cVarA = ((f8c) this.a.getValue()).a(ku3Var.p());
        String strS = ku3Var.s(((w4e) b()).n(), il0.c);
        boolean z = ku3Var.p() == ((w4e) b()).s();
        long jP = ku3Var.p();
        String strE = ku3Var.e();
        if (strE != null) {
            return new lc9(jP, strE, m6g.a(ku3Var.i()), c(ku3Var), strS != null ? Uri.parse(strS) : null, ku3Var.o(), ku3Var.x(), z, false, d(ku3Var), e(ku3Var), b8cVarA.b, a(ku3Var));
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
