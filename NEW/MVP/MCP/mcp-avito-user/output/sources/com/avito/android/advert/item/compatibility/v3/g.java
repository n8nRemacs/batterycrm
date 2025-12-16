package com.avito.android.advert.item.compatibility.v3;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GarageCompatibilityV3AnalyticsImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f74410a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f74411b;

    public g(dagger.internal.l lVar, Provider provider) {
        this.f74410a = provider;
        this.f74411b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f74410a.get(), (String) this.f74411b.f393949a);
    }
}
