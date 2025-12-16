package com.avito.android.cpx_promo.delayedstart.di;

import com.avito.android.cpx_promo.delayedstart.deeplink.CpxPromoDelayedStartLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CpxPromoDelayedStartDeeplinkMappingsModule_ProvideCpxPromoDelayedStartMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpx_promo.delayedstart.deeplink.e f126837a;

    public c(com.avito.android.cpx_promo.delayedstart.deeplink.e eVar) {
        this.f126837a = eVar;
    }

    public static C43834a a(com.avito.android.cpx_promo.delayedstart.deeplink.e eVar) {
        b.f126836a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CpxPromoDelayedStartLink.class, new com.avito.android.cpx_promo.delayedstart.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CpxPromoDelayedStartLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f126837a);
    }
}
