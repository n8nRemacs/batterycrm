package com.avito.android.tariff.cpa.info.di;

import com.avito.android.tariff.deeplink.TariffCpaInfoLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CpaInfoDeeplinkMappingsModule_ProvideTariffCpaInfoDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpa.info.deeplink.b f294636a;

    public c(com.avito.android.tariff.cpa.info.deeplink.b bVar) {
        this.f294636a = bVar;
    }

    public static C43834a a(com.avito.android.tariff.cpa.info.deeplink.b bVar) {
        b.f294635a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCpaInfoLink.class, new com.avito.android.tariff.cpa.info.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffCpaInfoLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f294636a);
    }
}
