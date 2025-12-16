package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class tw1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vw1 b;

    public /* synthetic */ tw1(vw1 vw1Var, int i) {
        this.a = i;
        this.b = vw1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        boolean z = true;
        switch (this.a) {
            case 0:
                vw1 vw1Var = this.b;
                vw1Var.e();
                if (vw1Var.Y == 0) {
                    boolean z2 = vw1Var.c.b != 0;
                    wqi.c("vw1", "sync: from: " + vw1Var.c.b + " forward: " + z2, new Object[0]);
                    hwa hwaVar = vw1Var.v0;
                    vw1Var.Y = hwa.q(hwaVar, new u1h(hwaVar.t().a.k(), vw1Var.c.b, z2));
                    break;
                }
                break;
            case 1:
                Iterator it = this.b.X.iterator();
                while (it.hasNext()) {
                    pa1 pa1Var = (pa1) it.next();
                    wqi.c("CallHistoryPageViewModel", "loaded history for type=" + pa1Var.b, new Object[0]);
                    pa1Var.x();
                }
                break;
            case 2:
                vw1 vw1Var2 = this.b;
                vw1Var2.c = new uw1();
                new File(iz5.b(((iz5) vw1Var2.z0).c), "call_history_state").delete();
                break;
            case 3:
                vw1 vw1Var3 = this.b;
                vw1Var3.A0.d(vw1Var3);
                break;
            case 4:
                vw1 vw1Var4 = this.b;
                vw1Var4.A0.f(vw1Var4);
                break;
            default:
                vw1 vw1Var5 = this.b;
                if (!vw1Var5.a) {
                    vw1Var5.e();
                    if (vw1Var5.c.a.a != 0 || vw1Var5.c.a.b != 0 || !vw1Var5.c.o) {
                        ArrayList arrayListK = vw1Var5.w0.k(vw1Var5.c.a.a, vw1Var5.c.a.b);
                        wqi.c("vw1", "loadInitial: loaded from db: " + arrayListK.size() + " messages", new Object[0]);
                        vw1Var5.a(vw1Var5.d.size(), arrayListK);
                        vw1Var5.a = true;
                        vw1Var5.b = arrayListK.isEmpty();
                        vw1Var5.f();
                        if (vw1Var5.c.d) {
                            vw1Var5.g(new ui(6, vw1Var5, z));
                            break;
                        }
                    } else {
                        vw1Var5.g(new tw1(vw1Var5, i));
                        break;
                    }
                }
                break;
        }
    }
}
