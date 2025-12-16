package com.avito.android.messenger.conversation.mvi.deeplinks.payout;

import android.content.res.Resources;
import com.avito.android.C36167y1;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliveryPayoutInitDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final OY.c f190577a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f190578b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.remote.error.i f190579c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f190580d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f190581e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f190582f;

    /* renamed from: g, reason: collision with root package name */
    public final C36167y1 f190583g;

    /* renamed from: h, reason: collision with root package name */
    public final Xu.c f190584h;

    /* renamed from: i, reason: collision with root package name */
    public final dv.b f190585i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.f f190586j;

    public i(OY.c cVar, Provider provider, com.avito.android.remote.error.i iVar, dv.b bVar, dv.b bVar2, dv.b bVar3, C36167y1 c36167y1, Xu.c cVar2, dv.b bVar4, dagger.internal.f fVar) {
        this.f190577a = cVar;
        this.f190578b = provider;
        this.f190579c = iVar;
        this.f190580d = bVar;
        this.f190581e = bVar2;
        this.f190582f = bVar3;
        this.f190583g = c36167y1;
        this.f190584h = cVar2;
        this.f190585i = bVar4;
        this.f190586j = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((j) this.f190577a.get(), this.f190578b.get(), (com.avito.android.remote.error.f) this.f190579c.get(), (a.InterfaceC4053a) this.f190580d.get(), (a.d) this.f190581e.get(), (a.g) this.f190582f.get(), (InterfaceC36134w1) this.f190583g.get(), (Resources) this.f190584h.get(), (a.b) this.f190585i.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f190586j.get());
    }
}
