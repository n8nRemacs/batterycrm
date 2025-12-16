package com.avito.android.trx_promo_impl.di;

import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureResetLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TrxPromoDeeplinkMappingsModule_ProvideConfigureResetMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_impl.deeplink.m f304152a;

    public k(com.avito.android.trx_promo_impl.deeplink.m mVar) {
        this.f304152a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g.f304148a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TrxPromoConfigureResetLink.class, new com.avito.android.trx_promo_impl.deeplink.n(), new C43834a.b.C11809b(this.f304152a));
    }
}
