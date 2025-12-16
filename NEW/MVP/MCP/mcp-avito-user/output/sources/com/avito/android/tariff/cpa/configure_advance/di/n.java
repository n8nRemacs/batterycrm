package com.avito.android.tariff.cpa.configure_advance.di;

import com.avito.android.tariff.deeplink.TariffCpaPublicationSaveLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CpaConfigureMappingsModule_ProvideCpaPublicationSaveDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpa.deeplink.m f294279a;

    public n(com.avito.android.tariff.cpa.deeplink.m mVar) {
        this.f294279a = mVar;
    }

    public static C43834a a(com.avito.android.tariff.cpa.deeplink.m mVar) {
        j.f294275a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCpaPublicationSaveLink.class, new com.avito.android.tariff.cpa.deeplink.n(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffCpaPublicationSaveLink.class), mVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f294279a);
    }
}
