package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: DeferredScalarObserver.java */
/* loaded from: classes8.dex */
public abstract class o<T, R> extends n<R> implements io.reactivex.rxjava3.core.G<T> {
    private static final long serialVersionUID = -266195175408988651L;

    /* renamed from: d, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.d f402120d;

    public o() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        if (DisposableHelper.f(this.f402120d, dVar)) {
            this.f402120d = dVar;
            this.f402118b.b(this);
        }
    }

    @Override // io.reactivex.rxjava3.internal.observers.n, io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        super.dispose();
        this.f402120d.dispose();
    }

    public void e() {
        T t12 = this.f402119c;
        if (t12 != null) {
            this.f402119c = null;
            a(t12);
        } else {
            if ((get() & 54) != 0) {
                return;
            }
            lazySet(2);
            this.f402118b.e();
        }
    }

    @Override // io.reactivex.rxjava3.internal.observers.n, org.reactivestreams.d
    public final void onError(Throwable th2) {
        this.f402119c = null;
        c(th2);
    }
}
