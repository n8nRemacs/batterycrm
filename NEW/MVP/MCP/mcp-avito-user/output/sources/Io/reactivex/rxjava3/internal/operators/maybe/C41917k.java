package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* compiled from: MaybeDefer.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41917k<T> extends io.reactivex.rxjava3.core.q<T> {

    /* renamed from: b, reason: collision with root package name */
    public final l41.s<? extends io.reactivex.rxjava3.core.w<? extends T>> f403259b;

    public C41917k(l41.s<? extends io.reactivex.rxjava3.core.w<? extends T>> sVar) {
        this.f403259b = sVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        try {
            io.reactivex.rxjava3.core.w<? extends T> wVar = this.f403259b.get();
            Objects.requireNonNull(wVar, "The maybeSupplier returned a null MaybeSource");
            wVar.a(tVar);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.c(th2, tVar);
        }
    }
}
