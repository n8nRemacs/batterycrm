package com.avito.android.advertising.loaders;

import javax.inject.Provider;

/* compiled from: CommercialGaidProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class z implements dagger.internal.h<y> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.analytics_adjust.u> f88517a;

    public z(Provider<com.avito.android.analytics_adjust.u> provider) {
        this.f88517a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new y(this.f88517a.get());
    }
}
