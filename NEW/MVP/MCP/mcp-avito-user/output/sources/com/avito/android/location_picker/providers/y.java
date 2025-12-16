package com.avito.android.location_picker.providers;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: LocationPickerPublishAnalyticsProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f182487a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C50213a> f182488b;

    public y(Provider<InterfaceC28373a> provider, Provider<C50213a> provider2) {
        this.f182487a = provider;
        this.f182488b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new x(this.f182487a.get(), this.f182488b.get());
    }
}
