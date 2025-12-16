package com.avito.android.advert.item.compatibility.v2;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GarageCompatibilityV2AnalyticsImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f74353a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f74354b;

    public c(dagger.internal.l lVar, Provider provider) {
        this.f74353a = provider;
        this.f74354b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f74353a.get(), (String) this.f74354b.f393949a);
    }
}
