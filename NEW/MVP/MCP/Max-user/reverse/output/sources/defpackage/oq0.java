package defpackage;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class oq0 extends o0 {
    public final Thread a;
    public final ki5 b;

    public oq0(x74 x74Var, Thread thread, ki5 ki5Var) {
        super(x74Var, true, true);
        this.a = thread;
        this.b = ki5Var;
    }

    @Override // defpackage.su7
    public final void afterCompletion(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.a;
        if (fni.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
