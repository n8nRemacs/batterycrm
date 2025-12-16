package com.avito.android.campaigns_sale.mvi;

import android.content.res.Resources;
import javax.inject.Provider;

/* compiled from: CampaignsSaleBlocksResolverImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class E implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.campaigns_sale.network.a> f114084a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f114085b;

    public E(dagger.internal.l lVar, Provider provider) {
        this.f114084a = provider;
        this.f114085b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new D(this.f114084a.get(), (Resources) this.f114085b.f393949a);
    }
}
