package com.avito.android.vas_performance.di.visual_legacy;

import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.vas_performance.di.visual_legacy.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.G0;
import yL0.C50128a;

/* compiled from: LegacyVisualVasModule_ProvidePreloadingPromise$_avito_vas_performance_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class p implements dagger.internal.h<com.avito.android.preloading.j<G0, P2<HL0.b>>> {

    /* renamed from: a, reason: collision with root package name */
    public final o f320192a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.vas_performance.repository.a> f320193b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f320194c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C> f320195d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<PreloadingPromiseTestGroup> f320196e;

    /* renamed from: f, reason: collision with root package name */
    public final u f320197f;

    public p(o oVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, u uVar) {
        this.f320192a = oVar;
        this.f320193b = provider;
        this.f320194c = provider2;
        this.f320195d = provider3;
        this.f320196e = provider4;
        this.f320197f = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_performance.repository.a aVar = this.f320193b.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((a.c.f) this.f320194c).get();
        C c12 = (C) ((a.c.C9924c) this.f320195d).get();
        PreloadingPromiseTestGroup preloadingPromiseTestGroupY1 = ((a.c.e) this.f320196e).f320167a.Y1();
        TL0.d dVar = (TL0.d) this.f320197f.get();
        o oVar = this.f320192a;
        oVar.getClass();
        boolean zA2 = preloadingPromiseTestGroupY1.a();
        String str = oVar.f320191b;
        String str2 = oVar.f320190a;
        return zA2 ? new com.avito.android.preloading.a(G0.f406611a, new C50128a(str2, str, aVar, interfaceC35745a5, dVar), c12) : new com.avito.android.preloading.b(new C50128a(str2, str, aVar, interfaceC35745a5, dVar), c12);
    }
}
