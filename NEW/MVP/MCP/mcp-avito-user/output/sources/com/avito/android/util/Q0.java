package com.avito.android.util;

import com.avito.android.C29640d;
import javax.inject.Provider;

/* compiled from: DiffBlocksUtilImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class Q0 implements dagger.internal.h<P0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f318723a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f318724b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C29640d> f318725c;

    public Q0(Provider<R0> provider, Provider<com.avito.android.advert_core.analytics.a> provider2, Provider<C29640d> provider3) {
        this.f318723a = provider;
        this.f318724b = provider2;
        this.f318725c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new P0(this.f318723a.get(), this.f318724b.get(), this.f318725c.get());
    }
}
