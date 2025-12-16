package com.avito.android.serp.adapter.vertical_main.top_sellers.top_sellers_list;

import com.avito.android.serp.analytics.widgets_tracker.g;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TopSellerPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final f f273276a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<g> f273277b;

    public d(f fVar, Provider provider) {
        this.f273276a = fVar;
        this.f273277b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f273277b.get(), dagger.internal.g.b(this.f273276a));
    }
}
