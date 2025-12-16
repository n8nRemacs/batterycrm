package com.avito.android.remote.notification;

import Bk0.InterfaceC13158a;
import Zf0.C19552a;
import android.content.Context;
import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.C31099l1;
import com.avito.android.InterfaceC31091j1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import y30.InterfaceC50050d;

/* compiled from: NotificationInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes17.dex */
public final class y implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f254112a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f254113b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC34339f> f254114c;

    /* renamed from: d, reason: collision with root package name */
    public final C34348o f254115d;

    /* renamed from: e, reason: collision with root package name */
    public final C f254116e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.notificationdeeplink.e f254117f;

    /* renamed from: g, reason: collision with root package name */
    public final C31099l1 f254118g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.favorite_sellers.service.j f254119h;

    /* renamed from: i, reason: collision with root package name */
    public final com.avito.android.user_advert.advert.service.h f254120i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f254121j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.f f254122k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.mapping.checker.c> f254123l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<InterfaceC34334a> f254124m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<InterfaceC13158a> f254125n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_events.registry.d> f254126o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<com.avito.android.missed_calls.a> f254127p;

    /* renamed from: q, reason: collision with root package name */
    public final C30713g1 f254128q;

    /* renamed from: r, reason: collision with root package name */
    public final Provider<com.avito.android.notification.parameters_factory.e> f254129r;

    /* renamed from: s, reason: collision with root package name */
    public final Provider<com.avito.android.app_foreground_provider.util_module.a> f254130s;

    /* renamed from: t, reason: collision with root package name */
    public final dagger.internal.u f254131t;

    /* renamed from: u, reason: collision with root package name */
    public final com.avito.android.push.impl_module.features.b f254132u;

    /* renamed from: v, reason: collision with root package name */
    public final y30.f f254133v;

    public y(C30102l3 c30102l3, dagger.internal.f fVar, Provider provider, C34348o c34348o, C c12, com.avito.android.notificationdeeplink.e eVar, C31099l1 c31099l1, com.avito.android.favorite_sellers.service.j jVar, com.avito.android.user_advert.advert.service.h hVar, Provider provider2, dagger.internal.f fVar2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, C30713g1 c30713g1, Provider provider8, Provider provider9, dagger.internal.u uVar, com.avito.android.push.impl_module.features.b bVar, y30.f fVar3) {
        this.f254112a = c30102l3;
        this.f254113b = fVar;
        this.f254114c = provider;
        this.f254115d = c34348o;
        this.f254116e = c12;
        this.f254117f = eVar;
        this.f254118g = c31099l1;
        this.f254119h = jVar;
        this.f254120i = hVar;
        this.f254121j = provider2;
        this.f254122k = fVar2;
        this.f254123l = provider3;
        this.f254124m = provider4;
        this.f254125n = provider5;
        this.f254126o = provider6;
        this.f254127p = provider7;
        this.f254128q = c30713g1;
        this.f254129r = provider8;
        this.f254130s = provider9;
        this.f254131t = uVar;
        this.f254132u = bVar;
        this.f254133v = fVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new r((Context) this.f254112a.get(), (com.avito.android.notification.m) this.f254113b.get(), this.f254114c.get(), (InterfaceC34346m) this.f254115d.get(), (A) this.f254116e.get(), (com.avito.android.notificationdeeplink.c) this.f254117f.get(), (InterfaceC31091j1) this.f254118g.get(), (com.avito.android.favorite_sellers.service.h) this.f254119h.get(), (com.avito.android.user_advert.advert.service.f) this.f254120i.get(), this.f254121j.get(), (InterfaceC28373a) this.f254122k.get(), this.f254123l.get(), this.f254124m.get(), this.f254125n.get(), this.f254126o.get(), this.f254127p.get(), (C30277e1) this.f254128q.get(), this.f254129r.get(), this.f254130s.get(), (Bk0.f) this.f254131t.get(), (C19552a) this.f254132u.get(), (InterfaceC50050d) this.f254133v.get());
    }
}
