package com.avito.android.tariff_cpt.configure.forbidden.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptForbiddenDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f297609a;

    /* renamed from: b, reason: collision with root package name */
    public final hC0.e f297610b;

    public b(dv.b bVar, hC0.e eVar) {
        this.f297609a = bVar;
        this.f297610b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f297609a.get(), (hC0.c) this.f297610b.get());
    }
}
