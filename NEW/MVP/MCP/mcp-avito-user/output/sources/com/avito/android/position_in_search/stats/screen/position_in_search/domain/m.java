package com.avito.android.position_in_search.stats.screen.position_in_search.domain;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PositionInSearchUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f221433a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<P80.a> f221434b;

    /* renamed from: c, reason: collision with root package name */
    public final u f221435c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f221436d;

    public m(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2) {
        this.f221433a = lVar;
        this.f221434b = provider;
        this.f221435c = uVar;
        this.f221436d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l(((Long) this.f221433a.f393949a).longValue(), this.f221434b.get(), (a) this.f221435c.get(), this.f221436d.get());
    }
}
