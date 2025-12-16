package com.avito.android.position_in_search.stats.screen.position_in_search.storage;

import AK0.l;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PositionInSearchStorageImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f221572a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f221573b;

    public b(Provider<l> provider, Provider<R0> provider2) {
        this.f221572a = provider;
        this.f221573b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f221573b.get(), g.a(w.a(this.f221572a)));
    }
}
