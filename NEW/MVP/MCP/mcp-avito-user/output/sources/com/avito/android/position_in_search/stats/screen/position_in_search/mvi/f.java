package com.avito.android.position_in_search.stats.screen.position_in_search.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PositionInSearchBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.position_in_search.stats.screen.position_in_search.domain.j> f221521a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f221522b;

    public f(dagger.internal.l lVar, Provider provider) {
        this.f221521a = provider;
        this.f221522b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f221521a.get(), (String) this.f221522b.f393949a);
    }
}
