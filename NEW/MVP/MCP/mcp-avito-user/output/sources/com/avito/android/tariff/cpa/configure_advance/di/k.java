package com.avito.android.tariff.cpa.configure_advance.di;

import com.avito.android.tariff.cpa.configure_advance.deeplink.ConfigureAdvanceLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CpaConfigureMappingsModule_ProvideCpaConfigureAdvanceDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpa.configure_advance.deeplink.b f294276a;

    public k(com.avito.android.tariff.cpa.configure_advance.deeplink.b bVar) {
        this.f294276a = bVar;
    }

    public static C43834a a(com.avito.android.tariff.cpa.configure_advance.deeplink.b bVar) {
        j.f294275a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ConfigureAdvanceLink.class, new com.avito.android.tariff.cpa.configure_advance.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ConfigureAdvanceLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f294276a);
    }
}
