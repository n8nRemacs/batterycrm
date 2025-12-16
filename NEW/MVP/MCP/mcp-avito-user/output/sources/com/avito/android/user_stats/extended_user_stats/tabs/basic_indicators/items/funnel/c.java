package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FunnelBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f317465a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<lE.g> f317466b;

    public c(u uVar, Provider provider) {
        this.f317465a = uVar;
        this.f317466b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((f) this.f317465a.get(), this.f317466b.get());
    }
}
