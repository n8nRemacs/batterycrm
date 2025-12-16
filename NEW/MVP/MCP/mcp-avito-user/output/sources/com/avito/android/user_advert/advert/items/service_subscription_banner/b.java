package com.avito.android.user_advert.advert.items.service_subscription_banner;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SubscriptionBannerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f310195a;

    /* renamed from: b, reason: collision with root package name */
    public final u f310196b;

    public b(u uVar, Provider provider) {
        this.f310195a = provider;
        this.f310196b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f310195a.get(), (com.avito.android.util.text.a) this.f310196b.get());
    }
}
