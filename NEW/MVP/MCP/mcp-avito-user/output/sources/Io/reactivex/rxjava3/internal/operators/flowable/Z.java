package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;

/* compiled from: FlowableError.java */
/* loaded from: classes8.dex */
public final class Z<T> extends AbstractC41777j<T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.s<? extends Throwable> f402583c;

    public Z(l41.s<? extends Throwable> sVar) {
        this.f402583c = sVar;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        Throwable th2;
        try {
            th2 = this.f402583c.get();
        } catch (Throwable th3) {
            th = th3;
            io.reactivex.rxjava3.exceptions.a.a(th);
        }
        if (th2 == null) {
            throw io.reactivex.rxjava3.internal.util.h.b("Callable returned a null Throwable.");
        }
        Throwable th4 = io.reactivex.rxjava3.internal.util.h.f404834a;
        th = th2;
        EmptySubscription.b(th, dVar);
    }
}
