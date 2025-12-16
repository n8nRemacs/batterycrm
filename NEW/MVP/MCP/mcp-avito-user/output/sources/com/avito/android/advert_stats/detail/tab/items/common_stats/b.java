package com.avito.android.advert_stats.detail.tab.items.common_stats;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CommonStatsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f86366a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f86367b;

    public b(u uVar, Provider provider) {
        this.f86366a = uVar;
        this.f86367b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f86366a.get(), this.f86367b.get());
    }
}
