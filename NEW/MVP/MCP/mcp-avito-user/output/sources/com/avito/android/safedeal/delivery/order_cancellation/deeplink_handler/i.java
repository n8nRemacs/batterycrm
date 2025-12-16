package com.avito.android.safedeal.delivery.order_cancellation.deeplink_handler;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.remote.B;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zn0.C50597d;
import zn0.InterfaceC50594a;

/* compiled from: DeliveryOrderCancelDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f256130a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f256131b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f256132c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f256133d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f256134e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<B> f256135f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f256136g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.remote.error.i f256137h;

    /* renamed from: i, reason: collision with root package name */
    public final C50597d f256138i;

    /* renamed from: j, reason: collision with root package name */
    public final p f256139j;

    public i(C30102l3 c30102l3, dv.b bVar, dv.b bVar2, dv.b bVar3, dv.b bVar4, Provider provider, Provider provider2, com.avito.android.remote.error.i iVar, C50597d c50597d, p pVar) {
        this.f256130a = c30102l3;
        this.f256131b = bVar;
        this.f256132c = bVar2;
        this.f256133d = bVar3;
        this.f256134e = bVar4;
        this.f256135f = provider;
        this.f256136g = provider2;
        this.f256137h = iVar;
        this.f256138i = c50597d;
        this.f256139j = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f256130a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f256131b.get();
        a.d dVar = (a.d) this.f256132c.get();
        a.g gVar = (a.g) this.f256133d.get();
        a.b bVar = (a.b) this.f256134e.get();
        B b12 = this.f256135f.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f256136g.get();
        com.avito.android.remote.error.f fVar = (com.avito.android.remote.error.f) this.f256137h.get();
        InterfaceC50594a interfaceC50594a = (InterfaceC50594a) this.f256138i.get();
        this.f256139j.getClass();
        return new d(context, interfaceC4053a, dVar, gVar, bVar, b12, interfaceC35745a5, fVar, interfaceC50594a, new o());
    }
}
