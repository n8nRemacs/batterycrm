package com.avito.android.advert_stats.detail.tab.items.cost_title;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CostTitleBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f86433a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f86434b;

    public b(u uVar, Provider provider) {
        this.f86433a = uVar;
        this.f86434b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f86433a.get(), this.f86434b.get());
    }
}
