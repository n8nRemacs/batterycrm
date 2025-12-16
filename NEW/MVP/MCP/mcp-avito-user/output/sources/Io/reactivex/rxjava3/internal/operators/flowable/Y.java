package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;

/* compiled from: FlowableEmpty.java */
/* loaded from: classes8.dex */
public final class Y extends AbstractC41777j<Object> implements q41.e<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final Y f402580c = new Y();

    @Override // l41.s
    public final Object get() {
        return null;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super Object> dVar) {
        EmptySubscription.a(dVar);
    }
}
