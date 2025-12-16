package com.avito.android.tariff_lf_publication.count.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffLfPublicationCountReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_lf_publication.count.data.mapper.c f300851a;

    public l(com.avito.android.tariff_lf_publication.count.data.mapper.c cVar) {
        this.f300851a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.tariff_lf_publication.count.data.mapper.a) this.f300851a.get());
    }
}
