package com.avito.android.active_orders.adapter;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HomeActiveOrdersItemListener_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f68270a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f68271b;

    public e(dagger.internal.f fVar, Provider provider) {
        this.f68270a = fVar;
        this.f68271b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f68271b.get(), dagger.internal.g.b(this.f68270a));
    }
}
