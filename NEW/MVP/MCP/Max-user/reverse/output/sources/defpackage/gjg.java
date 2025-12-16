package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class gjg extends x1 implements RunnableFuture, o1 {
    public volatile fjg Z;

    public gjg(Callable callable) {
        this.Z = new fjg(this, callable);
    }

    @Override // defpackage.x1
    public final void b() {
        fjg fjgVar;
        Object obj = this.a;
        if ((obj instanceof b1) && ((b1) obj).a && (fjgVar = this.Z) != null) {
            o6 o6Var = fjg.d;
            o6 o6Var2 = fjg.c;
            Runnable runnable = (Runnable) fjgVar.get();
            if (runnable instanceof Thread) {
                bq7 bq7Var = new bq7(fjgVar);
                bq7.a(bq7Var, Thread.currentThread());
                if (fjgVar.compareAndSet(runnable, bq7Var)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) fjgVar.getAndSet(o6Var2)) == o6Var) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.Z = null;
    }

    @Override // defpackage.x1
    public final String i() {
        fjg fjgVar = this.Z;
        if (fjgVar == null) {
            return super.i();
        }
        return "task=[" + fjgVar + "]";
    }

    @Override // defpackage.x1, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof b1;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        fjg fjgVar = this.Z;
        if (fjgVar != null) {
            fjgVar.run();
        }
        this.Z = null;
    }
}
