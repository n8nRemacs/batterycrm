package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: MaybeError.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41930y<T> extends io.reactivex.rxjava3.core.q<T> {

    /* renamed from: b, reason: collision with root package name */
    public final Exception f403341b;

    public C41930y(Exception exc) {
        this.f403341b = exc;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        tVar.b(EmptyDisposable.f401988b);
        tVar.onError(this.f403341b);
    }
}
