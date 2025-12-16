package defpackage;

import one.me.calls.ui.ui.call.CallScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class c41 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e41 b;

    public /* synthetic */ c41(e41 e41Var, int i) {
        this.a = i;
        this.b = e41Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                d41 d41Var = this.b.G0;
                if (d41Var != null) {
                    CallScreen callScreen = ((ql1) d41Var).a;
                    rha rhaVar = CallScreen.N0;
                    callScreen.C0(true);
                }
                break;
            case 1:
                d41 d41Var2 = this.b.G0;
                if (d41Var2 != null) {
                    CallScreen callScreen2 = ((ql1) d41Var2).a;
                    rha rhaVar2 = CallScreen.N0;
                    callScreen2.H0().z();
                }
                break;
            default:
                d41 d41Var3 = this.b.G0;
                if (d41Var3 != null) {
                    ql1 ql1Var = (ql1) d41Var3;
                    ((yx1) ql1Var.a.a.getValue()).f = 1;
                    ((yx1) ql1Var.a.a.getValue()).d = rx1.a;
                    ((yx1) ql1Var.a.a.getValue()).i(tx1.RECALL, false);
                    wo1 wo1VarH0 = ql1Var.a.H0();
                    vc1 vc1VarW = wo1VarH0.w();
                    qv1 qv1Var = wo1VarH0.c;
                    gxi gxiVar = vc1VarW.c;
                    ms8 ms8Var = vc1VarW.q;
                    ms8 ms8Var2 = ms8.b;
                    boolean z = ms8Var == ms8Var2;
                    boolean z2 = vc1VarW.r == ms8Var2;
                    if (gxiVar == null) {
                        qv1Var.getClass();
                    } else {
                        ((hw1) qv1Var.a).E(new naf(new laf(gxiVar), z, z2, null));
                        qv1Var.o(dxg.d);
                        qv1Var.w.O(qv1Var, qv1.z[0], gw0.w(qv1Var.x, qv1Var.k));
                    }
                    qv1Var.m();
                    qv1Var.n();
                }
                break;
        }
        return qqg.a;
    }
}
