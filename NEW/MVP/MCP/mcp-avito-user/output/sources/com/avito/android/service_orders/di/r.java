package com.avito.android.service_orders.di;

import Nu0.C14614b;
import Su0.C15227c;
import androidx.view.S0;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.preloading.coroutines.AbstractC33302a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_orders.di.a;
import com.avito.android.util.C;
import javax.inject.Provider;

/* compiled from: ServiceOrdersListModule_ProvidePreloadingPromiseFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class r implements dagger.internal.h<AbstractC33302a<String, TypedResult<C15227c>>> {

    /* renamed from: a, reason: collision with root package name */
    public final C14614b f279159a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f279160b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<PreloadingPromiseTestGroup> f279161c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f279162d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f279163e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f279164f;

    public r(C14614b c14614b, Provider provider, Provider provider2, dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider3) {
        this.f279159a = c14614b;
        this.f279160b = provider;
        this.f279161c = provider2;
        this.f279162d = lVar;
        this.f279163e = lVar2;
        this.f279164f = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = (C) ((a.c.d) this.f279160b).get();
        PreloadingPromiseTestGroup preloadingPromiseTestGroup = (PreloadingPromiseTestGroup) ((a.c.m) this.f279161c).get();
        S0 s02 = (S0) this.f279162d.f393949a;
        C28478k c28478k = (C28478k) this.f279163e.f393949a;
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((a.c.b) this.f279164f).get();
        j.f279138a.getClass();
        return com.avito.android.preloading.coroutines.o.a("SingleBootstrap", s02, new k(this.f279159a, c12, preloadingPromiseTestGroup, interfaceC28373a, c28478k));
    }
}
