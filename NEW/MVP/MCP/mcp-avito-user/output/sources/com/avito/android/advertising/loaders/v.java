package com.avito.android.advertising.loaders;

import com.avito.android.C30828i;
import com.avito.android.advertising.loaders.my_target.MyTargetBannerLoader;
import com.avito.android.advertising.loaders.yandex.YandexBannerLoader;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import rb.InterfaceC47628b;

/* compiled from: CommercialBannersInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class v implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<YandexBannerLoader> f88479a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<MyTargetBannerLoader> f88480b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.buzzoola.f> f88481c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.avito_targeting.g> f88482d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.p> f88483e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<j> f88484f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC47628b> f88485g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.advertising_creative.mappers.a> f88486h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.a> f88487i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f88488j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<C30828i> f88489k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f88490l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<InterfaceC28359c> f88491m;

    /* renamed from: n, reason: collision with root package name */
    public final dagger.internal.u f88492n;

    public v(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13) {
        this.f88479a = provider;
        this.f88480b = provider2;
        this.f88481c = provider3;
        this.f88482d = provider4;
        this.f88483e = provider5;
        this.f88484f = provider6;
        this.f88485g = provider7;
        this.f88486h = provider8;
        this.f88487i = provider9;
        this.f88488j = provider10;
        this.f88489k = provider11;
        this.f88490l = provider12;
        this.f88491m = provider13;
        this.f88492n = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f88479a.get(), this.f88480b.get(), this.f88481c.get(), dagger.internal.g.b(this.f88482d), dagger.internal.g.b(this.f88483e), this.f88484f.get(), this.f88485g.get(), dagger.internal.g.b(this.f88486h), this.f88487i.get(), this.f88488j.get(), this.f88489k.get(), this.f88490l.get(), this.f88491m.get(), (com.avito.android.advertising.a) this.f88492n.get());
    }
}
