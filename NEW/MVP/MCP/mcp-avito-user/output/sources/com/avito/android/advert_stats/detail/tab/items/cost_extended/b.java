package com.avito.android.advert_stats.detail.tab.items.cost_extended;

import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CostExtendedByPeriodBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f86415a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f86416b;

    /* renamed from: c, reason: collision with root package name */
    public final l f86417c;

    public b(l lVar, u uVar, Provider provider) {
        this.f86415a = uVar;
        this.f86416b = provider;
        this.f86417c = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f86415a.get(), this.f86416b.get(), (Y41.l) this.f86417c.f393949a);
    }
}
