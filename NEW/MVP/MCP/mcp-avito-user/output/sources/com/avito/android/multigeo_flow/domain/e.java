package com.avito.android.multigeo_flow.domain;

import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobMultiGeoInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<M20.a> f206886a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f206887b;

    public e(Provider<M20.a> provider, Provider<R0> provider2) {
        this.f206886a = provider;
        this.f206887b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f206887b.get(), g.b(this.f206886a));
    }
}
