package com.avito.android.free_delivery.mvi;

import com.avito.android.free_delivery.FreeDeliveryDetails;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FreeDeliveryOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f158808a;

    public m(dagger.internal.l lVar) {
        this.f158808a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((FreeDeliveryDetails) this.f158808a.f393949a);
    }
}
