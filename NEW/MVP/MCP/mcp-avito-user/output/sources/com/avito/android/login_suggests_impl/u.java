package com.avito.android.login_suggests_impl;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.login_suggests_impl.adapter.LoginSuggestsItem;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.Kundle;
import com.avito.android.util.S3;
import javax.inject.Provider;

/* compiled from: LoginSuggestsPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f182960a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f182961b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.jakewharton.rxrelay3.c<LoginSuggestsItem>> f182962c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f182963d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f182964e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f182965f;

    /* renamed from: g, reason: collision with root package name */
    public final S3 f182966g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f182967h;

    public u(S3 s32, dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f182960a = provider;
        this.f182961b = provider2;
        this.f182962c = provider3;
        this.f182963d = provider4;
        this.f182964e = provider5;
        this.f182965f = provider6;
        this.f182966g = s32;
        this.f182967h = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new t(this.f182960a.get(), this.f182961b.get(), this.f182962c.get(), this.f182963d.get(), this.f182964e.get(), this.f182965f.get(), (InterfaceC35945t1) this.f182966g.get(), (Kundle) this.f182967h.f393949a);
    }
}
