package com.avito.android.vas_performance.screens.visual.di;

import androidx.view.S0;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.util.C;
import com.avito.android.vas_performance.screens.visual.di.a;
import com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VisualVasModule_ProvideBoostrap$_avito_vas_performance_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<com.avito.android.arch.mvi.b<VisualVasInternalAction>> {

    /* renamed from: a, reason: collision with root package name */
    public final l f321032a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.visual.mvi.f f321033b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C> f321034c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<PreloadingPromiseTestGroup> f321035d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f321036e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f321037f;

    /* renamed from: g, reason: collision with root package name */
    public final u f321038g;

    public n(l lVar, com.avito.android.vas_performance.screens.visual.mvi.f fVar, Provider provider, Provider provider2, dagger.internal.l lVar2, Provider provider3, u uVar) {
        this.f321032a = lVar;
        this.f321033b = fVar;
        this.f321034c = provider;
        this.f321035d = provider2;
        this.f321036e = lVar2;
        this.f321037f = provider3;
        this.f321038g = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = (C) ((a.c.b) this.f321034c).get();
        PreloadingPromiseTestGroup preloadingPromiseTestGroup = (PreloadingPromiseTestGroup) ((a.c.d) this.f321035d).get();
        S0 s02 = (S0) this.f321036e.f393949a;
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((a.c.C9943a) this.f321037f).get();
        C28478k c28478k = (C28478k) this.f321038g.get();
        this.f321032a.getClass();
        return com.avito.android.preloading.coroutines.mvi.c.a(new m(0, this.f321033b, Provider.class, "get", "get()Ljava/lang/Object;", 0), c12, preloadingPromiseTestGroup.a(), s02, interfaceC28373a, c28478k.f90636a.f90471b, 84);
    }
}
