package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: ShortcutsFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class X implements dagger.internal.h<W> {

    /* renamed from: a, reason: collision with root package name */
    public final U f313959a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f313960b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f313961c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f313962d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f313963e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f313964f;

    public X(U u12, d0 d0Var, b0 b0Var, Provider provider, dagger.internal.l lVar, Provider provider2) {
        this.f313959a = u12;
        this.f313960b = d0Var;
        this.f313961c = b0Var;
        this.f313962d = provider;
        this.f313963e = lVar;
        this.f313964f = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C35609a c35609a = (C35609a) this.f313959a.get();
        c0 c0Var = (c0) this.f313960b.get();
        this.f313961c.getClass();
        a0 a0Var = new a0();
        R0 r02 = this.f313962d.get();
        UI0.b bVar = (UI0.b) this.f313963e.f393949a;
        ScreenPerformanceTracker screenPerformanceTracker = this.f313964f.get();
        String str = bVar.f16334b;
        if (str == null) {
            str = "";
        }
        return new W("UserAdvertsShortcutsFeature", new TI0.c(null, null, new UI0.a(str, 0, 2, null), null, null, 0, bVar.f16333a, false, null, 443, null), new V(c35609a, screenPerformanceTracker, c0Var, a0Var, r02));
    }
}
