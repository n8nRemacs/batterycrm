package com.avito.android.profile.pro.impl.screen.item.dashboard_stats;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileProStatsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f223168a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f223169b;

    public b(e eVar, Provider provider) {
        this.f223168a = eVar;
        this.f223169b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f223168a.get(), this.f223169b.get());
    }
}
