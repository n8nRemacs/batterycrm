package com.avito.android.tariff_lf_publication.level.di;

import com.avito.android.tariff_lf_publication.level.deeplink.TariffLfPublicationLevelLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffLfPublicationLevelDeeplinkMappingsModule_ProvideTariffLfPublicationLevelDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_lf_publication.level.deeplink.b f300903a;

    public d(com.avito.android.tariff_lf_publication.level.deeplink.b bVar) {
        this.f300903a = bVar;
    }

    public static C43834a a(com.avito.android.tariff_lf_publication.level.deeplink.b bVar) {
        c.f300902a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffLfPublicationLevelLink.class, new com.avito.android.tariff_lf_publication.level.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffLfPublicationLevelLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f300903a);
    }
}
