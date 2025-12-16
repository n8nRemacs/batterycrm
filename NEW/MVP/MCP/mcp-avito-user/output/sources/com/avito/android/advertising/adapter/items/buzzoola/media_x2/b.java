package com.avito.android.advertising.adapter.items.buzzoola.media_x2;

import com.avito.android.advertising.analytics.events.BannerPageSource;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BuzzoolaMediaX2BigBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f87323a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<BannerPageSource> f87324b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.a> f87325c;

    public b(Provider<c> provider, Provider<BannerPageSource> provider2, Provider<com.avito.android.advertising.a> provider3) {
        this.f87323a = provider;
        this.f87324b = provider2;
        this.f87325c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f87323a.get(), this.f87324b.get(), this.f87325c.get());
    }
}
