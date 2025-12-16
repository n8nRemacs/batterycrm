package com.avito.android.tariff.cpr.configure.advance.di;

import com.avito.android.tariff.cpr.configure.deeplink.TariffCprConfigureAdvanceManualLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CprConfigureMappingsModule_ProvideCprConfigureAdvanceManualMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpr.configure.deeplink.f f295219a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff.cpr.configure.deeplink.h f295220b;

    public l(com.avito.android.tariff.cpr.configure.deeplink.f fVar, com.avito.android.tariff.cpr.configure.deeplink.h hVar) {
        this.f295219a = fVar;
        this.f295220b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f295220b.getClass();
        com.avito.android.tariff.cpr.configure.deeplink.g gVar = new com.avito.android.tariff.cpr.configure.deeplink.g();
        com.avito.android.tariff.cpr.configure.deeplink.f fVar = this.f295219a;
        k.f295218a.getClass();
        return new C43834a(TariffCprConfigureAdvanceManualLink.class, gVar, new C43834a.b.C11809b(fVar));
    }
}
