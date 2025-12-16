package com.avito.android.tariff_lf_publication.level.di;

import com.avito.android.tariff_lf_publication.level.deeplink.TariffLfPublicationLevelLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: TariffLfPublicationLevelFragmentMappingsModule_ProvideTariffLevelSelectionFragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<A50.a> {

    /* compiled from: TariffLfPublicationLevelFragmentMappingsModule_ProvideTariffLevelSelectionFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f300905a = new f();
    }

    public static f a() {
        return a.f300905a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e.f300904a.getClass();
        return new A50.a(m0.f406844a.b(TariffLfPublicationLevelLink.class), new com.avito.android.tariff_lf_publication.level.f());
    }
}
