package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.appset.zzq;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
public final class P<TResult> extends Task<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f355659a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final K f355660b = new K();

    /* renamed from: c, reason: collision with root package name */
    public boolean f355661c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f355662d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public Object f355663e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f355664f;

    @Override // com.google.android.gms.tasks.Task
    @j.N
    public final void a(@j.N InterfaceC37021d interfaceC37021d) {
        b(C37029l.f355673a, interfaceC37021d);
    }

    @Override // com.google.android.gms.tasks.Task
    @j.N
    public final void b(@j.N Executor executor, @j.N InterfaceC37021d interfaceC37021d) {
        this.f355660b.a(new A(executor, interfaceC37021d));
        z();
    }

    @Override // com.google.android.gms.tasks.Task
    @j.N
    public final Task<TResult> c(@j.N InterfaceC37022e<TResult> interfaceC37022e) {
        this.f355660b.a(new C(C37029l.f355673a, interfaceC37022e));
        z();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @j.N
    public final void d(@j.N Executor executor, @j.N InterfaceC37022e interfaceC37022e) {
        this.f355660b.a(new C(executor, interfaceC37022e));
        z();
    }

    @Override // com.google.android.gms.tasks.Task
    @j.N
    public final Task<TResult> e(@j.N InterfaceC37023f interfaceC37023f) {
        f(C37029l.f355673a, interfaceC37023f);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @j.N
    public final Task<TResult> f(@j.N Executor executor, @j.N InterfaceC37023f interfaceC37023f) {
        this.f355660b.a(new E(executor, interfaceC37023f));
        z();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @j.N
    public final Task<TResult> g(@j.N InterfaceC37024g<? super TResult> interfaceC37024g) {
        h(C37029l.f355673a, interfaceC37024g);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @j.N
    public final Task<TResult> h(@j.N Executor executor, @j.N InterfaceC37024g<? super TResult> interfaceC37024g) {
        this.f355660b.a(new G(executor, interfaceC37024g));
        z();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @j.N
    public final <TContinuationResult> Task<TContinuationResult> i(@j.N Executor executor, @j.N InterfaceC37020c<TResult, TContinuationResult> interfaceC37020c) {
        P p12 = new P();
        this.f355660b.a(new w(executor, interfaceC37020c, p12));
        z();
        return p12;
    }

    @Override // com.google.android.gms.tasks.Task
    @j.N
    public final void j(@j.N InterfaceC37020c interfaceC37020c) {
        i(C37029l.f355673a, interfaceC37020c);
    }

    @Override // com.google.android.gms.tasks.Task
    @j.N
    public final Task k(@j.N zzq zzqVar) {
        return l(C37029l.f355673a, zzqVar);
    }

    @Override // com.google.android.gms.tasks.Task
    @j.N
    public final <TContinuationResult> Task<TContinuationResult> l(@j.N Executor executor, @j.N InterfaceC37020c<TResult, Task<TContinuationResult>> interfaceC37020c) {
        P p12 = new P();
        this.f355660b.a(new y(executor, interfaceC37020c, p12));
        z();
        return p12;
    }

    @Override // com.google.android.gms.tasks.Task
    @j.P
    public final Exception m() {
        Exception exc;
        synchronized (this.f355659a) {
            exc = this.f355664f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final TResult n() {
        TResult tresult;
        synchronized (this.f355659a) {
            try {
                C36729v.l("Task is not yet complete", this.f355661c);
                if (this.f355662d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f355664f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                tresult = (TResult) this.f355663e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object o() {
        Object obj;
        synchronized (this.f355659a) {
            try {
                C36729v.l("Task is not yet complete", this.f355661c);
                if (this.f355662d) {
                    throw new CancellationException("Task is already canceled.");
                }
                if (IOException.class.isInstance(this.f355664f)) {
                    throw ((Throwable) IOException.class.cast(this.f355664f));
                }
                Exception exc = this.f355664f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f355663e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean p() {
        return this.f355662d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean q() {
        boolean z12;
        synchronized (this.f355659a) {
            z12 = this.f355661c;
        }
        return z12;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean r() {
        boolean z12;
        synchronized (this.f355659a) {
            try {
                z12 = false;
                if (this.f355661c && !this.f355662d && this.f355664f == null) {
                    z12 = true;
                }
            } finally {
            }
        }
        return z12;
    }

    @Override // com.google.android.gms.tasks.Task
    @j.N
    public final <TContinuationResult> Task<TContinuationResult> s(@j.N InterfaceC37027j<TResult, TContinuationResult> interfaceC37027j) {
        Executor executor = C37029l.f355673a;
        P p12 = new P();
        this.f355660b.a(new I(executor, interfaceC37027j, p12));
        z();
        return p12;
    }

    @Override // com.google.android.gms.tasks.Task
    @j.N
    public final <TContinuationResult> Task<TContinuationResult> t(Executor executor, InterfaceC37027j<TResult, TContinuationResult> interfaceC37027j) {
        P p12 = new P();
        this.f355660b.a(new I(executor, interfaceC37027j, p12));
        z();
        return p12;
    }

    public final void u(@j.N Exception exc) {
        C36729v.k(exc, "Exception must not be null");
        synchronized (this.f355659a) {
            y();
            this.f355661c = true;
            this.f355664f = exc;
        }
        this.f355660b.b(this);
    }

    public final void v(@j.P Object obj) {
        synchronized (this.f355659a) {
            y();
            this.f355661c = true;
            this.f355663e = obj;
        }
        this.f355660b.b(this);
    }

    public final void w() {
        synchronized (this.f355659a) {
            try {
                if (this.f355661c) {
                    return;
                }
                this.f355661c = true;
                this.f355662d = true;
                this.f355660b.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean x(@j.P Object obj) {
        synchronized (this.f355659a) {
            try {
                if (this.f355661c) {
                    return false;
                }
                this.f355661c = true;
                this.f355663e = obj;
                this.f355660b.b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void y() {
        if (this.f355661c) {
            int i12 = DuplicateTaskCompletionException.f355640b;
            if (!q()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excM = m();
        }
    }

    public final void z() {
        synchronized (this.f355659a) {
            try {
                if (this.f355661c) {
                    this.f355660b.b(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
