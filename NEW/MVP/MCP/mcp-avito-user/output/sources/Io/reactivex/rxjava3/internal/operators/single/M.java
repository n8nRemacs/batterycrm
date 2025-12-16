package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: SingleJust.java */
/* loaded from: classes8.dex */
public final class M<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final T f404511b;

    public M(T t12) {
        this.f404511b = t12;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        l12.b(EmptyDisposable.f401988b);
        l12.onSuccess(this.f404511b);
    }
}
