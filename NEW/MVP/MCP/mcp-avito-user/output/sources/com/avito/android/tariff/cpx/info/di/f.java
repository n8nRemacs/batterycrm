package com.avito.android.tariff.cpx.info.di;

import com.avito.android.tariff.deeplink.TariffCpxInfoLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffCpxInfoDeeplinkMappingsModule_ProvideTariffCpxInfoMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.info.deeplink.c f296402a;

    public f(com.avito.android.tariff.cpx.info.deeplink.c cVar) {
        this.f296402a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff.cpx.info.deeplink.c cVar = this.f296402a;
        e.f296401a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCpxInfoLink.class, new com.avito.android.tariff.cpx.info.deeplink.a(), new C43834a.b.C11809b(cVar));
    }
}
