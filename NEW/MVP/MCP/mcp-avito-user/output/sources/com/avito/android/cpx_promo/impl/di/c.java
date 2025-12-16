package com.avito.android.cpx_promo.impl.di;

import com.avito.android.cpx_promo.common.deeplink.CpxPromoLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CpxPromoDeeplinkMappingsModule_ProvideCpxPromoMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpx_promo.impl.deeplink.c f126946a;

    public c(com.avito.android.cpx_promo.impl.deeplink.c cVar) {
        this.f126946a = cVar;
    }

    public static C43834a a(com.avito.android.cpx_promo.impl.deeplink.c cVar) {
        b.f126945a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CpxPromoLink.class, new com.avito.android.cpx_promo.impl.deeplink.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CpxPromoLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f126946a);
    }
}
