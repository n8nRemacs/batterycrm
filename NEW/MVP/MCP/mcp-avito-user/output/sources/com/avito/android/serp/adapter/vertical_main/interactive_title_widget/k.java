package com.avito.android.serp.adapter.vertical_main.interactive_title_widget;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InteractiveTitleWidgetPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f272964a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f272965b;

    public k(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<com.avito.android.serp.analytics.widgets_tracker.g> provider2) {
        this.f272964a = provider;
        this.f272965b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f272964a.get(), this.f272965b.get());
    }
}
