package com.avito.android.trx_promo_goods.screens.configure.di;

import dagger.internal.x;
import dagger.internal.y;
import java.time.Clock;

/* compiled from: TrxPromoGoodsConfigureModule_ProvideClockFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<Clock> {

    /* compiled from: TrxPromoGoodsConfigureModule_ProvideClockFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final l f303462a = new l();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j.f303460a.getClass();
        return Clock.systemDefaultZone();
    }
}
