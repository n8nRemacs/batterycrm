package com.avito.android.campaigns_sale_search.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: CampaignsSaleSearchOneTimeEventProducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f114792a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f114793b;

    public s(Provider<InterfaceC28373a> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2) {
        this.f114792a = provider;
        this.f114793b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r(this.f114792a.get(), this.f114793b.get());
    }
}
