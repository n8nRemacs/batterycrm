package com.avito.android.rubricator.items.linear_service;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SerpRubricatorLinearServiceItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.rubricator.e> f255806a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f255807b;

    public g(Provider<com.avito.android.rubricator.e> provider, Provider<com.avito.android.serp.analytics.widgets_tracker.g> provider2) {
        this.f255806a = provider;
        this.f255807b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f255806a.get(), this.f255807b.get());
    }
}
