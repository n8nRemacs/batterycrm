package com.avito.android.repair_calculator;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsRepairCalculatorBannerItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f254484a;

    /* renamed from: b, reason: collision with root package name */
    public final u f254485b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f254486c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f254484a = provider;
        this.f254485b = uVar;
        this.f254486c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f254484a.get(), (com.avito.android.repair_calculator.beduin.a) this.f254485b.get(), this.f254486c.get());
    }
}
