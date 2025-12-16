package com.avito.android.trx_promo_impl.di;

import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureCancelLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TrxPromoDeeplinkMappingsModule_ProvideConfigureCancelMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_impl.deeplink.g f304150a;

    public i(com.avito.android.trx_promo_impl.deeplink.g gVar) {
        this.f304150a = gVar;
    }

    public static C43834a a(com.avito.android.trx_promo_impl.deeplink.g gVar) {
        g.f304148a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TrxPromoConfigureCancelLink.class, new com.avito.android.trx_promo_impl.deeplink.h(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TrxPromoConfigureCancelLink.class), gVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f304150a);
    }
}
