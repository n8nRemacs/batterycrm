package com.avito.android.trx_promo_impl.di;

import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureApplyLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TrxPromoDeeplinkMappingsModule_ProvideConfigureApplyMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_impl.deeplink.c f304149a;

    public h(com.avito.android.trx_promo_impl.deeplink.c cVar) {
        this.f304149a = cVar;
    }

    public static C43834a a(com.avito.android.trx_promo_impl.deeplink.c cVar) {
        g.f304148a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TrxPromoConfigureApplyLink.class, new com.avito.android.trx_promo_impl.deeplink.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TrxPromoConfigureApplyLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f304149a);
    }
}
