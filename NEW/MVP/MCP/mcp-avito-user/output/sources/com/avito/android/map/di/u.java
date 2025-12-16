package com.avito.android.map.di;

import androidx.view.S0;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.bxcontent.C29090i;
import com.avito.android.bxcontent.di.module.C29058f;
import com.avito.android.map.mvi.C31631u;
import com.avito.android.map.mvi.entity.MapInternalAction;
import com.avito.android.util.C;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MapModule_ProvideMapPreloadingBootstrap$_avito_search_map_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class u implements dagger.internal.h<com.avito.android.arch.mvi.b<MapInternalAction>> {

    /* renamed from: a, reason: collision with root package name */
    public final C31631u f184875a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f184876b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<PreloadingPromiseTestGroup> f184877c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f184878d;

    /* renamed from: e, reason: collision with root package name */
    public final C29058f f184879e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f184880f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f184881g;

    public u(C31631u c31631u, Provider provider, Provider provider2, dagger.internal.l lVar, C29058f c29058f, Provider provider3, dagger.internal.l lVar2) {
        this.f184875a = c31631u;
        this.f184876b = provider;
        this.f184877c = provider2;
        this.f184878d = lVar;
        this.f184879e = c29058f;
        this.f184880f = provider3;
        this.f184881g = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f184876b.get();
        PreloadingPromiseTestGroup preloadingPromiseTestGroup = this.f184877c.get();
        S0 s02 = (S0) this.f184878d.f393949a;
        C29090i c29090i = (C29090i) this.f184879e.get();
        InterfaceC28373a interfaceC28373a = this.f184880f.get();
        Screen screen = (Screen) this.f184881g.f393949a;
        r.f184873a.getClass();
        return com.avito.android.preloading.coroutines.mvi.c.a(new s(0, this.f184875a, Provider.class, "get", "get()Ljava/lang/Object;", 0), c12, preloadingPromiseTestGroup.a() && c29090i.f111124b, s02, interfaceC28373a, screen.f90471b, 20);
    }
}
