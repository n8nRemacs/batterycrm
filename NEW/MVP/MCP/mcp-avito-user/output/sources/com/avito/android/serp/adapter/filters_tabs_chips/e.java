package com.avito.android.serp.adapter.filters_tabs_chips;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FiltersTabsChipsPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f269968a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f269969b;

    public e(dagger.internal.f fVar, Provider provider) {
        this.f269968a = fVar;
        this.f269969b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f269969b.get(), dagger.internal.g.b(this.f269968a));
    }
}
