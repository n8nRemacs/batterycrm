package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import s41.C47998a;

/* compiled from: SafeObserver.java */
/* loaded from: classes8.dex */
public final class l<T> implements G<T>, io.reactivex.rxjava3.disposables.d {

    /* renamed from: b, reason: collision with root package name */
    public final G<? super T> f404875b;

    /* renamed from: c, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.d f404876c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f404877d;

    public l(@j41.e G<? super T> g12) {
        this.f404875b = g12;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
        if (DisposableHelper.f(this.f404876c, dVar)) {
            this.f404876c = dVar;
            try {
                this.f404875b.b(this);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404877d = true;
                try {
                    dVar.dispose();
                    C47998a.b(th2);
                } catch (Throwable th3) {
                    io.reactivex.rxjava3.exceptions.a.a(th3);
                    C47998a.b(new CompositeException(th2, th3));
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        this.f404876c.dispose();
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        if (this.f404877d) {
            return;
        }
        this.f404877d = true;
        io.reactivex.rxjava3.disposables.d dVar = this.f404876c;
        G<? super T> g12 = this.f404875b;
        if (dVar != null) {
            try {
                g12.e();
                return;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            g12.onError(nullPointerException);
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.a(th3);
            C47998a.b(new CompositeException(nullPointerException, th3));
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f404876c.getF318621e();
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(@j41.e Throwable th2) {
        if (this.f404877d) {
            C47998a.b(th2);
            return;
        }
        this.f404877d = true;
        io.reactivex.rxjava3.disposables.d dVar = this.f404876c;
        G<? super T> g12 = this.f404875b;
        if (dVar == null) {
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                g12.onError(new CompositeException(th2, nullPointerException));
                return;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                C47998a.b(new CompositeException(th2, nullPointerException, th3));
                return;
            }
        }
        if (th2 == null) {
            th2 = io.reactivex.rxjava3.internal.util.h.b("onError called with a null Throwable.");
        }
        try {
            g12.onError(th2);
        } catch (Throwable th4) {
            io.reactivex.rxjava3.exceptions.a.a(th4);
            C47998a.b(new CompositeException(th2, th4));
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(@j41.e T t12) {
        if (this.f404877d) {
            return;
        }
        io.reactivex.rxjava3.disposables.d dVar = this.f404876c;
        G<? super T> g12 = this.f404875b;
        if (dVar == null) {
            this.f404877d = true;
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                g12.onError(nullPointerException);
                return;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(new CompositeException(nullPointerException, th2));
                return;
            }
        }
        if (t12 == null) {
            NullPointerException nullPointerExceptionB = io.reactivex.rxjava3.internal.util.h.b("onNext called with a null value.");
            try {
                this.f404876c.dispose();
                onError(nullPointerExceptionB);
                return;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                onError(new CompositeException(nullPointerExceptionB, th3));
                return;
            }
        }
        try {
            g12.onNext(t12);
        } catch (Throwable th4) {
            io.reactivex.rxjava3.exceptions.a.a(th4);
            try {
                this.f404876c.dispose();
                onError(th4);
            } catch (Throwable th5) {
                io.reactivex.rxjava3.exceptions.a.a(th5);
                onError(new CompositeException(th4, th5));
            }
        }
    }
}
