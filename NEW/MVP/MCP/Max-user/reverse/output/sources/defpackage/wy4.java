package defpackage;

/* loaded from: classes.dex */
public final class wy4 extends du7 {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ wy4(int i, Object obj) {
        this.b = i;
        this.c = obj;
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
                ((sy4) this.c).dispose();
                break;
            case 1:
                ((em6) this.c).invoke(th);
                break;
            default:
                ku7 ku7Var = (ku7) this.c;
                su7 su7Var = this.a;
                if (su7Var == null) {
                    su7Var = null;
                }
                Object state$kotlinx_coroutines_core = su7Var.getState$kotlinx_coroutines_core();
                if (!(state$kotlinx_coroutines_core instanceof zk3)) {
                    ku7Var.resumeWith(tu7.a(state$kotlinx_coroutines_core));
                    break;
                } else {
                    ku7Var.resumeWith(new ipd(((zk3) state$kotlinx_coroutines_core).a));
                    break;
                }
        }
    }
}
