package com.avito.android.di.module;

import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.ImageViewportEvent;
import javax.inject.Provider;

/* compiled from: AdvertItemPresenterModule_ProvideAdvertGridSaleItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class G implements dagger.internal.h<com.avito.android.serp.adapter.sale_advert_item.c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f143959a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f143960b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C36135w2> f143961c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ImageViewportEvent.EventSource> f143962d;

    public G(dagger.internal.f fVar, Provider provider, Provider provider2, Provider provider3) {
        this.f143959a = fVar;
        this.f143960b = provider;
        this.f143961c = provider2;
        this.f143962d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f143959a);
        InterfaceC28373a interfaceC28373a = this.f143960b.get();
        C36135w2 c36135w2 = this.f143961c.get();
        ImageViewportEvent.EventSource eventSource = this.f143962d.get();
        D d12 = D.f143878a;
        return new com.avito.android.serp.adapter.sale_advert_item.d(eVarB, interfaceC28373a, c36135w2, eventSource);
    }
}
