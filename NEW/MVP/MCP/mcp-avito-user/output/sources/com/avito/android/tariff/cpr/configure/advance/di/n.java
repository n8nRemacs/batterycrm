package com.avito.android.tariff.cpr.configure.advance.di;

import com.avito.android.tariff.cpr.configure.deeplink.TariffCprConfigureSaveLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CprConfigureMappingsModule_ProvideCprConfigureSaveMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpr.configure.deeplink.l f295223a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff.cpr.configure.deeplink.n f295224b;

    public n(com.avito.android.tariff.cpr.configure.deeplink.l lVar, com.avito.android.tariff.cpr.configure.deeplink.n nVar) {
        this.f295223a = lVar;
        this.f295224b = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f295224b.getClass();
        com.avito.android.tariff.cpr.configure.deeplink.m mVar = new com.avito.android.tariff.cpr.configure.deeplink.m();
        com.avito.android.tariff.cpr.configure.deeplink.l lVar = this.f295223a;
        k.f295218a.getClass();
        return new C43834a(TariffCprConfigureSaveLink.class, mVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffCprConfigureSaveLink.class), lVar));
    }
}
