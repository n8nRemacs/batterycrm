package com.avito.android.tariff_cpt.configure.levels.di;

import com.avito.android.tariff_cpt.configure.levels.deeplink.TariffCptConfigureLevelsLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import pC0.C46931a;
import pC0.C46933c;

/* compiled from: TariffCptConfigureLevelsDeeplinkMappingsModule_ProvideTariffCptConfigureLevelsMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C46933c f297850a;

    public d(C46933c c46933c) {
        this.f297850a = c46933c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C46933c c46933c = this.f297850a;
        c.f297849a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCptConfigureLevelsLink.class, new C46931a(), new C43834a.b.C11809b(c46933c));
    }
}
