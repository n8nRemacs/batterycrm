package com.avito.android.tariff.cpx.limit.sheet.di;

import com.avito.android.tariff.cpx.limit.sheet.deeplink.TariffCpxLimitShowLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffCpxLimitShowDeeplinkMappingsModule_ProvideTariffCpxLimitsMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.limit.sheet.deeplink.f f297292a;

    public g(com.avito.android.tariff.cpx.limit.sheet.deeplink.f fVar) {
        this.f297292a = fVar;
    }

    public static C43834a a(com.avito.android.tariff.cpx.limit.sheet.deeplink.f fVar) {
        f.f297291a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCpxLimitShowLink.class, new com.avito.android.tariff.cpx.limit.sheet.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffCpxLimitShowLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f297292a);
    }
}
