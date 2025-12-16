package com.avito.android.serp.adapter.top_sellers_serp.top_sellers_serp_list;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TopSellerSerpPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f272500a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f272501b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f272502c;

    public e(dagger.internal.f fVar, Provider provider, Provider provider2) {
        this.f272500a = fVar;
        this.f272501b = provider;
        this.f272502c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(g.b(this.f272500a), this.f272501b.get(), this.f272502c.get());
    }
}
