package com.avito.android.advert.item.creditinfo.buzzoola;

import com.avito.android.util.InterfaceC35745a5;
import fa.InterfaceC40383a;
import javax.inject.Provider;
import rb.InterfaceC47628b;

/* compiled from: BuzzoolaCreditBannerLoaderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f74956a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40383a> f74957b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.buzzoola.f> f74958c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f74959d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC47628b> f74960e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.a> f74961f;

    public j(Provider<InterfaceC35745a5> provider, Provider<InterfaceC40383a> provider2, Provider<com.avito.android.advertising.loaders.buzzoola.f> provider3, Provider<com.avito.android.advert_core.analytics.a> provider4, Provider<InterfaceC47628b> provider5, Provider<com.avito.android.server_time.a> provider6) {
        this.f74956a = provider;
        this.f74957b = provider2;
        this.f74958c = provider3;
        this.f74959d = provider4;
        this.f74960e = provider5;
        this.f74961f = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f74956a.get(), dagger.internal.g.b(this.f74957b), this.f74958c.get(), this.f74959d.get(), this.f74960e.get(), this.f74961f.get());
    }
}
