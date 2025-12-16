package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: PhonesListMviActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class w implements dagger.internal.h<C33433e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f228093a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<G> f228094b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.permissions.z> f228095c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<NL.e> f228096d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<NL.f> f228097e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.profile_phones.phones_list.L> f228098f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<OL.a> f228099g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.statsd.F> f228100h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f228101i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<ML.a> f228102j;

    public w(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<G> provider2, Provider<com.avito.android.permissions.z> provider3, Provider<NL.e> provider4, Provider<NL.f> provider5, Provider<com.avito.android.profile_phones.phones_list.L> provider6, Provider<OL.a> provider7, Provider<com.avito.android.analytics.statsd.F> provider8, Provider<InterfaceC28373a> provider9, Provider<ML.a> provider10) {
        this.f228093a = provider;
        this.f228094b = provider2;
        this.f228095c = provider3;
        this.f228096d = provider4;
        this.f228097e = provider5;
        this.f228098f = provider6;
        this.f228099g = provider7;
        this.f228100h = provider8;
        this.f228101i = provider9;
        this.f228102j = provider10;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33433e(this.f228093a.get(), this.f228094b.get(), this.f228095c.get(), this.f228096d.get(), this.f228097e.get(), this.f228098f.get(), this.f228099g.get(), this.f228100h.get(), this.f228101i.get(), this.f228102j.get());
    }
}
