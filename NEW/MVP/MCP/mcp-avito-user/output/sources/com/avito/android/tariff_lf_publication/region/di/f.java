package com.avito.android.tariff_lf_publication.region.di;

import com.avito.android.tariff_lf_publication.region.deeplink.TariffLfPublicationRegionLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: TariffLfPublicationRegionFragmentMappingsModule_ProvideTariffLevelSelectionFragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<A50.a> {

    /* compiled from: TariffLfPublicationRegionFragmentMappingsModule_ProvideTariffLevelSelectionFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f301075a = new f();
    }

    public static f a() {
        return a.f301075a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e.f301074a.getClass();
        return new A50.a(m0.f406844a.b(TariffLfPublicationRegionLink.class), new com.avito.android.tariff_lf_publication.region.c());
    }
}
