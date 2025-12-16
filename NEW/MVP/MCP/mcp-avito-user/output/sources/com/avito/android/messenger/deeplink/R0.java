package com.avito.android.messenger.deeplink;

import android.content.Context;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.messenger.di.C32427c1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;
import ru.avito.messenger.MessengerApi;

/* compiled from: SendMessageByItemDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class R0 implements dagger.internal.h<O0> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f195410a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f195411b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f195412c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f195413d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f195414e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f195415f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f195416g;

    /* renamed from: h, reason: collision with root package name */
    public final C32427c1 f195417h;

    public R0(C30102l3 c30102l3, dv.b bVar, dv.b bVar2, C25721c c25721c, dv.b bVar3, Provider provider, Provider provider2, C32427c1 c32427c1) {
        this.f195410a = c30102l3;
        this.f195411b = bVar;
        this.f195412c = bVar2;
        this.f195413d = c25721c;
        this.f195414e = bVar3;
        this.f195415f = provider;
        this.f195416g = provider2;
        this.f195417h = c32427c1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new O0((Context) this.f195410a.get(), (a.b) this.f195411b.get(), (a.InterfaceC4053a) this.f195412c.get(), (C25719a) this.f195413d.get(), (a.g) this.f195414e.get(), this.f195415f.get(), this.f195416g.get(), (MessengerApi) this.f195417h.get());
    }
}
