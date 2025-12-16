package defpackage;

/* loaded from: classes.dex */
public final class nu7 extends du7 {
    public final /* synthetic */ int b;
    public final nbe c;
    public final /* synthetic */ su7 d;

    public /* synthetic */ nu7(su7 su7Var, nbe nbeVar, int i) {
        this.b = i;
        this.d = su7Var;
        this.c = nbeVar;
    }

    @Override // defpackage.du7
    public final boolean c() {
        switch (this.b) {
        }
        return false;
    }

    @Override // defpackage.du7
    public final void d(Throwable th) {
        switch (this.b) {
            case 0:
                su7 su7Var = this.d;
                Object state$kotlinx_coroutines_core = su7Var.getState$kotlinx_coroutines_core();
                if (!(state$kotlinx_coroutines_core instanceof zk3)) {
                    state$kotlinx_coroutines_core = tu7.a(state$kotlinx_coroutines_core);
                }
                ((mbe) this.c).g(su7Var, state$kotlinx_coroutines_core);
                break;
            default:
                ((mbe) this.c).g(this.d, qqg.a);
                break;
        }
    }
}
