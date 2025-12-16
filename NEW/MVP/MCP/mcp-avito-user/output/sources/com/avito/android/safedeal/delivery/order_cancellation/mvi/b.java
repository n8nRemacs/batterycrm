package com.avito.android.safedeal.delivery.order_cancellation.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RdsOrderCancellationReasonsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.safedeal.delivery.order_cancellation.domain.b f256375a;

    public b(com.avito.android.safedeal.delivery.order_cancellation.domain.b bVar) {
        this.f256375a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.safedeal.delivery.order_cancellation.domain.a) this.f256375a.get());
    }
}
