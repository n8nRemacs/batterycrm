package com.avito.android.profile_settings_extended.mvi;

import Hb0.InterfaceC13947a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile_settings_extended.InterfaceC33467a;
import com.avito.android.profile_settings_extended.InterfaceC33475i;
import com.avito.android.profile_settings_extended.InterfaceC33507u;
import com.avito.android.util.R0;
import com.avito.android.util.W;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSettingsActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class x implements dagger.internal.h<C33480a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC33507u> f230752a;

    /* renamed from: b, reason: collision with root package name */
    public final N f230753b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.profile_settings_extended.T> f230754c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC33475i> f230755d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.profile_settings_extended.carousel.a> f230756e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.profile_settings_extended.adapter.universal.section.o f230757f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.profile_settings_extended.phones.a> f230758g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC33467a> f230759h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.profile_settings_extended.adapter.item_selections.a> f230760i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f230761j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f230762k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.profile_settings_extended.P> f230763l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f230764m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<R0> f230765n;

    /* renamed from: o, reason: collision with root package name */
    public final W f230766o;

    /* renamed from: p, reason: collision with root package name */
    public final dagger.internal.u f230767p;

    public x(Provider provider, N n12, Provider provider2, Provider provider3, Provider provider4, com.avito.android.profile_settings_extended.adapter.universal.section.o oVar, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, W w12, dagger.internal.u uVar) {
        this.f230752a = provider;
        this.f230753b = n12;
        this.f230754c = provider2;
        this.f230755d = provider3;
        this.f230756e = provider4;
        this.f230757f = oVar;
        this.f230758g = provider5;
        this.f230759h = provider6;
        this.f230760i = provider7;
        this.f230761j = provider8;
        this.f230762k = provider9;
        this.f230763l = provider10;
        this.f230764m = provider11;
        this.f230765n = provider12;
        this.f230766o = w12;
        this.f230767p = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33480a(this.f230752a.get(), (B) this.f230753b.get(), this.f230754c.get(), this.f230755d.get(), this.f230756e.get(), (com.avito.android.profile_settings_extended.adapter.universal.section.n) this.f230757f.get(), this.f230758g.get(), this.f230759h.get(), this.f230760i.get(), this.f230761j.get(), this.f230762k.get(), this.f230763l.get(), this.f230764m.get(), this.f230765n.get(), (com.avito.android.util.U) this.f230766o.get(), (InterfaceC13947a) this.f230767p.get());
    }
}
