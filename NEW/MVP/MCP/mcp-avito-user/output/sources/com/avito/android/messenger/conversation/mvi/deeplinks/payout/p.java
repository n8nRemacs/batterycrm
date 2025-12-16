package com.avito.android.messenger.conversation.mvi.deeplinks.payout;

import android.content.res.Resources;
import com.avito.android.C36167y1;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrPayoutInitDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final OY.e f190628a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f190629b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.remote.error.i f190630c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f190631d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f190632e;

    /* renamed from: f, reason: collision with root package name */
    public final C36167y1 f190633f;

    /* renamed from: g, reason: collision with root package name */
    public final dv.b f190634g;

    /* renamed from: h, reason: collision with root package name */
    public final Xu.c f190635h;

    /* renamed from: i, reason: collision with root package name */
    public final dv.b f190636i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.f f190637j;

    /* renamed from: k, reason: collision with root package name */
    public final dv.b f190638k;

    public p(OY.e eVar, Provider provider, com.avito.android.remote.error.i iVar, dv.b bVar, dv.b bVar2, C36167y1 c36167y1, dv.b bVar3, Xu.c cVar, dv.b bVar4, dagger.internal.f fVar, dv.b bVar5) {
        this.f190628a = eVar;
        this.f190629b = provider;
        this.f190630c = iVar;
        this.f190631d = bVar;
        this.f190632e = bVar2;
        this.f190633f = c36167y1;
        this.f190634g = bVar3;
        this.f190635h = cVar;
        this.f190636i = bVar4;
        this.f190637j = fVar;
        this.f190638k = bVar5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((q) this.f190628a.get(), this.f190629b.get(), (com.avito.android.remote.error.f) this.f190630c.get(), (a.InterfaceC4053a) this.f190631d.get(), (a.d) this.f190632e.get(), (InterfaceC36134w1) this.f190633f.get(), (a.g) this.f190634g.get(), (Resources) this.f190635h.get(), (a.b) this.f190636i.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f190637j.get(), (a.i) this.f190638k.get());
    }
}
