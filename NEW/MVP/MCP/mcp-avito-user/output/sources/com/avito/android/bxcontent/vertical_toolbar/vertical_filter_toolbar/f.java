package com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar;

import Oi0.C14701e;
import com.avito.android.serp.adapter.vertical_main.p;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.M;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalFilterToolbarPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<p> f113171a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f113172b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f113173c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<M> f113174d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f113175e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.vertical_main.c> f113176f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<C14701e> f113177g;

    public f(Provider<p> provider, Provider<com.avito.konveyor.adapter.h> provider2, Provider<com.avito.konveyor.a> provider3, Provider<M> provider4, Provider<com.avito.android.serp.analytics.widgets_tracker.g> provider5, Provider<com.avito.android.serp.adapter.vertical_main.c> provider6, Provider<C14701e> provider7) {
        this.f113171a = provider;
        this.f113172b = provider2;
        this.f113173c = provider3;
        this.f113174d = provider4;
        this.f113175e = provider5;
        this.f113176f = provider6;
        this.f113177g = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f113171a.get(), this.f113172b.get(), this.f113173c.get(), this.f113174d.get(), this.f113175e.get(), this.f113176f.get(), this.f113177g.get());
    }
}
