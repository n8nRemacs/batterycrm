package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class tn implements Executor {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object o;

    public /* synthetic */ tn(Executor executor, zkb zkbVar, iv6 iv6Var, n2g n2gVar) {
        this.a = 1;
        this.b = executor;
        this.c = zkbVar;
        this.d = iv6Var;
        this.o = n2gVar;
    }

    public void a() {
        synchronized (this.b) {
            try {
                Runnable runnable = (Runnable) ((ArrayDeque) this.c).poll();
                this.o = runnable;
                if (runnable != null) {
                    ((ex4) this.d).execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    try {
                        ((ArrayDeque) this.c).add(new ud(this, 3, runnable));
                        if (((Runnable) this.o) == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                try {
                    ((Executor) this.b).execute(runnable);
                    return;
                } catch (RuntimeException e) {
                    if (((ybj) ((zkb) this.c).b).g()) {
                        ((iv6) this.d).j();
                    } else {
                        ((n2g) this.o).a(e);
                    }
                    throw e;
                }
        }
    }

    public tn(ex4 ex4Var) {
        this.a = 0;
        this.b = new Object();
        this.c = new ArrayDeque();
        this.d = ex4Var;
    }
}
