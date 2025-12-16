package com.avito.android.messenger.conversation.mvi.deeplinks.payout;

import android.content.res.Resources;
import com.avito.android.C36167y1;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SafeDealPayoutInitDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final OY.d f190602a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f190603b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.remote.error.i f190604c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f190605d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f190606e;

    /* renamed from: f, reason: collision with root package name */
    public final C36167y1 f190607f;

    /* renamed from: g, reason: collision with root package name */
    public final dv.b f190608g;

    /* renamed from: h, reason: collision with root package name */
    public final Xu.c f190609h;

    /* renamed from: i, reason: collision with root package name */
    public final dv.b f190610i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.f f190611j;

    public m(OY.d dVar, Provider provider, com.avito.android.remote.error.i iVar, dv.b bVar, dv.b bVar2, C36167y1 c36167y1, dv.b bVar3, Xu.c cVar, dv.b bVar4, dagger.internal.f fVar) {
        this.f190602a = dVar;
        this.f190603b = provider;
        this.f190604c = iVar;
        this.f190605d = bVar;
        this.f190606e = bVar2;
        this.f190607f = c36167y1;
        this.f190608g = bVar3;
        this.f190609h = cVar;
        this.f190610i = bVar4;
        this.f190611j = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((n) this.f190602a.get(), this.f190603b.get(), (com.avito.android.remote.error.f) this.f190604c.get(), (a.InterfaceC4053a) this.f190605d.get(), (a.d) this.f190606e.get(), (InterfaceC36134w1) this.f190607f.get(), (a.g) this.f190608g.get(), (Resources) this.f190609h.get(), (a.b) this.f190610i.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f190611j.get());
    }
}
