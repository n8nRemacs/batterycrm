package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.operators.flowable.C41867m0;

/* compiled from: CompletableToFlowable.java */
/* loaded from: classes8.dex */
public final class Q<T> extends AbstractC41777j<T> {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC41768a f402205c;

    public Q(AbstractC41768a abstractC41768a) {
        this.f402205c = abstractC41768a;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402205c.a(new C41867m0.a((InterfaceC41782o) dVar));
    }
}
