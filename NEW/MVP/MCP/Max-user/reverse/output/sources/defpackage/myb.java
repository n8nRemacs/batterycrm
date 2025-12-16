package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class myb {
    public final yg2 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;

    public myb(k18 k18Var, k18 k18Var2, k18 k18Var3, yg2 yg2Var) {
        this.a = yg2Var;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
    }

    public final fxb a(ku3 ku3Var) {
        s5g n5gVar;
        b8c b8cVarA = ((f8c) this.d.getValue()).a(ku3Var.p());
        String strR = ku3Var.r(il0.c);
        k18 k18Var = this.b;
        if (ku3Var.y((rt5) k18Var.getValue())) {
            n5gVar = new n5g(mvd.C);
        } else if (ku3Var.v() && ku3Var.A()) {
            n5gVar = new n5g(mvd.R1);
        } else if (ku3Var.v()) {
            n5gVar = new n5g(mvd.n);
        } else {
            CharSequence charSequenceB = ((h8c) this.c.getValue()).b(ku3Var);
            n5gVar = charSequenceB.length() == 0 ? new n5g(k1b.D) : new r5g(charSequenceB);
        }
        s5g s5gVar = n5gVar;
        int iOrdinal = this.a.ordinal();
        int i = 2;
        boolean z = iOrdinal == 1 ? !ku3Var.w() : !((iOrdinal == 2 || iOrdinal == 3) && ku3Var.z());
        if (ku3Var.y((rt5) k18Var.getValue())) {
            i = 5;
        } else if (ku3Var.v()) {
            i = 4;
        }
        long jP = ku3Var.p();
        long jP2 = ku3Var.p();
        String strE = ku3Var.e();
        if (strE != null) {
            return new fxb(jP, jP2, strE, s5gVar, strR != null ? Uri.parse(strR) : null, b8cVarA.a(), ku3Var.x(), new yyb(1, i, ku3Var.p()), ku3Var.o(), z);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
