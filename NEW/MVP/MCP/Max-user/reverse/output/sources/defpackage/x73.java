package defpackage;

import kotlinx.coroutines.internal.DispatchedContinuation;

/* loaded from: classes.dex */
public final class x73 extends du7 {
    public final /* synthetic */ int b;
    public final l42 c;

    public /* synthetic */ x73(l42 l42Var, int i) {
        this.b = i;
        this.c = l42Var;
    }

    @Override // defpackage.du7
    public final boolean c() {
        switch (this.b) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.du7
    public final void d(Throwable th) {
        switch (this.b) {
            case 0:
                su7 su7Var = this.a;
                if (su7Var == null) {
                    su7Var = null;
                }
                l42 l42Var = this.c;
                Throwable thL = l42Var.l(su7Var);
                if (!(!l42Var.s() ? false : ((DispatchedContinuation) l42Var.a).postponeCancellation$kotlinx_coroutines_core(thL))) {
                    l42Var.h(thL);
                    if (!l42Var.s()) {
                        l42Var.i();
                        break;
                    }
                }
                break;
            default:
                this.c.resumeWith(qqg.a);
                break;
        }
    }
}
