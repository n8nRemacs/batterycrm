package com.avito.android.advert.item.sales_banner.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StickedSalesBannerAnalyticsInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f79303a;

    /* renamed from: b, reason: collision with root package name */
    public final l f79304b;

    public b(l lVar, Provider provider) {
        this.f79303a = provider;
        this.f79304b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f79303a.get(), (String) this.f79304b.f393949a);
    }
}
