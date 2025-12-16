package com.avito.android.widget_filters.domain;

import com.avito.android.util.R0;
import com.avito.android.widget_filters.WidgetFiltersOpenParams;
import javax.inject.Provider;

/* compiled from: WidgetFiltersInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f329888a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<PP0.a> f329889b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f329890c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.location.r> f329891d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC36154b> f329892e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f329893f;

    public n(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f329888a = lVar;
        this.f329889b = provider;
        this.f329890c = provider2;
        this.f329891d = provider3;
        this.f329892e = provider4;
        this.f329893f = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h((WidgetFiltersOpenParams) this.f329888a.f393949a, this.f329889b.get(), this.f329890c.get(), this.f329891d.get(), this.f329892e.get(), (com.avito.android.widget_filters.analytics.b) this.f329893f.get());
    }
}
