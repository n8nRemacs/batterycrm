package com.avito.android.safedeal.delivery.order_cancellation;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: RdsOrderCancellationReasonsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.safedeal.delivery.order_cancellation.mvi.g f256397a;

    public n(com.avito.android.safedeal.delivery.order_cancellation.mvi.g gVar) {
        this.f256397a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.safedeal.delivery.order_cancellation.mvi.f fVar = (com.avito.android.safedeal.delivery.order_cancellation.mvi.f) this.f256397a.get();
        i2.f411430a.getClass();
        return new m(fVar, i2.a.f411433c);
    }
}
