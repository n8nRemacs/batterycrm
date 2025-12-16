package com.avito.android.tariff.cpx.configure.advance.di;

import com.avito.android.tariff.cpx.configure.advance.deeplink.TariffCpxConfigureAdvanceDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CpxConfigureAdvanceMappingsModule_ProvideCpxConfigureAdvanceMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.configure.advance.deeplink.c f295593a;

    public i(com.avito.android.tariff.cpx.configure.advance.deeplink.c cVar) {
        this.f295593a = cVar;
    }

    public static C43834a a(com.avito.android.tariff.cpx.configure.advance.deeplink.c cVar) {
        h.f295592a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCpxConfigureAdvanceDeepLink.class, new com.avito.android.tariff.cpx.configure.advance.deeplink.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffCpxConfigureAdvanceDeepLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f295593a);
    }
}
