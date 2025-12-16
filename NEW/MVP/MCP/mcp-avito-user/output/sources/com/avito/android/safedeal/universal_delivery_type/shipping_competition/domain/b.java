package com.avito.android.safedeal.universal_delivery_type.shipping_competition.domain;

import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalDeliveryTypeShippingCompetitionUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f256812a;

    /* renamed from: b, reason: collision with root package name */
    public final u f256813b;

    public b(l lVar, u uVar) {
        this.f256812a = lVar;
        this.f256813b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((UniversalDeliveryTypeContent.Tab.ShippingCompetition) this.f256812a.f393949a, (com.avito.android.safedeal.universal_delivery_type.shipping_competition.a) this.f256813b.get());
    }
}
