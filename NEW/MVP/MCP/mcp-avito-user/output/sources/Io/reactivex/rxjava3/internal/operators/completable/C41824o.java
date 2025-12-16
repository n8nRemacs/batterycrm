package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: CompletableError.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.completable.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41824o extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f402261b;

    public C41824o(Throwable th2) {
        this.f402261b = th2;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        EmptyDisposable.b(this.f402261b, interfaceC41771d);
    }
}
