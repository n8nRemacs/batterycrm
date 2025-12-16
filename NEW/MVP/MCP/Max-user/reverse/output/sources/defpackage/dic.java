package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final /* synthetic */ class dic implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eic b;

    public /* synthetic */ dic(eic eicVar, int i) {
        this.a = i;
        this.b = eicVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                qic qicVarY0 = this.b.o.y0();
                ci5 ci5Var = qicVarY0.F0;
                String strV = qicVarY0.v();
                if (strV != null) {
                    xfh.r(ci5Var, new thc(strV));
                    if (xb3.b()) {
                        pb2 pb2VarU = qicVarY0.u();
                        ci5Var.b.h(new whc(yud.t, new n5g((pb2VarU == null || !pb2VarU.f0()) ? x8b.a1 : x8b.b1)));
                    }
                }
                break;
            default:
                xfh.r(this.b.o.y0().F0, new vhc(Collections.singletonList(new b44(v8b.M, new n5g(x8b.U0), Integer.valueOf(w9b.V), Integer.valueOf(yud.I1), Integer.valueOf(w9b.Q)))));
                break;
        }
        return qqg.a;
    }
}
