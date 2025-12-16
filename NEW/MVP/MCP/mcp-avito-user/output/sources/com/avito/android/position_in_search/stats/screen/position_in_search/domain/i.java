package com.avito.android.position_in_search.stats.screen.position_in_search.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PositionInSearchNextPageUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f221417a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<P80.a> f221418b;

    /* renamed from: c, reason: collision with root package name */
    public final f f221419c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f221420d;

    public i(dagger.internal.l lVar, Provider provider, f fVar, Provider provider2) {
        this.f221417a = lVar;
        this.f221418b = provider;
        this.f221419c = fVar;
        this.f221420d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(((Long) this.f221417a.f393949a).longValue(), this.f221418b.get(), (d) this.f221419c.get(), this.f221420d.get());
    }
}
