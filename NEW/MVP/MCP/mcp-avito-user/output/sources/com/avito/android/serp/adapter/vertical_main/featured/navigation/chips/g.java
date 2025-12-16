package com.avito.android.serp.adapter.vertical_main.featured.navigation.chips;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FeaturedChipsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f272912a;

    public g(Provider<com.avito.android.serp.analytics.widgets_tracker.g> provider) {
        this.f272912a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f272912a.get());
    }
}
