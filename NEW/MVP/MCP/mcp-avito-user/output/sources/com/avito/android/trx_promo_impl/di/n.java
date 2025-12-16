package com.avito.android.trx_promo_impl.di;

import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: TrxPromoFragmentMappingsModule_ProvideTrxPromoMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<A50.a> {

    /* compiled from: TrxPromoFragmentMappingsModule_ProvideTrxPromoMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final n f304154a = new n();
    }

    public static n a() {
        return a.f304154a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        m.f304153a.getClass();
        return new A50.a(m0.f406844a.b(TrxPromoConfigureLink.class), new com.avito.android.trx_promo_impl.i());
    }
}
