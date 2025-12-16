package com.avito.android.advertising.kebab;

import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdItemActionsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<n> f87835a;

    /* renamed from: b, reason: collision with root package name */
    public final u f87836b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<BannerPageSource> f87837c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f87835a = provider;
        this.f87836b = uVar;
        this.f87837c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f87835a.get(), (InterfaceC35745a5) this.f87836b.get(), this.f87837c.get());
    }
}
