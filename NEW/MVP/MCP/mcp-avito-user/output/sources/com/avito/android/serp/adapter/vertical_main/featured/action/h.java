package com.avito.android.serp.adapter.vertical_main.featured.action;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FeaturedActionPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f272825a;

    public h(Provider<com.avito.android.serp.analytics.widgets_tracker.g> provider) {
        this.f272825a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f272825a.get());
    }
}
