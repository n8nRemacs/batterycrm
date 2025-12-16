package com.avito.android.tariff.cpx.level.feature.di;

import com.avito.android.tariff.deeplink.TariffCpxLevelFeatureLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffCpxLevelFeatureDeeplinkMappingsModule_ProvideTariffCpxLevelFeatureMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final CB0.e f296967a;

    public d(CB0.e eVar) {
        this.f296967a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        CB0.e eVar = this.f296967a;
        c.f296966a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCpxLevelFeatureLink.class, new CB0.c(), new C43834a.b.C11809b(eVar));
    }
}
