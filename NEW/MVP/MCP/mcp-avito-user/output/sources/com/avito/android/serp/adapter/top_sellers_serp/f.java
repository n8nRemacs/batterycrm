package com.avito.android.serp.adapter.top_sellers_serp;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TopSellersSerpWidgetPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f272474a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f272475b;

    public f(Provider<InterfaceC28373a> provider, Provider<com.avito.android.analytics.provider.a> provider2) {
        this.f272474a = provider;
        this.f272475b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f272474a.get(), this.f272475b.get());
    }
}
