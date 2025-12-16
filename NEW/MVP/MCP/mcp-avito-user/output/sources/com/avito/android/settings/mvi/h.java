package com.avito.android.settings.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SettingsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.settings.h f280925a;

    /* renamed from: b, reason: collision with root package name */
    public final u f280926b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f280927c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<U20.d> f280928d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.replace_main.toggle.m> f280929e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<U20.e> f280930f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.onboarding_manager.f> f280931g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f280932h;

    public h(com.avito.android.settings.h hVar, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f280925a = hVar;
        this.f280926b = uVar;
        this.f280927c = provider;
        this.f280928d = provider2;
        this.f280929e = provider3;
        this.f280930f = provider4;
        this.f280931g = provider5;
        this.f280932h = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.settings.f) this.f280925a.get(), (com.avito.android.location.r) this.f280926b.get(), this.f280927c.get(), this.f280928d.get(), this.f280929e.get(), this.f280930f.get(), this.f280931g.get(), this.f280932h.get());
    }
}
