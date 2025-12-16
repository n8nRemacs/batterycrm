package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: MaybeErrorCallable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41931z<T> extends io.reactivex.rxjava3.core.q<T> {
    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        tVar.b(EmptyDisposable.f401988b);
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            tVar.onError(th2);
        }
    }
}
