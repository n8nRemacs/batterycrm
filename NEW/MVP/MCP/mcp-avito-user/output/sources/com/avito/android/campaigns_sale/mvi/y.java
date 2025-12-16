package com.avito.android.campaigns_sale.mvi;

import javax.inject.Provider;

/* compiled from: CampaignsSaleActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class y implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.campaigns_sale.network.a> f114307a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f114308b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f114309c;

    public y(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider) {
        this.f114307a = provider;
        this.f114308b = uVar;
        this.f114309c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new w(this.f114307a.get(), (z) this.f114308b.get(), (String) this.f114309c.f393949a);
    }
}
