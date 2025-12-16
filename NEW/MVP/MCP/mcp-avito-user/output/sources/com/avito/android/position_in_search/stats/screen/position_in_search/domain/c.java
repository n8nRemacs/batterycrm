package com.avito.android.position_in_search.stats.screen.position_in_search.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PositionInSearchByPeriodUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f221400a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<P80.a> f221401b;

    /* renamed from: c, reason: collision with root package name */
    public final f f221402c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f221403d;

    public c(dagger.internal.l lVar, Provider provider, f fVar, Provider provider2) {
        this.f221400a = lVar;
        this.f221401b = provider;
        this.f221402c = fVar;
        this.f221403d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(((Long) this.f221400a.f393949a).longValue(), this.f221401b.get(), (d) this.f221402c.get(), this.f221403d.get());
    }
}
