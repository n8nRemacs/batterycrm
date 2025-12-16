package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class aoa extends oj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l42 b;

    public /* synthetic */ aoa(l42 l42Var, int i) {
        this.a = i;
        this.b = l42Var;
    }

    @Override // defpackage.oj0, defpackage.af4
    public final void c() {
        switch (this.a) {
            case 0:
                l42 l42Var = this.b;
                if (l42Var.r()) {
                    l42Var.h(new CancellationException("Cancelled with fresco pipeline"));
                    break;
                }
                break;
            default:
                l42 l42Var2 = this.b;
                if (l42Var2.r()) {
                    l42Var2.h(new Throwable("Cancelled with fresco pipeline"));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.oj0
    public final void e(pe4 pe4Var) {
        switch (this.a) {
            case 0:
                l42 l42Var = this.b;
                if (l42Var.r()) {
                    l42Var.resumeWith(new ipd(new IllegalStateException("Fetch failed", ((r0) pe4Var).b())));
                    break;
                }
                break;
            default:
                this.b.resumeWith(null);
                break;
        }
    }

    @Override // defpackage.oj0
    public final void f(r0 r0Var) {
        switch (this.a) {
            case 0:
                l42 l42Var = this.b;
                if (l42Var.r()) {
                    l42Var.resumeWith(qqg.a);
                    break;
                }
                break;
            default:
                boolean zG = r0Var.g();
                l42 l42Var2 = this.b;
                if (!zG) {
                    l42Var2.resumeWith(null);
                    break;
                } else {
                    vc3 vc3VarY = vc3.y((vc3) r0Var.d());
                    if (vc3VarY != null) {
                        l42Var2.resumeWith(vc3VarY.Z());
                        break;
                    } else {
                        l42Var2.resumeWith(null);
                        break;
                    }
                }
        }
    }
}
