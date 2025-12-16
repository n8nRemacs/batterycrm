package com.avito.android.trx_promo_impl.status_screen.di;

import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureForbiddenLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: TrxPromoStatusFragmentMappingsModule_ProvideTrxPromoFragmentStatusForbiddenMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<A50.a> {

    /* compiled from: TrxPromoStatusFragmentMappingsModule_ProvideTrxPromoFragmentStatusForbiddenMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f304432a = new g();
    }

    public static g a() {
        return a.f304432a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f.f304431a.getClass();
        return new A50.a(m0.f406844a.b(TrxPromoConfigureForbiddenLink.class), new com.avito.android.trx_promo_impl.status_screen.a());
    }
}
