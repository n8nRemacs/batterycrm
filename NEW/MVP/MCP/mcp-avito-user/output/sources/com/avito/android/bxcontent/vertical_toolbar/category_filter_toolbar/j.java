package com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar;

import Pr0.InterfaceC14832a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalCategoryFilterToolbarPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f113084a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f113085b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.vertical_main.p> f113086c;

    /* renamed from: d, reason: collision with root package name */
    public final u f113087d;

    public j(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f113084a = provider;
        this.f113085b = provider2;
        this.f113086c = provider3;
        this.f113087d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f113084a.get(), this.f113085b.get(), this.f113086c.get(), (InterfaceC14832a) this.f113087d.get());
    }
}
