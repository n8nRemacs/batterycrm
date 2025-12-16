package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class be2 implements iu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ be2(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.iu3
    public final void accept(Object obj) {
        int i = this.a;
        long j = this.b;
        af2 af2Var = (af2) obj;
        switch (i) {
            case 0:
                hf2 hf2Var = af2Var.o;
                if (hf2Var == null) {
                    hf2Var = hf2.h;
                }
                gf2 gf2VarA = hf2Var.a();
                gf2VarA.a = j;
                af2Var.o = new hf2(gf2VarA);
                break;
            case 1:
                hf2 hf2Var2 = af2Var.o;
                if (hf2Var2 == null) {
                    hf2Var2 = hf2.h;
                }
                gf2 gf2VarA2 = hf2Var2.a();
                gf2VarA2.e = j;
                af2Var.o = new hf2(gf2VarA2);
                break;
            case 2:
                af2Var.x = j;
                break;
            case 3:
                wqi.c("ve2", "reactions, clearLastReaction for chat #%d", Long.valueOf(j));
                af2Var.k0 = 0L;
                af2Var.l0 = null;
                break;
            case 4:
                kf2 kf2Var = af2Var.n;
                rs4 rs4Var = rs4.REGULAR;
                ArrayList arrayListB = p4j.b(kf2Var, j, rs4Var);
                af2Var.n.d(rs4Var).clear();
                kf2.e(rs4Var);
                af2Var.n.d(rs4Var).addAll(arrayListB);
                kf2.e(rs4Var);
                af2Var.Z = 0L;
                df2 df2Var = df2.f;
                af2Var.p = df2Var;
                af2Var.q = df2Var;
                af2Var.r = df2Var;
                af2Var.s = df2Var;
                af2Var.t = df2Var;
                af2Var.u = df2Var;
                af2Var.v = df2Var;
                af2Var.w = df2Var;
                pf2 pf2Var = af2Var.b;
                if (pf2Var == pf2.b || (pf2Var == pf2.a && j == af2Var.k)) {
                    af2Var.j = 0L;
                    af2Var.m = 0;
                    af2Var.p = null;
                    af2Var.q = null;
                    af2Var.t = null;
                    af2Var.u = null;
                    af2Var.s = null;
                    af2Var.r = null;
                    af2Var.v = null;
                    af2Var.w = null;
                    break;
                }
                break;
            case 5:
                af2Var.f = j;
                break;
            case 6:
                if (af2Var.Z < j) {
                    af2Var.Z = j;
                    break;
                }
                break;
            case 7:
                hf2 hf2Var3 = af2Var.o;
                if (hf2Var3 == null) {
                    hf2Var3 = hf2.h;
                }
                gf2 gf2VarA3 = hf2Var3.a();
                gf2VarA3.d = j;
                af2Var.o = new hf2(gf2VarA3);
                break;
            default:
                af2Var.L = j;
                af2Var.M = false;
                break;
        }
    }
}
