package com.avito.android.rating.details.di;

import androidx.view.S0;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.rating.details.mvi.M;
import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import com.avito.android.util.C;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import t3.Y;

/* compiled from: RatingDetailsModule_ProvideBoostrap$_avito_rating_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<com.avito.android.arch.mvi.b<RatingDetailsInternalAction>> {

    /* renamed from: a, reason: collision with root package name */
    public final M f246985a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f246986b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f246987c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f246988d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f246989e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f246990f;

    public h(M m12, Provider provider, Y y12, dagger.internal.l lVar, dagger.internal.f fVar, dagger.internal.l lVar2) {
        this.f246985a = m12;
        this.f246986b = provider;
        this.f246987c = y12;
        this.f246988d = lVar;
        this.f246989e = fVar;
        this.f246990f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f246986b.get();
        PreloadingPromiseTestGroup preloadingPromiseTestGroup = (PreloadingPromiseTestGroup) this.f246987c.get();
        S0 s02 = (S0) this.f246988d.f393949a;
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f246989e.get();
        C28478k c28478k = (C28478k) this.f246990f.f393949a;
        e.f246981a.getClass();
        return com.avito.android.preloading.coroutines.mvi.c.a(new d(0, this.f246985a, Provider.class, "get", "get()Ljava/lang/Object;", 0), c12, preloadingPromiseTestGroup.a(), s02, interfaceC28373a, c28478k.f90636a.f90471b, 84);
    }
}
