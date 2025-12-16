package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes.dex */
public abstract class h9j {
    public static u1j a;

    public static final void a(l42 l42Var, Continuation continuation, boolean z) {
        Object obj = l42.d.get(l42Var);
        Throwable exceptionalResult$kotlinx_coroutines_core = l42Var.getExceptionalResult$kotlinx_coroutines_core(obj);
        Object ipdVar = exceptionalResult$kotlinx_coroutines_core != null ? new ipd(exceptionalResult$kotlinx_coroutines_core) : l42Var.getSuccessfulResult$kotlinx_coroutines_core(obj);
        if (!z) {
            continuation.resumeWith(ipdVar);
            return;
        }
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        Continuation<T> continuation2 = dispatchedContinuation.continuation;
        Object obj2 = dispatchedContinuation.countOrElement;
        x74 context = continuation2.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, obj2);
        lqg lqgVarD = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? z6j.d(continuation2, context, objUpdateThreadContext) : null;
        try {
            dispatchedContinuation.continuation.resumeWith(ipdVar);
            if (lqgVarD == null || lqgVarD.D()) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        } catch (Throwable th) {
            if (lqgVarD == null || lqgVarD.D()) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
            throw th;
        }
    }
}
