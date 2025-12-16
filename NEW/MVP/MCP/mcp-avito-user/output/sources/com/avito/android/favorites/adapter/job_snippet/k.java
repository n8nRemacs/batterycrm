package com.avito.android.favorites.adapter.job_snippet;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.C30092k4;
import com.avito.android.favorites.adapter.advert.d;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FavoriteJobItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f156628a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.avito.component.serp.job.geo.f f156629b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC34864v0> f156630c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<rn0.e> f156631d;

    /* renamed from: e, reason: collision with root package name */
    public final C30092k4 f156632e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f156633f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<d.a> f156634g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f156635h;

    public k(Provider provider, ru.avito.component.serp.job.geo.f fVar, Provider provider2, Provider provider3, C30092k4 c30092k4, Provider provider4, Provider provider5, Provider provider6) {
        this.f156628a = provider;
        this.f156629b = fVar;
        this.f156630c = provider2;
        this.f156631d = provider3;
        this.f156632e = c30092k4;
        this.f156633f = provider4;
        this.f156634g = provider5;
        this.f156635h = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.h hVar = this.f156628a.get();
        this.f156629b.getClass();
        return new i(hVar, new ru.avito.component.serp.job.geo.e(), this.f156630c.get(), dagger.internal.g.b(this.f156631d), (com.avito.android.date_time_formatter.b) this.f156632e.get(), this.f156633f.get(), dagger.internal.g.b(this.f156634g), this.f156635h.get());
    }
}
