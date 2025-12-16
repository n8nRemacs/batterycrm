package defpackage;

/* loaded from: classes2.dex */
public final class u07 {
    public final k18 a;
    public final k18 b;

    public u07(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public final boolean a(si9 si9Var) {
        si9 si9Var2;
        if (!((sxg) this.b.getValue()).p() || !si9Var.v()) {
            return false;
        }
        while (true) {
            boolean zV = si9Var.v();
            si9Var2 = si9Var.A0;
            if (!zV || si9Var2.T0 == 4) {
                break;
            }
            si9Var = si9Var2;
        }
        if (!si9Var.v()) {
            return false;
        }
        pb2 pb2Var = (pb2) ((w63) this.a.getValue()).k(si9Var.z0).a.getValue();
        if (!(si9Var.v() && (si9Var2.L0 & 4) == 4) && (pb2Var == null || !pb2Var.b.H.j)) {
            return false;
        }
        return pb2Var == null || !pb2Var.h0();
    }
}
