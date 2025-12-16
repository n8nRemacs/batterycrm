package com.avito.android.tariff_lf_publication.count.di;

import com.avito.android.tariff_lf_publication.count.deeplink.TariffLfPublicationCountLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: TariffLfPublicationCountFragmentMappingsModule_ProvideTariffLevelSelectionFragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<A50.a> {

    /* compiled from: TariffLfPublicationCountFragmentMappingsModule_ProvideTariffLevelSelectionFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f300785a = new f();
    }

    public static f a() {
        return a.f300785a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e.f300784a.getClass();
        return new A50.a(m0.f406844a.b(TariffLfPublicationCountLink.class), new com.avito.android.tariff_lf_publication.count.d());
    }
}
