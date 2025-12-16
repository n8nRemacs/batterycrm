package com.avito.android.profile.user_profile.mvi;

import cK.InterfaceC27058a;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.preloading.coroutines.AbstractC33302a;
import com.avito.android.profile.user_profile.CardToOpenFromProfile;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import com.avito.android.social.InterfaceC35025q;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: UserProfileActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class d0 implements dagger.internal.h<C33388a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f226383a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.profile.user_profile.j> f226384b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.notification_center.counter.f> f226385c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC27058a> f226386d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.passport_lib.h> f226387e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.profile.user_profile.cards.active_orders.j> f226388f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<NL.a> f226389g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.profile.user_profile.u> f226390h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f226391i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC27663a> f226392j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.account.G> f226393k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f226394l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<InterfaceC35025q> f226395m;

    /* renamed from: n, reason: collision with root package name */
    public final dagger.internal.u f226396n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<s90.e> f226397o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f226398p;

    /* renamed from: q, reason: collision with root package name */
    public final Provider<R0> f226399q;

    /* renamed from: r, reason: collision with root package name */
    public final Provider<gD.f> f226400r;

    /* renamed from: s, reason: collision with root package name */
    public final com.avito.android.profile.user_profile.di.w f226401s;

    /* renamed from: t, reason: collision with root package name */
    public final com.avito.android.profile.user_profile.di.j f226402t;

    /* renamed from: u, reason: collision with root package name */
    public final Provider<AbstractC33302a<com.avito.android.profile.user_profile.preloading.e, UserProfileInternalAction>> f226403u;

    /* renamed from: v, reason: collision with root package name */
    public final com.avito.android.profile.user_profile.uxf.c f226404v;

    /* renamed from: w, reason: collision with root package name */
    public final Provider<Bw0.i> f226405w;

    public d0(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, dagger.internal.u uVar, Provider provider13, Provider provider14, Provider provider15, Provider provider16, com.avito.android.profile.user_profile.di.w wVar, com.avito.android.profile.user_profile.di.j jVar, Provider provider17, com.avito.android.profile.user_profile.uxf.c cVar, Provider provider18) {
        this.f226383a = lVar;
        this.f226384b = provider;
        this.f226385c = provider2;
        this.f226386d = provider3;
        this.f226387e = provider4;
        this.f226388f = provider5;
        this.f226389g = provider6;
        this.f226390h = provider7;
        this.f226391i = provider8;
        this.f226392j = provider9;
        this.f226393k = provider10;
        this.f226394l = provider11;
        this.f226395m = provider12;
        this.f226396n = uVar;
        this.f226397o = provider13;
        this.f226398p = provider14;
        this.f226399q = provider15;
        this.f226400r = provider16;
        this.f226401s = wVar;
        this.f226402t = jVar;
        this.f226403u = provider17;
        this.f226404v = cVar;
        this.f226405w = provider18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C33388a((CardToOpenFromProfile) this.f226383a.f393949a, this.f226384b.get(), this.f226385c.get(), this.f226386d.get(), this.f226387e.get(), this.f226388f.get(), this.f226389g.get(), this.f226390h.get(), this.f226391i.get(), this.f226392j.get(), this.f226393k.get(), this.f226394l.get(), this.f226395m.get(), (com.avito.android.rating_ux_feedback.b) this.f226396n.get(), this.f226397o.get(), this.f226398p.get(), this.f226399q.get(), this.f226400r.get(), (com.avito.android.profile.user_profile.cards.wallet.m) this.f226401s.get(), (com.avito.android.profile.user_profile.cards.wallet.d) this.f226402t.get(), this.f226403u.get(), (com.avito.android.profile.user_profile.uxf.b) this.f226404v.get(), this.f226405w.get());
    }
}
