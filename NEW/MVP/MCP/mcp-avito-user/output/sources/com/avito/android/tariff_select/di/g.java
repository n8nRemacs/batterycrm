package com.avito.android.tariff_select.di;

import com.avito.android.tariff_select.deeplink.TariffSelectDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffSelectDeeplinkMappingsModule_ProvideTariffSelectDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final YD0.c f301205a;

    public g(YD0.c cVar) {
        this.f301205a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        YD0.c cVar = this.f301205a;
        f.f301204a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffSelectDeepLink.class, new YD0.a(), new C43834a.b.C11809b(cVar));
    }
}
