package defpackage;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ybj extends Task {
    public final Object a = new Object();
    public final vd b = new vd();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // com.google.android.gms.tasks.Task
    public final ybj a(Executor executor, kva kvaVar) {
        this.b.u(new qpi(executor, kvaVar));
        s();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final ybj b(Executor executor, lva lvaVar) {
        this.b.u(new qpi(executor, lvaVar));
        s();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final ybj c(Executor executor, nva nvaVar) {
        this.b.u(new qpi(executor, nvaVar));
        s();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final ybj d(Executor executor, vva vvaVar) {
        this.b.u(new qpi(executor, vvaVar));
        s();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception e() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object f() {
        Object obj;
        synchronized (this.a) {
            try {
                s5j.i("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final ybj i(lva lvaVar) {
        this.b.u(new qpi(u2g.a, lvaVar));
        s();
        return this;
    }

    public final ybj j(nva nvaVar) {
        c(u2g.a, nvaVar);
        return this;
    }

    public final ybj k(Executor executor, o44 o44Var) {
        ybj ybjVar = new ybj();
        this.b.u(new pii(executor, o44Var, ybjVar, 0));
        s();
        return ybjVar;
    }

    public final ybj l(Executor executor, o44 o44Var) {
        ybj ybjVar = new ybj();
        this.b.u(new pii(executor, o44Var, ybjVar, 1));
        s();
        return ybjVar;
    }

    public final ybj m(Executor executor, apf apfVar) {
        ybj ybjVar = new ybj();
        this.b.u(new qpi(executor, apfVar, ybjVar));
        s();
        return ybjVar;
    }

    public final void n(Exception exc) {
        s5j.h(exc, "Exception must not be null");
        synchronized (this.a) {
            r();
            this.c = true;
            this.f = exc;
        }
        this.b.v(this);
    }

    public final void o(Object obj) {
        synchronized (this.a) {
            r();
            this.c = true;
            this.e = obj;
        }
        this.b.v(this);
    }

    public final void p() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.v(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean q(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.v(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        if (this.c) {
            int i = DuplicateTaskCompletionException.a;
            if (!g()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excE = e();
        }
    }

    public final void s() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.v(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
