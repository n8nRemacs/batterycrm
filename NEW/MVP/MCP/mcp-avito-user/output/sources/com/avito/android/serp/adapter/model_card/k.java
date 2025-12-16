package com.avito.android.serp.adapter.model_card;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ModelCardWidgetPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f270433a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f270434b;

    public k(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<com.avito.android.serp.analytics.widgets_tracker.g> provider2) {
        this.f270433a = provider;
        this.f270434b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f270433a.get(), this.f270434b.get());
    }
}
