package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: SingleError.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42025x<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final l41.s<? extends Throwable> f404650b;

    public C42025x(l41.s<? extends Throwable> sVar) {
        this.f404650b = sVar;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        Throwable th2;
        try {
            th2 = this.f404650b.get();
        } catch (Throwable th3) {
            th = th3;
            io.reactivex.rxjava3.exceptions.a.a(th);
        }
        if (th2 == null) {
            throw io.reactivex.rxjava3.internal.util.h.b("Supplier returned a null Throwable.");
        }
        Throwable th4 = io.reactivex.rxjava3.internal.util.h.f404834a;
        th = th2;
        EmptyDisposable.e(th, l12);
    }
}
