package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class lwd implements Continuation, h84 {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(lwd.class, Object.class, "result");
    public final Continuation a;
    private volatile Object result;

    public lwd(Continuation continuation) {
        g84 g84Var = g84.b;
        this.a = continuation;
        this.result = g84Var;
    }

    public final Object a() throws Throwable {
        g84 g84Var = g84.a;
        Object obj = this.result;
        g84 g84Var2 = g84.b;
        if (obj == g84Var2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, g84Var2, g84Var)) {
                if (atomicReferenceFieldUpdater.get(this) != g84Var2) {
                    obj = this.result;
                }
            }
            return g84Var;
        }
        if (obj == g84.c) {
            return g84Var;
        }
        if (obj instanceof ipd) {
            throw ((ipd) obj).a;
        }
        return obj;
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
        return this.a.getContext();
    }

    @Override // defpackage.h84
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            g84 g84Var = g84.b;
            if (obj2 == g84Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, g84Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != g84Var) {
                        break;
                    }
                }
                return;
            }
            g84 g84Var2 = g84.a;
            if (obj2 != g84Var2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
            g84 g84Var3 = g84.c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, g84Var2, g84Var3)) {
                if (atomicReferenceFieldUpdater2.get(this) != g84Var2) {
                    break;
                }
            }
            this.a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.a;
    }
}
