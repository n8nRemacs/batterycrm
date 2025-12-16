package com.avito.android.campaigns_sale_search.mvi;

import android.content.res.Resources;
import com.avito.android.campaigns_sale_search.model.CampaignsSaleSearchArguments;
import javax.inject.Provider;
import vm.InterfaceC49348c;

/* compiled from: CampaignsSaleSearchActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.campaigns_sale_search.network.a> f114775a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49348c> f114776b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f114777c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f114778d;

    public l(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2) {
        this.f114775a = provider;
        this.f114776b = provider2;
        this.f114777c = lVar;
        this.f114778d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f114775a.get(), this.f114776b.get(), (Resources) this.f114777c.f393949a, (CampaignsSaleSearchArguments) this.f114778d.f393949a);
    }
}
