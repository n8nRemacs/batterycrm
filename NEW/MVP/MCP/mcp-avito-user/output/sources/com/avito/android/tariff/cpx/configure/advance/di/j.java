package com.avito.android.tariff.cpx.configure.advance.di;

import com.avito.android.tariff.cpx.configure.advance.deeplink.TariffCpxConfigureAdvanceSaveDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CpxConfigureAdvanceMappingsModule_ProvideCpxConfigureAdvanceSaveMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.configure.advance.deeplink.h f295594a;

    public j(com.avito.android.tariff.cpx.configure.advance.deeplink.h hVar) {
        this.f295594a = hVar;
    }

    public static C43834a a(com.avito.android.tariff.cpx.configure.advance.deeplink.h hVar) {
        h.f295592a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCpxConfigureAdvanceSaveDeepLink.class, new com.avito.android.tariff.cpx.configure.advance.deeplink.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffCpxConfigureAdvanceSaveDeepLink.class), hVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f295594a);
    }
}
