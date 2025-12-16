package com.avito.android.tariff_lf_publication.region.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffLfPublicationRegionReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_lf_publication.region.data.mapper.c f301118a;

    public k(com.avito.android.tariff_lf_publication.region.data.mapper.c cVar) {
        this.f301118a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.tariff_lf_publication.region.data.mapper.a) this.f301118a.get());
    }
}
