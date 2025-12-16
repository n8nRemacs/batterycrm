package com.avito.android.serp.adapter.vertical_main.mini_search_widget;

import Xr0.InterfaceC17042a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MiniSearchWidgetItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f273068a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f273069b;

    /* renamed from: c, reason: collision with root package name */
    public final u f273070c;

    public n(u uVar, Provider provider, Provider provider2) {
        this.f273068a = provider;
        this.f273069b = provider2;
        this.f273070c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f273068a.get(), this.f273069b.get(), (InterfaceC17042a) this.f273070c.get());
    }
}
