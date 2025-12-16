package com.avito.android.async_phone.impl_module.phone_request_link;

import Gd.InterfaceC13866a;
import android.content.res.Resources;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneRequestLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class m implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13866a> f92189a;

    /* renamed from: b, reason: collision with root package name */
    public final c f92190b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f92191c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f92192d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f92193e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f92194f;

    /* renamed from: g, reason: collision with root package name */
    public final dv.b f92195g;

    /* renamed from: h, reason: collision with root package name */
    public final dv.b f92196h;

    /* renamed from: i, reason: collision with root package name */
    public final Xu.c f92197i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f92198j;

    /* renamed from: k, reason: collision with root package name */
    public final com.avito.android.remote.error.i f92199k;

    public m(Provider provider, c cVar, C25721c c25721c, dagger.internal.f fVar, dv.b bVar, dv.b bVar2, dv.b bVar3, dv.b bVar4, Xu.c cVar2, Provider provider2, com.avito.android.remote.error.i iVar) {
        this.f92189a = provider;
        this.f92190b = cVar;
        this.f92191c = c25721c;
        this.f92192d = fVar;
        this.f92193e = bVar;
        this.f92194f = bVar2;
        this.f92195g = bVar3;
        this.f92196h = bVar4;
        this.f92197i = cVar2;
        this.f92198j = provider2;
        this.f92199k = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f92189a.get(), (a) this.f92190b.get(), (C25719a) this.f92191c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f92192d.get(), (a.f) this.f92193e.get(), (a.g) this.f92194f.get(), (a.d) this.f92195g.get(), (a.i) this.f92196h.get(), (Resources) this.f92197i.get(), this.f92198j.get(), (com.avito.android.remote.error.f) this.f92199k.get());
    }
}
