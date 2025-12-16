package com.avito.android.tariff_lf_publication.region.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffLfPublicationRegionActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_lf_publication.region.domain.b f301094a;

    public b(com.avito.android.tariff_lf_publication.region.domain.b bVar) {
        this.f301094a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.tariff_lf_publication.region.domain.a) this.f301094a.get());
    }
}
