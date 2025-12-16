package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* loaded from: classes.dex */
public final class q18 extends x9f {
    public final Continuation a;

    public q18(x74 x74Var, sm6 sm6Var) {
        super(x74Var, true, false);
        this.a = hni.d(sm6Var, this, this);
    }

    @Override // defpackage.su7
    public final void onStart() {
        try {
            DispatchedContinuationKt.resumeCancellableWith$default(hni.f(this.a), qqg.a, null, 2, null);
        } catch (Throwable th) {
            resumeWith(new ipd(th));
            throw th;
        }
    }
}
