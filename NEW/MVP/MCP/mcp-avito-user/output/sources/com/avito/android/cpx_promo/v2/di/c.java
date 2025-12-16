package com.avito.android.cpx_promo.v2.di;

import com.avito.android.cpx_promo.common.deeplink.CpxPromoRemoveLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CpxPromoV2DeeplinkMappingsModule_ProvideCpxPromoRemoveMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpx_promo.common.deeplink.b f127420a;

    public c(com.avito.android.cpx_promo.common.deeplink.b bVar) {
        this.f127420a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b.f127419a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CpxPromoRemoveLink.class, new com.avito.android.cpx_promo.common.deeplink.c(), new C43834a.b.C11809b(this.f127420a));
    }
}
