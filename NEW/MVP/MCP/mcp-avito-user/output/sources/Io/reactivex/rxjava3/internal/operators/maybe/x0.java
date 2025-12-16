package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: MaybeZipIterable.java */
/* loaded from: classes8.dex */
public final class x0<T, R> extends io.reactivex.rxjava3.core.q<R> {

    /* compiled from: MaybeZipIterable.java */
    public final class a implements l41.o<T, R> {
        @Override // l41.o
        public final R apply(T t12) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super R> tVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.c(th2, tVar);
        }
    }
}
