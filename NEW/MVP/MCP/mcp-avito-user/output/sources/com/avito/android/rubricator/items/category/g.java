package com.avito.android.rubricator.items.category;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SerpRubricatorCategoryItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f255790a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f255791b;

    public g(u uVar, Provider provider) {
        this.f255790a = uVar;
        this.f255791b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.rubricator.e) this.f255790a.get(), this.f255791b.get());
    }
}
