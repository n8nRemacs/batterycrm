package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: FlowableWindowSubscribeIntercept.java */
/* loaded from: classes8.dex */
final class d2<T> extends AbstractC41777j<T> {

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.processors.c<T> f402728c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f402729d = new AtomicBoolean();

    public d2(io.reactivex.rxjava3.processors.c<T> cVar) {
        this.f402728c = cVar;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402728c.d(dVar);
        this.f402729d.set(true);
    }

    public final boolean z() {
        AtomicBoolean atomicBoolean = this.f402729d;
        return !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
    }
}
