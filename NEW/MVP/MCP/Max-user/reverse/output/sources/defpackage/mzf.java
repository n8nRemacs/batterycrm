package defpackage;

import java.io.File;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final /* synthetic */ class mzf implements gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ozf b;
    public final /* synthetic */ ao6 c;

    public /* synthetic */ mzf(ozf ozfVar, ao6 ao6Var, int i) {
        this.a = i;
        this.b = ozfVar;
        this.c = ao6Var;
    }

    @Override // defpackage.gu3
    public final void accept(Object obj) {
        int i = this.a;
        ao6 ao6Var = this.c;
        ozf ozfVar = this.b;
        switch (i) {
            case 0:
                k18 k18Var = ozfVar.Y;
                nzf nzfVar = (nzf) obj;
                boolean z = nzfVar.b;
                File file = nzfVar.a;
                if (!z) {
                    wqi.c("ozf", "Hasn't tam emoji font file", new Object[0]);
                    wqi.c("ozf", "Download font", new Object[0]);
                    if (!bwd.c(ozfVar.s0)) {
                        wqi.c("ozf", "Font already downloading", new Object[0]);
                        break;
                    } else {
                        ((ur3) k18Var.getValue()).c(ozfVar);
                        if (((ur3) k18Var.getValue()).b() == os3.c) {
                            int i2 = 2;
                            vk3 vk3Var = new vk3(3, new es5(ozfVar, file, i2));
                            d1g d1gVar = (d1g) ozfVar.a.getValue();
                            d1gVar.getClass();
                            ota otaVarM = new ora(vk3Var, new b1g(d1gVar, 5, 2), 7).m(5L, pdf.g);
                            m0g m0gVar = (m0g) ozfVar.o.getValue();
                            m0gVar.getClass();
                            lra lraVarP = otaVarM.p(((n0g) m0gVar).a());
                            v08 v08Var = new v08(new nl(ozfVar, file, ao6Var, 27), new mzf(ozfVar, ao6Var, i2), pdf.d);
                            lraVarP.a(v08Var);
                            ozfVar.s0 = v08Var;
                            break;
                        } else {
                            if (ao6Var != null) {
                                ao6Var.n();
                            }
                            wqi.o("ozf", null, "Can't download now. Waiting for Wi-Fi", Arrays.copyOf(new Object[0], 0));
                            break;
                        }
                    }
                } else {
                    wqi.c("ozf", "Has tam emoji font file", new Object[0]);
                    ozfVar.d(file, ao6Var);
                    break;
                }
            case 1:
                ((y3b) ((yi5) ozfVar.X.getValue())).a(new IllegalStateException("Can't read emoji font", (Throwable) obj));
                if (ao6Var != null) {
                    ao6Var.n();
                }
                ozfVar.t0 = null;
                break;
            default:
                ((y3b) ((yi5) ozfVar.X.getValue())).a(new IllegalStateException("Can't download emoji font", (Throwable) obj));
                if (ao6Var != null) {
                    ao6Var.n();
                }
                ((ur3) ozfVar.Y.getValue()).e(ozfVar);
                ozfVar.t0 = null;
                break;
        }
    }
}
