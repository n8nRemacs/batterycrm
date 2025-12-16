package com.avito.android.campaigns_sale.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: CampaignsSaleOneTimeEventProducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class O implements dagger.internal.h<N> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f114112a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f114113b;

    public O(Provider<InterfaceC28373a> provider, Provider<InterfaceC40691b> provider2) {
        this.f114112a = provider;
        this.f114113b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new N(this.f114112a.get(), this.f114113b.get());
    }
}
