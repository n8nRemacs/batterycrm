package com.avito.android.advertising.loaders;

import com.avito.android.C30828i;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.Kundle;
import javax.inject.Provider;

/* compiled from: CommercialBannersAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class l implements dagger.internal.h<CommercialBannersAnalyticsInteractorImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<BannerPageSource> f88391a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f88392b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.a> f88393c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C30828i> f88394d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<String> f88395e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f88396f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f88397g;

    public l(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f88391a = provider;
        this.f88392b = provider2;
        this.f88393c = provider3;
        this.f88394d = provider4;
        this.f88395e = provider5;
        this.f88396f = lVar;
        this.f88397g = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new CommercialBannersAnalyticsInteractorImpl(this.f88391a.get(), this.f88392b.get(), this.f88393c.get(), this.f88394d.get(), this.f88395e.get(), (Kundle) this.f88396f.f393949a, (com.avito.android.account.E) this.f88397g.get());
    }
}
