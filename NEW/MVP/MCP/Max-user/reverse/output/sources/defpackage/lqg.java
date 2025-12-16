package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes.dex */
public final class lqg extends ScopeCoroutine {
    public final ThreadLocal a;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public lqg(x74 x74Var, Continuation continuation) {
        mqg mqgVar = mqg.a;
        super(x74Var.get(mqgVar) == null ? x74Var.plus(mqgVar) : x74Var, continuation);
        this.a = new ThreadLocal();
        if (continuation.getContext().get(jbe.t0) instanceof z74) {
            return;
        }
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(x74Var, null);
        ThreadContextKt.restoreThreadContext(x74Var, objUpdateThreadContext);
        E(x74Var, objUpdateThreadContext);
    }

    public final boolean D() {
        boolean z = this.threadLocalIsSet && this.a.get() == null;
        this.a.remove();
        return !z;
    }

    public final void E(x74 x74Var, Object obj) {
        this.threadLocalIsSet = true;
        this.a.set(new imb(x74Var, obj));
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, defpackage.su7
    public final void afterResume(Object obj) {
        if (this.threadLocalIsSet) {
            imb imbVar = (imb) this.a.get();
            if (imbVar != null) {
                ThreadContextKt.restoreThreadContext((x74) imbVar.a, imbVar.b);
            }
            this.a.remove();
        }
        Object objA = d5j.a(obj);
        Continuation<T> continuation = this.uCont;
        x74 context = continuation.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, null);
        lqg lqgVarD = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? z6j.d(continuation, context, objUpdateThreadContext) : null;
        try {
            this.uCont.resumeWith(objA);
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
