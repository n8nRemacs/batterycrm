package com.avito.android.safedeal.delivery.order_cancellation.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RdsOrderCancellationReasonsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.safedeal.delivery.order_cancellation.domain.b f256377a;

    public d(com.avito.android.safedeal.delivery.order_cancellation.domain.b bVar) {
        this.f256377a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.safedeal.delivery.order_cancellation.domain.a) this.f256377a.get());
    }
}
