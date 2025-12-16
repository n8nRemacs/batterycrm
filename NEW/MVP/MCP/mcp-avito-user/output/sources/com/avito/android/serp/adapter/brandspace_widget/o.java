package com.avito.android.serp.adapter.brandspace_widget;

import com.avito.android.serp.adapter.witcher.M;
import com.avito.android.util.Kundle;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BrandspaceWidgetItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f269065a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<M> f269066b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f269067c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f269068d;

    public o(dagger.internal.f fVar, dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f269065a = lVar;
        this.f269066b = provider;
        this.f269067c = fVar;
        this.f269068d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n((Kundle) this.f269065a.f393949a, this.f269066b.get(), dagger.internal.g.b(this.f269067c), this.f269068d.get());
    }
}
