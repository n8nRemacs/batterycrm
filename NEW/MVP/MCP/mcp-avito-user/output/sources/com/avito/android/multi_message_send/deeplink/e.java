package com.avito.android.multi_message_send.deeplink;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MultiMessageModalScreenDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final E20.c f206651a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f206652b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f206653c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f206654d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f206655e;

    /* renamed from: f, reason: collision with root package name */
    public final C30102l3 f206656f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<R0> f206657g;

    public e(E20.c cVar, dv.b bVar, dv.b bVar2, dv.b bVar3, dagger.internal.f fVar, C30102l3 c30102l3, Provider provider) {
        this.f206651a = cVar;
        this.f206652b = bVar;
        this.f206653c = bVar2;
        this.f206654d = bVar3;
        this.f206655e = fVar;
        this.f206656f = c30102l3;
        this.f206657g = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((E20.a) this.f206651a.get(), (a.InterfaceC4053a) this.f206652b.get(), (a.b) this.f206653c.get(), (a.i) this.f206654d.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f206655e.get(), (Context) this.f206656f.get(), this.f206657g.get());
    }
}
