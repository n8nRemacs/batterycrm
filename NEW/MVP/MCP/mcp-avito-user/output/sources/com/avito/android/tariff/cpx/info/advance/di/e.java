package com.avito.android.tariff.cpx.info.advance.di;

import com.avito.android.tariff.cpx.info.advance.deeplink.j;
import com.avito.android.tariff.deeplink.TariffCpxInfoAdvanceShowLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffCpxInfoAdvanceDeeplinkMappingsModule_ProvideTariffCpxInfoAdvanceShowDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.info.advance.deeplink.g f296326a;

    public e(com.avito.android.tariff.cpx.info.advance.deeplink.g gVar) {
        this.f296326a = gVar;
    }

    public static C43834a a(com.avito.android.tariff.cpx.info.advance.deeplink.g gVar) {
        c.f296324a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCpxInfoAdvanceShowLink.class, new j(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffCpxInfoAdvanceShowLink.class), gVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f296326a);
    }
}
