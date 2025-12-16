package com.avito.android.profile.user_profile.di;

import androidx.view.T0;
import com.avito.android.I1;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.preloading.coroutines.AbstractC33302a;
import com.avito.android.profile.user_profile.di.C33370a;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import com.avito.android.util.C;
import javax.inject.Provider;

/* compiled from: UserProfileModule_ProvideUserDataPreloadingPromise$_avito_profile_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class u implements dagger.internal.h<AbstractC33302a<com.avito.android.profile.user_profile.preloading.e, UserProfileInternalAction>> {

    /* renamed from: a, reason: collision with root package name */
    public final f f226128a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.profile.user_profile.preloading.d f226129b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<PreloadingPromiseTestGroup> f226130c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C> f226131d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f226132e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<I1> f226133f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f226134g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<C28478k> f226135h;

    public u(f fVar, com.avito.android.profile.user_profile.preloading.d dVar, Provider provider, Provider provider2, dagger.internal.l lVar, Provider provider3, Provider provider4, Provider provider5) {
        this.f226128a = fVar;
        this.f226129b = dVar;
        this.f226130c = provider;
        this.f226131d = provider2;
        this.f226132e = lVar;
        this.f226133f = provider3;
        this.f226134g = provider4;
        this.f226135h = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        PreloadingPromiseTestGroup preloadingPromiseTestGroup = (PreloadingPromiseTestGroup) ((C33370a.c.F) this.f226130c).get();
        C c12 = (C) ((C33370a.c.C33380l) this.f226131d).get();
        T0 t02 = (T0) this.f226132e.f393949a;
        I1 i1H = ((C33370a.c.E) this.f226133f).f226048a.H();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((C33370a.c.C33375g) this.f226134g).get();
        C28478k c28478k = this.f226135h.get();
        this.f226128a.getClass();
        return com.avito.android.preloading.coroutines.o.a("SingleBootstrap", t02.getF42820b(), new g(this.f226129b, c12, preloadingPromiseTestGroup, i1H, interfaceC28373a, c28478k));
    }
}
