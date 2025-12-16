package com.avito.android.short_term_rent.deeplink;

import com.avito.android.remote.d1;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrIncreasedCashbackApplyUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d1> f282268a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f282269b;

    public i(Provider<d1> provider, Provider<R0> provider2) {
        this.f282268a = provider;
        this.f282269b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f282268a.get(), this.f282269b.get());
    }
}
