package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class q44 extends ij0 {
    public final x74 b;
    public transient Continuation c;

    public q44(x74 x74Var, Continuation continuation) {
        super(continuation);
        this.b = x74Var;
    }

    @Override // kotlin.coroutines.Continuation
    public x74 getContext() {
        return this.b;
    }

    @Override // defpackage.ij0
    public void o() {
        Continuation continuation = this.c;
        if (continuation != null && continuation != this) {
            ((r44) getContext().get(jbe.t0)).releaseInterceptedContinuation(continuation);
        }
        this.c = yk3.b;
    }

    public q44(Continuation continuation) {
        this(continuation != null ? continuation.getContext() : null, continuation);
    }
}
