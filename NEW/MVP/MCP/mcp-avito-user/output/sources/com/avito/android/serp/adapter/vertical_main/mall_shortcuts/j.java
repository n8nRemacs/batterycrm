package com.avito.android.serp.adapter.vertical_main.mall_shortcuts;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MallShortcutsWidgetPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f272994a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f272995b;

    public j(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<com.avito.android.serp.analytics.widgets_tracker.g> provider2) {
        this.f272994a = provider;
        this.f272995b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f272994a.get(), this.f272995b.get());
    }
}
