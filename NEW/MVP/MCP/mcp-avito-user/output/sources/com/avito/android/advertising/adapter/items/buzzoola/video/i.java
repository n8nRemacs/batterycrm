package com.avito.android.advertising.adapter.items.buzzoola.video;

import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CommercialVideoPerfInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f87563a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<BannerPageSource> f87564b;

    public i(u uVar, Provider provider) {
        this.f87563a = uVar;
        this.f87564b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((InterfaceC28373a) this.f87563a.get(), this.f87564b.get());
    }
}
