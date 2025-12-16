package defpackage;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class jxb extends xfh {
    public final tcf X;
    public final hbd Y;
    public final ci5 Z;
    public final lyb b;
    public final jzb c;
    public final tcf d;
    public final hbd o;
    public final tcf s0;
    public final hbd t0;

    public jxb(Set set, lyb lybVar, jzb jzbVar, lzf lzfVar) {
        this.b = lybVar;
        this.c = jzbVar;
        tcf tcfVarA = ucf.a(id5.a);
        this.d = tcfVarA;
        this.o = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(set);
        this.X = tcfVarA2;
        this.Y = new hbd(tcfVarA2);
        this.Z = new ci5(0);
        tcf tcfVarA3 = ucf.a("");
        this.s0 = tcfVarA3;
        x26 x26VarM = gw0.m(gw0.k(tcfVarA3, 200L));
        Object value = tcfVarA3.getValue();
        this.t0 = gw0.C(x26VarM, this.a, yve.a, value);
        gw0.w(gw0.u(gw0.x(tcfVarA2, new ixb(this, null)), ((q2b) lzfVar).b()), this.a);
        jzbVar.e(this.a);
    }

    @Override // defpackage.xfh
    public final void s() {
        this.c.a();
    }

    public final void t(yyb yybVar, boolean z, yg2 yg2Var, boolean z2) {
        Integer numValueOf = null;
        if (z) {
            tcf tcfVar = this.X;
            Set setG0 = ue3.g0((Iterable) tcfVar.getValue());
            long j = yybVar.a;
            boolean zRemove = setG0.remove(Long.valueOf(j));
            jzb jzbVar = this.c;
            if (zRemove) {
                jzbVar.d(j);
            } else {
                setG0.add(Long.valueOf(j));
                jzbVar.b(yybVar);
            }
            tcfVar.m(null, setG0);
            return;
        }
        int iV = az1.v(yybVar.c);
        if (iV == 0) {
            int iOrdinal = yg2Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    numValueOf = Integer.valueOf(k1b.c0);
                } else if (iOrdinal == 2) {
                    numValueOf = Integer.valueOf(z2 ? k1b.O : k1b.R);
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    numValueOf = Integer.valueOf(z2 ? k1b.U : k1b.W);
                }
            }
        } else if (iV == 3) {
            int iOrdinal2 = yg2Var.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    numValueOf = Integer.valueOf(k1b.a0);
                } else if (iOrdinal2 == 2) {
                    numValueOf = Integer.valueOf(z2 ? k1b.O : k1b.R);
                } else {
                    if (iOrdinal2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    numValueOf = Integer.valueOf(z2 ? k1b.U : k1b.W);
                }
            }
        } else if (iV != 4) {
            int iOrdinal3 = yg2Var.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 == 1) {
                    numValueOf = Integer.valueOf(k1b.d0);
                } else if (iOrdinal3 == 2) {
                    numValueOf = Integer.valueOf(z2 ? k1b.Q : k1b.T);
                } else {
                    if (iOrdinal3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    numValueOf = Integer.valueOf(z2 ? k1b.Z : k1b.Y);
                }
            }
        } else {
            int iOrdinal4 = yg2Var.ordinal();
            if (iOrdinal4 != 0) {
                if (iOrdinal4 == 1) {
                    numValueOf = Integer.valueOf(k1b.b0);
                } else if (iOrdinal4 == 2) {
                    numValueOf = Integer.valueOf(z2 ? k1b.P : k1b.S);
                } else {
                    if (iOrdinal4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    numValueOf = Integer.valueOf(z2 ? k1b.V : k1b.X);
                }
            }
        }
        if (numValueOf != null) {
            xfh.r(this.Z, new lxb(new n5g(numValueOf.intValue())));
        }
    }
}
