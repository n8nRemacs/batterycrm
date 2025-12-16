package com.avito.android.serp.adapter.action_promo_banner;

import AK0.l;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ActionPromoBannerPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E> f268623a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f268624b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<l> f268625c;

    public i(Provider<E> provider, Provider<InterfaceC28373a> provider2, Provider<l> provider3) {
        this.f268623a = provider;
        this.f268624b = provider2;
        this.f268625c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f268623a.get(), this.f268624b.get(), this.f268625c.get());
    }
}
