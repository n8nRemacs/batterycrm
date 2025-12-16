package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* compiled from: ObservableDefer.java */
/* loaded from: classes8.dex */
public final class F<T> extends io.reactivex.rxjava3.core.z<T> {

    /* renamed from: b, reason: collision with root package name */
    public final l41.s<? extends io.reactivex.rxjava3.core.E<? extends T>> f403595b;

    public F(l41.s<? extends io.reactivex.rxjava3.core.E<? extends T>> sVar) {
        this.f403595b = sVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        try {
            io.reactivex.rxjava3.core.E<? extends T> e12 = this.f403595b.get();
            Objects.requireNonNull(e12, "The supplier returned a null ObservableSource");
            e12.c(g12);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.d(th2, g12);
        }
    }
}
