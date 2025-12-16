package com.avito.android.messenger.conversation.mvi.deeplinks.payout;

import android.content.res.Resources;
import com.avito.android.C36167y1;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliveryCourierPayoutInitDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final OY.b f190552a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f190553b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.remote.error.i f190554c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f190555d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f190556e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f190557f;

    /* renamed from: g, reason: collision with root package name */
    public final C36167y1 f190558g;

    /* renamed from: h, reason: collision with root package name */
    public final Xu.c f190559h;

    /* renamed from: i, reason: collision with root package name */
    public final dv.b f190560i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.f f190561j;

    public f(OY.b bVar, Provider provider, com.avito.android.remote.error.i iVar, dv.b bVar2, dv.b bVar3, dv.b bVar4, C36167y1 c36167y1, Xu.c cVar, dv.b bVar5, dagger.internal.f fVar) {
        this.f190552a = bVar;
        this.f190553b = provider;
        this.f190554c = iVar;
        this.f190555d = bVar2;
        this.f190556e = bVar3;
        this.f190557f = bVar4;
        this.f190558g = c36167y1;
        this.f190559h = cVar;
        this.f190560i = bVar5;
        this.f190561j = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((g) this.f190552a.get(), this.f190553b.get(), (com.avito.android.remote.error.f) this.f190554c.get(), (a.InterfaceC4053a) this.f190555d.get(), (a.d) this.f190556e.get(), (a.g) this.f190557f.get(), (InterfaceC36134w1) this.f190558g.get(), (Resources) this.f190559h.get(), (a.b) this.f190560i.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f190561j.get());
    }
}
