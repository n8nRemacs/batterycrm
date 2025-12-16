package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* compiled from: SingleDefer.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42007e<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final l41.s<? extends io.reactivex.rxjava3.core.O<? extends T>> f404571b;

    public C42007e(l41.s<? extends io.reactivex.rxjava3.core.O<? extends T>> sVar) {
        this.f404571b = sVar;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        try {
            io.reactivex.rxjava3.core.O<? extends T> o12 = this.f404571b.get();
            Objects.requireNonNull(o12, "The singleSupplier returned a null SingleSource");
            o12.a(l12);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.e(th2, l12);
        }
    }
}
