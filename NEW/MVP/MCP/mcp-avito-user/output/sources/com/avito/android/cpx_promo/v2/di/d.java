package com.avito.android.cpx_promo.v2.di;

import com.avito.android.cpx_promo.common.deeplink.CpxPromoSaveLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CpxPromoV2DeeplinkMappingsModule_ProvideCpxPromoSaveMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpx_promo.common.deeplink.e f127421a;

    public d(com.avito.android.cpx_promo.common.deeplink.e eVar) {
        this.f127421a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b.f127419a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CpxPromoSaveLink.class, new com.avito.android.cpx_promo.common.deeplink.f(), new C43834a.b.C11809b(this.f127421a));
    }
}
