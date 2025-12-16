package com.avito.android.rubricator.items.service;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SerpRubricatorServiceItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.rubricator.e> f255823a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f255824b;

    public f(Provider<com.avito.android.rubricator.e> provider, Provider<com.avito.android.serp.analytics.widgets_tracker.g> provider2) {
        this.f255823a = provider;
        this.f255824b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f255823a.get(), this.f255824b.get());
    }
}
