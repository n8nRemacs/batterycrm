package com.avito.android.safedeal.universal_delivery_type;

import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalDeliveryTypePerformanceTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f256737a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f256738b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28499v> f256739c;

    /* renamed from: d, reason: collision with root package name */
    public final u f256740d;

    public n(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2) {
        this.f256737a = provider;
        this.f256738b = lVar;
        this.f256739c = provider2;
        this.f256740d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f256737a.get(), (r) this.f256738b.f393949a, this.f256739c.get(), (com.avito.android.analytics.screens.o) this.f256740d.get());
    }
}
