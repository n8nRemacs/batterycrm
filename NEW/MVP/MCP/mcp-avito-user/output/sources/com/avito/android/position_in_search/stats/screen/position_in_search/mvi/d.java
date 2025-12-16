package com.avito.android.position_in_search.stats.screen.position_in_search.mvi;

import com.avito.android.position_in_search.stats.screen.position_in_search.storage.PositionInSearchStorage;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PositionInSearchActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.position_in_search.stats.screen.position_in_search.domain.j> f221491a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.position_in_search.stats.screen.position_in_search.domain.a> f221492b;

    /* renamed from: c, reason: collision with root package name */
    public final u f221493c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<PositionInSearchStorage> f221494d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f221495e;

    public d(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f221491a = provider;
        this.f221492b = provider2;
        this.f221493c = uVar;
        this.f221494d = provider3;
        this.f221495e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f221491a.get(), this.f221492b.get(), (com.avito.android.position_in_search.stats.screen.position_in_search.domain.g) this.f221493c.get(), this.f221494d.get(), (String) this.f221495e.f393949a);
    }
}
