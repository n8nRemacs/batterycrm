package com.avito.android.free_delivery.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FreeDeliveryActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.free_delivery.domain.b f158793a;

    public f(com.avito.android.free_delivery.domain.b bVar) {
        this.f158793a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.free_delivery.domain.a) this.f158793a.get());
    }
}
