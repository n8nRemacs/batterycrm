package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes.dex */
public abstract class o0 extends su7 implements Continuation, f84 {
    private final x74 context;

    public o0(x74 x74Var, boolean z, boolean z2) {
        super(z2);
        if (z) {
            initParentJob((qt7) x74Var.get(wha.w0));
        }
        this.context = x74Var.plus(this);
    }

    public static /* synthetic */ void getContext$annotations() {
    }

    @Override // defpackage.su7
    public String cancellationExceptionMessage() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlin.coroutines.Continuation
    public final x74 getContext() {
        return this.context;
    }

    @Override // defpackage.f84
    public x74 getCoroutineContext() {
        return this.context;
    }

    @Override // defpackage.su7
    public final void handleOnCompletionException$kotlinx_coroutines_core(Throwable th) {
        b7j.c(this.context, th);
    }

    @Override // defpackage.su7, defpackage.qt7
    public boolean isActive() {
        return super.isActive();
    }

    @Override // defpackage.su7
    public String nameString$kotlinx_coroutines_core() {
        return super.nameString$kotlinx_coroutines_core();
    }

    public void onCancelled(Throwable th, boolean z) {
    }

    public void onCompleted(Object obj) {
    }

    @Override // defpackage.su7
    public final void onCompletionInternal(Object obj) {
        if (!(obj instanceof zk3)) {
            onCompleted(obj);
        } else {
            zk3 zk3Var = (zk3) obj;
            onCancelled(zk3Var.a, zk3.b.get(zk3Var) != 0);
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Object objMakeCompletingOnce$kotlinx_coroutines_core = makeCompletingOnce$kotlinx_coroutines_core(d5j.b(obj, null));
        if (objMakeCompletingOnce$kotlinx_coroutines_core == tu7.b) {
            return;
        }
        afterResume(objMakeCompletingOnce$kotlinx_coroutines_core);
    }

    public final <R> void start(i84 i84Var, R r, sm6 sm6Var) {
        Object objInvoke;
        int iOrdinal = i84Var.ordinal();
        if (iOrdinal == 0) {
            pyi.b(sm6Var, r, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                hni.f(hni.d(sm6Var, r, this)).resumeWith(qqg.a);
                return;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                x74 context = getContext();
                Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, null);
                try {
                    h8j.a(this);
                    if (sm6Var instanceof ij0) {
                        uog.d(2, sm6Var);
                        objInvoke = sm6Var.invoke(r, this);
                    } else {
                        objInvoke = hni.h(sm6Var, r, this);
                    }
                    ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                    if (objInvoke != g84.a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                    throw th;
                }
            } catch (Throwable th2) {
                resumeWith(new ipd(th2));
            }
        }
    }
}
