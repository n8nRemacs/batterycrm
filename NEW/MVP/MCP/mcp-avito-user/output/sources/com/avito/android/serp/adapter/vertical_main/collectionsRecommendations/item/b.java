package com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.item;

import com.avito.android.serp.analytics.widgets_tracker.g;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CollectionRecommendationItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f272726a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<g> f272727b;

    public b(f fVar, Provider provider) {
        this.f272726a = fVar;
        this.f272727b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f272727b.get(), dagger.internal.g.b(this.f272726a));
    }
}
