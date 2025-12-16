package com.avito.android.item_price_history.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.favorite.m;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ItemPriceHistoryDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final m f173671a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f173672b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f173673c;

    public e(m mVar, dv.b bVar, Provider provider) {
        this.f173671a = mVar;
        this.f173672b = bVar;
        this.f173673c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.favorite.h) this.f173671a.get(), (a.d) this.f173672b.get(), this.f173673c.get());
    }
}
