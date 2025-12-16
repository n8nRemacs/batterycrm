package com.avito.android.serp.adapter.sale;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SaleHeaderPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f271501a;

    public j(Provider<com.avito.android.serp.analytics.widgets_tracker.g> provider) {
        this.f271501a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f271501a.get());
    }
}
