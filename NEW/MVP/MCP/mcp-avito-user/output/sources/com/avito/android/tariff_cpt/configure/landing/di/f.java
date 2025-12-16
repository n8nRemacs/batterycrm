package com.avito.android.tariff_cpt.configure.landing.di;

import com.avito.android.tariff_cpt.configure.landing.deeplink.TariffCptConfigureLandingLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import nC0.C44232b;
import nC0.C44233c;

/* compiled from: TariffCptLandingDeeplinkMappingsModule_ProvideCptLandingMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C44232b f297756a;

    public f(C44232b c44232b) {
        this.f297756a = c44232b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C44232b c44232b = this.f297756a;
        e.f297755a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCptConfigureLandingLink.class, new C44233c(), new C43834a.b.C11809b(c44232b));
    }
}
