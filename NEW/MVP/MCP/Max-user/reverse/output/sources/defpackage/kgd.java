package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class kgd extends xfh {
    public final k18 X;
    public final k18 Y;
    public final hbd Z;
    public final bgd b;
    public final Boolean c;
    public final qv1 d;
    public final k18 o;
    public final z41 s0;
    public final ci5 t0;

    public kgd(bgd bgdVar, Boolean bool, qv1 qv1Var, k18 k18Var, k18 k18Var2, k18 k18Var3) {
        Object value;
        igd igdVar;
        this.b = bgdVar;
        this.c = bool;
        this.d = qv1Var;
        this.o = k18Var;
        this.X = k18Var2;
        this.Y = k18Var3;
        Continuation continuation = null;
        tcf tcfVarA = ucf.a(null);
        this.Z = new hbd(tcfVarA);
        this.s0 = new z41(gw0.C(gw0.m(new z41(qv1Var.e(), qv1Var.f(), new s3(this, continuation, 28), 3)), this.a, yve.a, gn1.g), ((d2e) ((u1e) k18Var2.getValue())).z0, new s3(this, continuation, 27), 3);
        this.t0 = new ci5(0);
        do {
            value = tcfVarA.getValue();
            int iOrdinal = this.b.ordinal();
            if (iOrdinal != 0) {
                iza izaVar = iza.b;
                if (iOrdinal == 1) {
                    igdVar = new igd(new n5g(m0b.P1), new n5g(m0b.O1), new hgd(j0b.v1, new n5g(m0b.M1), iza.a), new hgd(j0b.w1, new n5g(m0b.N1), izaVar), s5g.b, false);
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n5g n5gVar = new n5g(m0b.L1);
                    hgd hgdVar = new hgd(j0b.o1, new n5g(m0b.J1), izaVar);
                    hgd hgdVar2 = new hgd(j0b.n1, new n5g(m0b.K1), izaVar);
                    String str = ((n41) ((c51) this.d.f).j.getValue()).c;
                    igdVar = new igd(n5gVar, null, hgdVar, hgdVar2, new r5g(str == null ? "" : str), true);
                }
            } else {
                igdVar = null;
            }
        } while (!tcfVarA.c(value, igdVar));
        if (this.b == bgd.b) {
            gw0.w(new g56(new xnb(((d2e) ((u1e) this.X.getValue())).t0, 8), new ggd(this, null), 1), this.a);
        }
    }
}
