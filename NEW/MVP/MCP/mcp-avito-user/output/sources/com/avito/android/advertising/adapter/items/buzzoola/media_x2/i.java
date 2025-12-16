package com.avito.android.advertising.adapter.items.buzzoola.media_x2;

import com.avito.android.advertising.analytics.events.BannerPageSource;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BuzzoolaMediaX2RichBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f87350a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<BannerPageSource> f87351b;

    public i(u uVar, Provider provider) {
        this.f87350a = uVar;
        this.f87351b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((c) this.f87350a.get(), this.f87351b.get());
    }
}
