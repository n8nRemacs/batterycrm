package com.avito.android.trx_promo_impl.status_screen.di;

import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureSuccessLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: TrxPromoStatusFragmentMappingsModule_ProvideTrxPromoFragmentStatusSuccessMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<A50.a> {

    /* compiled from: TrxPromoStatusFragmentMappingsModule_ProvideTrxPromoFragmentStatusSuccessMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f304433a = new h();
    }

    public static h a() {
        return a.f304433a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f.f304431a.getClass();
        return new A50.a(m0.f406844a.b(TrxPromoConfigureSuccessLink.class), new com.avito.android.trx_promo_impl.status_screen.b());
    }
}
