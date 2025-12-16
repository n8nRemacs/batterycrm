package com.avito.android.bxcontent.di.module;

import androidx.view.S0;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.bxcontent.mvi.C29227w;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import javax.inject.Provider;

/* compiled from: BxContentModule_ProvideBxContentPreloadingBootstrap$_avito_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.bxcontent.di.module.z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29077z implements dagger.internal.h<com.avito.android.arch.mvi.b<BxContentInternalAction>> {

    /* renamed from: a, reason: collision with root package name */
    public final C29227w f111040a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f111041b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<PreloadingPromiseTestGroup> f111042c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f111043d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f111044e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f111045f;

    public C29077z(C29227w c29227w, Provider provider, Provider provider2, dagger.internal.l lVar, Provider provider3, dagger.internal.l lVar2) {
        this.f111040a = c29227w;
        this.f111041b = provider;
        this.f111042c = provider2;
        this.f111043d = lVar;
        this.f111044e = provider3;
        this.f111045f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.C c12 = this.f111041b.get();
        PreloadingPromiseTestGroup preloadingPromiseTestGroup = this.f111042c.get();
        S0 s02 = (S0) this.f111043d.f393949a;
        InterfaceC28373a interfaceC28373a = this.f111044e.get();
        Screen screen = (Screen) this.f111045f.f393949a;
        C29070s.f111022a.getClass();
        return com.avito.android.preloading.coroutines.mvi.c.a(new C29071t(0, this.f111040a, Provider.class, "get", "get()Ljava/lang/Object;", 0), c12, preloadingPromiseTestGroup.a(), s02, interfaceC28373a, screen.f90471b, 84);
    }
}
