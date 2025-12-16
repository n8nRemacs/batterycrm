package com.avito.android.tariff.cpr.configure.advance.di;

import com.avito.android.tariff.cpr.configure.deeplink.TariffCprConfigureAdvanceLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CprConfigureMappingsModule_ProvideCprConfigureAdvanceMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpr.configure.deeplink.b f295221a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff.cpr.configure.deeplink.d f295222b;

    public m(com.avito.android.tariff.cpr.configure.deeplink.b bVar, com.avito.android.tariff.cpr.configure.deeplink.d dVar) {
        this.f295221a = bVar;
        this.f295222b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f295222b.getClass();
        com.avito.android.tariff.cpr.configure.deeplink.c cVar = new com.avito.android.tariff.cpr.configure.deeplink.c();
        com.avito.android.tariff.cpr.configure.deeplink.b bVar = this.f295221a;
        k.f295218a.getClass();
        return new C43834a(TariffCprConfigureAdvanceLink.class, cVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffCprConfigureAdvanceLink.class), bVar));
    }
}
