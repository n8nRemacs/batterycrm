package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.indicator;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IndicatorBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f317492a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f317493b;

    public b(u uVar, Provider provider) {
        this.f317492a = uVar;
        this.f317493b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f317492a.get(), this.f317493b.get());
    }
}
