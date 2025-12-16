package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* loaded from: classes.dex */
public abstract class nyi {
    public static final l42 a(Continuation continuation) {
        if (!(continuation instanceof DispatchedContinuation)) {
            return new l42(1, continuation);
        }
        l42 l42VarClaimReusableCancellableContinuation$kotlinx_coroutines_core = ((DispatchedContinuation) continuation).claimReusableCancellableContinuation$kotlinx_coroutines_core();
        if (l42VarClaimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l42.d;
            Object obj = atomicReferenceFieldUpdater.get(l42VarClaimReusableCancellableContinuation$kotlinx_coroutines_core);
            if (!(obj instanceof xk3) || ((xk3) obj).d == null) {
                l42.c.set(l42VarClaimReusableCancellableContinuation$kotlinx_coroutines_core, 536870911);
                atomicReferenceFieldUpdater.set(l42VarClaimReusableCancellableContinuation$kotlinx_coroutines_core, p7.a);
            } else {
                l42VarClaimReusableCancellableContinuation$kotlinx_coroutines_core.i();
                l42VarClaimReusableCancellableContinuation$kotlinx_coroutines_core = null;
            }
            if (l42VarClaimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
                return l42VarClaimReusableCancellableContinuation$kotlinx_coroutines_core;
            }
        }
        return new l42(2, continuation);
    }

    public static final void b(k42 k42Var, z32 z32Var) {
        if (!(k42Var instanceof l42)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((l42) k42Var).q(z32Var);
    }

    public static final void c(esg esgVar) {
        esgVar.b(1, new a28(9));
    }
}
