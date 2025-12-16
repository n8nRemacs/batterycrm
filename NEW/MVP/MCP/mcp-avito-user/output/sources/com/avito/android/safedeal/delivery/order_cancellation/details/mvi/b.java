package com.avito.android.safedeal.delivery.order_cancellation.details.mvi;

import com.avito.android.remote.model.ReasonRds;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReasonDetailsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f256237a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.safedeal.delivery.order_cancellation.details.usecase.c f256238b;

    public b(l lVar, com.avito.android.safedeal.delivery.order_cancellation.details.usecase.c cVar) {
        this.f256237a = lVar;
        this.f256238b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((ReasonRds) this.f256237a.f393949a, (com.avito.android.safedeal.delivery.order_cancellation.details.usecase.a) this.f256238b.get());
    }
}
