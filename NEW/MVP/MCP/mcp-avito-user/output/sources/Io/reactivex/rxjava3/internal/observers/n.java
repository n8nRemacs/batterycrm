package io.reactivex.rxjava3.internal.observers;

import s41.C47998a;

/* compiled from: DeferredScalarDisposable.java */
/* loaded from: classes8.dex */
public class n<T> extends AbstractC41805c<T> {
    private static final long serialVersionUID = -5502432239815349361L;

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.G<? super T> f402118b;

    /* renamed from: c, reason: collision with root package name */
    public T f402119c;

    public n(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f402118b = g12;
    }

    public final void a(T t12) {
        int i12 = get();
        if ((i12 & 54) != 0) {
            return;
        }
        io.reactivex.rxjava3.core.G<? super T> g12 = this.f402118b;
        if (i12 == 8) {
            this.f402119c = t12;
            lazySet(16);
            g12.onNext(null);
        } else {
            lazySet(2);
            g12.onNext(t12);
        }
        if (get() != 4) {
            g12.e();
        }
    }

    public final void c(Throwable th2) {
        if ((get() & 54) != 0) {
            C47998a.b(th2);
        } else {
            lazySet(2);
            this.f402118b.onError(th2);
        }
    }

    @Override // q41.g
    public final void clear() {
        lazySet(32);
        this.f402119c = null;
    }

    public void dispose() {
        set(4);
        this.f402119c = null;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return get() == 4;
    }

    @Override // q41.g
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onError(Throwable th2) {
        c(th2);
    }

    public void onSuccess(T t12) {
        a(t12);
    }

    @Override // q41.g
    @j41.f
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        T t12 = this.f402119c;
        this.f402119c = null;
        lazySet(32);
        return t12;
    }

    @Override // q41.InterfaceC47200c
    public final int v(int i12) {
        lazySet(8);
        return 2;
    }
}
