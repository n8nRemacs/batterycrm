package com.avito.android.tariff_lf_publication.region.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffLfPublicationRegionBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_lf_publication.region.domain.b f301096a;

    public d(com.avito.android.tariff_lf_publication.region.domain.b bVar) {
        this.f301096a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.tariff_lf_publication.region.domain.a) this.f301096a.get());
    }
}
