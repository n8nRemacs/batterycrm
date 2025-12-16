package com.avito.android.tariff_lf_publication.count.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffLfPublicationCountActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_lf_publication.count.domain.d f300820a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff_lf_publication.count.domain.b f300821b;

    public c(com.avito.android.tariff_lf_publication.count.domain.d dVar, com.avito.android.tariff_lf_publication.count.domain.b bVar) {
        this.f300820a = dVar;
        this.f300821b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.tariff_lf_publication.count.domain.c) this.f300820a.get(), (com.avito.android.tariff_lf_publication.count.domain.a) this.f300821b.get());
    }
}
