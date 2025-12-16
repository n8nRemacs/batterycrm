package com.avito.android.location_picker.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.location_picker.analytics.LocationPickerScreenOpenEvent;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LocationPickerAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f182213a;

    /* renamed from: b, reason: collision with root package name */
    public final l f182214b;

    public c(l lVar, Provider provider) {
        this.f182213a = provider;
        this.f182214b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f182213a.get(), (LocationPickerScreenOpenEvent.EventSource) this.f182214b.f393949a);
    }
}
