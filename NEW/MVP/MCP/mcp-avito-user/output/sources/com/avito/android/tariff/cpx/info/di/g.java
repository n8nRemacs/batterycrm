package com.avito.android.tariff.cpx.info.di;

import com.avito.android.tariff.deeplink.TariffCpxInfoRefreshLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffCpxInfoDeeplinkMappingsModule_ProvideTariffCpxInfoRefreshMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.info.deeplink.e f296403a;

    public g(com.avito.android.tariff.cpx.info.deeplink.e eVar) {
        this.f296403a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e.f296401a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCpxInfoRefreshLink.class, new com.avito.android.tariff.cpx.info.deeplink.f(), new C43834a.b.C11809b(this.f296403a));
    }
}
