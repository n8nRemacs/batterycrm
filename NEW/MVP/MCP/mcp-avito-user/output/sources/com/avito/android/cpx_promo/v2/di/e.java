package com.avito.android.cpx_promo.v2.di;

import com.avito.android.cpx_promo.common.deeplink.CpxPromoV2Link;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CpxPromoV2DeeplinkMappingsModule_ProvideCpxPromoV2MappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpx_promo.v2.deeplink.c f127422a;

    public e(com.avito.android.cpx_promo.v2.deeplink.c cVar) {
        this.f127422a = cVar;
    }

    public static C43834a a(com.avito.android.cpx_promo.v2.deeplink.c cVar) {
        b.f127419a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CpxPromoV2Link.class, new com.avito.android.cpx_promo.v2.deeplink.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CpxPromoV2Link.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f127422a);
    }
}
