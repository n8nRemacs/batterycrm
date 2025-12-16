package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: MaybeJust.java */
/* loaded from: classes8.dex */
public final class W<T> extends io.reactivex.rxjava3.core.q<T> implements q41.e<T> {

    /* renamed from: b, reason: collision with root package name */
    public final T f403184b;

    public W(T t12) {
        this.f403184b = t12;
    }

    @Override // l41.s
    public final T get() {
        return this.f403184b;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        tVar.b(EmptyDisposable.f401988b);
        tVar.onSuccess(this.f403184b);
    }
}
