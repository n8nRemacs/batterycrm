package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ku7 extends l42 {
    public final su7 X;

    public ku7(su7 su7Var, Continuation continuation) {
        super(1, continuation);
        this.X = su7Var;
    }

    @Override // defpackage.l42
    public final Throwable l(su7 su7Var) {
        Throwable thC;
        Object state$kotlinx_coroutines_core = this.X.getState$kotlinx_coroutines_core();
        return (!(state$kotlinx_coroutines_core instanceof mu7) || (thC = ((mu7) state$kotlinx_coroutines_core).c()) == null) ? state$kotlinx_coroutines_core instanceof zk3 ? ((zk3) state$kotlinx_coroutines_core).a : su7Var.getCancellationException() : thC;
    }

    @Override // defpackage.l42
    public final String u() {
        return "AwaitContinuation";
    }
}
