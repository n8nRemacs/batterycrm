package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* compiled from: MaterializeSingleObserver.java */
/* loaded from: classes8.dex */
public final class p<T> implements L<T>, io.reactivex.rxjava3.core.t<T>, InterfaceC41771d, io.reactivex.rxjava3.disposables.d {

    /* renamed from: b, reason: collision with root package name */
    public final L<? super io.reactivex.rxjava3.core.y<T>> f403419b;

    /* renamed from: c, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.d f403420c;

    public p(L<? super io.reactivex.rxjava3.core.y<T>> l12) {
        this.f403419b = l12;
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        if (DisposableHelper.f(this.f403420c, dVar)) {
            this.f403420c = dVar;
            this.f403419b.b(this);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        this.f403420c.dispose();
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void e() {
        this.f403419b.onSuccess(io.reactivex.rxjava3.core.y.f401974b);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f403420c.getF318621e();
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onError(Throwable th2) {
        this.f403419b.onSuccess(io.reactivex.rxjava3.core.y.a(th2));
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onSuccess(T t12) {
        Objects.requireNonNull(t12, "value is null");
        this.f403419b.onSuccess(new io.reactivex.rxjava3.core.y(t12));
    }
}
