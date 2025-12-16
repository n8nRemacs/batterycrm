package com.avito.android.tariff_lf_publication.region.deeplink;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffLfPublicationRegionDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f301049a;

    public b(com.avito.android.paid_services_impl.e eVar) {
        this.f301049a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.paid_services.a) this.f301049a.get());
    }
}
