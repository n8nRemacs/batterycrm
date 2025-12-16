package com.avito.android.rubricator.list.service.item;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f255999a;

    /* renamed from: b, reason: collision with root package name */
    public final l f256000b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f256001c;

    public g(l lVar, Provider provider, Provider provider2) {
        this.f255999a = provider;
        this.f256000b = lVar;
        this.f256001c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f255999a.get(), (a) this.f256000b.f393949a, this.f256001c.get());
    }
}
