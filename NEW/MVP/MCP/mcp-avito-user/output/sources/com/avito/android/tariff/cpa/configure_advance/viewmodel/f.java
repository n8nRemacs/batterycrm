package com.avito.android.tariff.cpa.configure_advance.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ConfigureAdvanceFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f294387a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<j> f294388b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35205a> f294389c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f294390d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f294391e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<g> f294392f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f294393g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.u f294394h;

    public f(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f294387a = lVar;
        this.f294388b = provider;
        this.f294389c = provider2;
        this.f294390d = provider3;
        this.f294391e = provider4;
        this.f294392f = provider5;
        this.f294393g = provider6;
        this.f294394h = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((String) this.f294387a.f393949a, this.f294388b.get(), this.f294389c.get(), this.f294390d.get(), this.f294391e.get(), this.f294392f.get(), this.f294393g.get(), (v50.g) this.f294394h.get());
    }
}
