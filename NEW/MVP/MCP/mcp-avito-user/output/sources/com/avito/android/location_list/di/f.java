package com.avito.android.location_list.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.location_list.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rW.InterfaceC47603a;

/* compiled from: LocationListModule_ProvideAnalyticsInteractor$_avito_location_list_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<InterfaceC47603a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f182015a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f182016b;

    public f(d dVar, Provider<InterfaceC28373a> provider) {
        this.f182015a = dVar;
        this.f182016b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((a.c.C5345a) this.f182016b).get();
        this.f182015a.getClass();
        return new rW.b(interfaceC28373a);
    }
}
