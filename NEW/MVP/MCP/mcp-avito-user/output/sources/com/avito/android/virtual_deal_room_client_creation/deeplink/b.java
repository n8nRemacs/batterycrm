package com.avito.android.virtual_deal_room_client_creation.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreateClientDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f326906a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f326907b;

    /* renamed from: c, reason: collision with root package name */
    public final YN0.c f326908c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f326909d;

    public b(dv.b bVar, dv.b bVar2, YN0.c cVar, Provider provider) {
        this.f326906a = bVar;
        this.f326907b = bVar2;
        this.f326908c = cVar;
        this.f326909d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.b) this.f326906a.get(), (a.InterfaceC4053a) this.f326907b.get(), (YN0.a) this.f326908c.get(), this.f326909d.get());
    }
}
