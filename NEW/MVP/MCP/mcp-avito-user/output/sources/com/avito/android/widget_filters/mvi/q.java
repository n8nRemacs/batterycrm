package com.avito.android.widget_filters.mvi;

import javax.inject.Provider;

/* compiled from: WidgetFiltersActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class q implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.domain.use_case.a> f330206a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.domain.B> f330207b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.domain.g> f330208c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.utils.b> f330209d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.domain.y> f330210e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.domain.o> f330211f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.analytics.b> f330212g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.u f330213h;

    public q(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f330206a = provider;
        this.f330207b = provider2;
        this.f330208c = provider3;
        this.f330209d = provider4;
        this.f330210e = provider5;
        this.f330211f = provider6;
        this.f330212g = provider7;
        this.f330213h = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f330206a.get(), this.f330207b.get(), this.f330208c.get(), this.f330209d.get(), this.f330210e.get(), this.f330211f.get(), this.f330212g.get(), (com.avito.android.widget_filters.analytics.e) this.f330213h.get());
    }
}
