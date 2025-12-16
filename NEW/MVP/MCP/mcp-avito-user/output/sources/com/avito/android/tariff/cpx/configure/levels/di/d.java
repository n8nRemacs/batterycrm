package com.avito.android.tariff.cpx.configure.levels.di;

import com.avito.android.tariff.cpx.configure.levels.deeplink.TariffCpxConfigureLevelsLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffCpxConfigureLevelsDeeplinkMappingsModule_ProvideTariffCpxConfigureLevelsMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.configure.levels.deeplink.d f296112a;

    public d(com.avito.android.tariff.cpx.configure.levels.deeplink.d dVar) {
        this.f296112a = dVar;
    }

    public static C43834a a(com.avito.android.tariff.cpx.configure.levels.deeplink.d dVar) {
        c.f296111a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCpxConfigureLevelsLink.class, new com.avito.android.tariff.cpx.configure.levels.deeplink.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffCpxConfigureLevelsLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f296112a);
    }
}
