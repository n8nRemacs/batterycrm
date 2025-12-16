package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.operators.flowable.I1;

/* compiled from: FlowableTakePublisher.java */
/* loaded from: classes8.dex */
public final class M1<T> extends AbstractC41777j<T> {

    /* renamed from: c, reason: collision with root package name */
    public final org.reactivestreams.c<T> f402444c;

    /* renamed from: d, reason: collision with root package name */
    public final long f402445d = 1;

    public M1(org.reactivestreams.c cVar) {
        this.f402444c = cVar;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402444c.d(new I1.a((InterfaceC41782o) dVar, this.f402445d));
    }
}
