package com.avito.android.tariff_cpt.configure.forbidden.di;

import com.avito.android.tariff_cpt.configure.forbidden.deeplink.TariffCptForbiddenLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffCptForbiddenDeeplinkMappingsModule_ProvideCptForbiddenMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.configure.forbidden.deeplink.b f297627a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.configure.forbidden.deeplink.d f297628b;

    public f(com.avito.android.tariff_cpt.configure.forbidden.deeplink.b bVar, com.avito.android.tariff_cpt.configure.forbidden.deeplink.d dVar) {
        this.f297627a = bVar;
        this.f297628b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f297628b.getClass();
        com.avito.android.tariff_cpt.configure.forbidden.deeplink.c cVar = new com.avito.android.tariff_cpt.configure.forbidden.deeplink.c();
        com.avito.android.tariff_cpt.configure.forbidden.deeplink.b bVar = this.f297627a;
        e.f297626a.getClass();
        return new C43834a(TariffCptForbiddenLink.class, cVar, new C43834a.b.C11809b(bVar));
    }
}
