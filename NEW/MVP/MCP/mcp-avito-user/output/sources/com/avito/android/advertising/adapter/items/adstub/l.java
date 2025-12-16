package com.avito.android.advertising.adapter.items.adstub;

import com.avito.android.advertising.analytics.events.BannerPageSource;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotLoadAdStubBigGridMediaX2Blueprint_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<s> f86958a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<BannerPageSource> f86959b;

    public l(Provider<s> provider, Provider<BannerPageSource> provider2) {
        this.f86958a = provider;
        this.f86959b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f86958a.get(), this.f86959b.get());
    }
}
