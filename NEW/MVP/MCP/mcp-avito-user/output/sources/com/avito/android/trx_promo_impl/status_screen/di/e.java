package com.avito.android.trx_promo_impl.status_screen.di;

import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureSuccessLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TrxPromoStatusDeeplinkMappingsModule_ProvideConfigureSuccessMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_impl.status_screen.deeplink.e f304430a;

    public e(com.avito.android.trx_promo_impl.status_screen.deeplink.e eVar) {
        this.f304430a = eVar;
    }

    public static C43834a a(com.avito.android.trx_promo_impl.status_screen.deeplink.e eVar) {
        c.f304428a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TrxPromoConfigureSuccessLink.class, new com.avito.android.trx_promo_impl.status_screen.deeplink.f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TrxPromoConfigureSuccessLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f304430a);
    }
}
