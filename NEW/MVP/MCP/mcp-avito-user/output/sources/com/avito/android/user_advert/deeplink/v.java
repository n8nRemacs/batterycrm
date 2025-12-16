package com.avito.android.user_advert.deeplink;

import com.avito.android.L;
import com.avito.android.O;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: MyAdvertReservationDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final eH0.e f310775a;

    /* renamed from: b, reason: collision with root package name */
    public final O f310776b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f310777c;

    public v(O o12, dv.b bVar, eH0.e eVar) {
        this.f310775a = eVar;
        this.f310776b = o12;
        this.f310777c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u((L) this.f310776b.get(), (a.InterfaceC4053a) this.f310777c.get(), (eH0.c) this.f310775a.get());
    }
}
