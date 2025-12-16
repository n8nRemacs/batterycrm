package com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar;

import Xr0.InterfaceC17042a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalMiniSearchToolbarPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f113211a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f113212b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC17042a> f113213c;

    public g(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<com.avito.android.serp.analytics.widgets_tracker.g> provider2, Provider<InterfaceC17042a> provider3) {
        this.f113211a = provider;
        this.f113212b = provider2;
        this.f113213c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f113211a.get(), this.f113212b.get(), this.f113213c.get());
    }
}
