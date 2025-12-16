package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.InterfaceC31662s;
import com.avito.android.messenger.channels.mvi.interactor.InterfaceC31766d;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.persistence.messenger.C33126v0;
import javax.inject.Provider;

/* compiled from: ChannelsListActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class a1 implements dagger.internal.h<C31772a> {

    /* renamed from: a, reason: collision with root package name */
    public final Z0 f187955a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.mvi.data.M> f187956b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<ChannelSyncAgent> f187957c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.mvi.sync.G0> f187958d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.messenger.service.r f187959e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f187960f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.messenger.channels.mvi.di.u f187961g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.messenger.channels.mvi.di.v f187962h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.analytics.i> f187963i;

    /* renamed from: j, reason: collision with root package name */
    public final CY.e f187964j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.analytics.d> f187965k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f187966l;

    /* renamed from: m, reason: collision with root package name */
    public final com.avito.android.messenger.channels.mvi.di.t f187967m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<com.avito.android.util.R0> f187968n;

    /* renamed from: o, reason: collision with root package name */
    public final dagger.internal.l f187969o;

    /* renamed from: p, reason: collision with root package name */
    public final dagger.internal.l f187970p;

    /* renamed from: q, reason: collision with root package name */
    public final com.avito.android.messenger.channels.mvi.interactor.I f187971q;

    /* renamed from: r, reason: collision with root package name */
    public final Provider<C30277e1> f187972r;

    /* renamed from: s, reason: collision with root package name */
    public final dagger.internal.l f187973s;

    /* renamed from: t, reason: collision with root package name */
    public final dagger.internal.l f187974t;

    /* renamed from: u, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.filter.j> f187975u;

    /* renamed from: v, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.action_banner.g> f187976v;

    /* renamed from: w, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.action_banner.a> f187977w;

    /* renamed from: x, reason: collision with root package name */
    public final Provider<InterfaceC31662s> f187978x;

    public a1(Z0 z02, Provider provider, Provider provider2, Provider provider3, com.avito.android.messenger.service.r rVar, Provider provider4, com.avito.android.messenger.channels.mvi.di.u uVar, com.avito.android.messenger.channels.mvi.di.v vVar, Provider provider5, CY.e eVar, Provider provider6, Provider provider7, com.avito.android.messenger.channels.mvi.di.t tVar, Provider provider8, dagger.internal.l lVar, dagger.internal.l lVar2, com.avito.android.messenger.channels.mvi.interactor.I i12, Provider provider9, dagger.internal.l lVar3, dagger.internal.l lVar4, Provider provider10, Provider provider11, Provider provider12, Provider provider13) {
        this.f187955a = z02;
        this.f187956b = provider;
        this.f187957c = provider2;
        this.f187958d = provider3;
        this.f187959e = rVar;
        this.f187960f = provider4;
        this.f187961g = uVar;
        this.f187962h = vVar;
        this.f187963i = provider5;
        this.f187964j = eVar;
        this.f187965k = provider6;
        this.f187966l = provider7;
        this.f187967m = tVar;
        this.f187968n = provider8;
        this.f187969o = lVar;
        this.f187970p = lVar2;
        this.f187971q = i12;
        this.f187972r = provider9;
        this.f187973s = lVar3;
        this.f187974t = lVar4;
        this.f187975u = provider10;
        this.f187976v = provider11;
        this.f187977w = provider12;
        this.f187978x = provider13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C31772a((W) this.f187955a.get(), this.f187956b.get(), this.f187957c.get(), this.f187958d.get(), (com.avito.android.messenger.service.p) this.f187959e.get(), this.f187960f.get(), (com.avito.android.analytics.timer.a) this.f187961g.get(), (com.avito.android.analytics.timer.a) this.f187962h.get(), this.f187963i.get(), (CY.k) this.f187964j.get(), this.f187965k.get(), this.f187966l.get(), (InterfaceC31766d) this.f187967m.get(), this.f187968n.get(), (C33126v0) this.f187969o.f393949a, (C33126v0) this.f187970p.f393949a, (com.avito.android.messenger.channels.mvi.interactor.A) this.f187971q.get(), this.f187972r.get(), (String) this.f187973s.f393949a, (Boolean) this.f187974t.f393949a, this.f187975u.get(), this.f187976v.get(), this.f187977w.get(), this.f187978x.get());
    }
}
