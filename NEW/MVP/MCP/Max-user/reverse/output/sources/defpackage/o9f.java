package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class o9f implements Continuation, h84 {
    public final Continuation a;
    public final x74 b;

    public o9f(x74 x74Var, Continuation continuation) {
        this.a = continuation;
        this.b = x74Var;
    }

    @Override // defpackage.h84
    public final h84 getCallerFrame() {
        Continuation continuation = this.a;
        if (continuation instanceof h84) {
            return (h84) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final x74 getContext() {
        return this.b;
    }

    @Override // defpackage.h84
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
