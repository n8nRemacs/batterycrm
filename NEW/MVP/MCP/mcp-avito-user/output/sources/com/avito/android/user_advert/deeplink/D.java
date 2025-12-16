package com.avito.android.user_advert.deeplink;

import com.avito.android.L;
import com.avito.android.O;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: MyAdvertUnblockDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final eH0.e f310684a;

    /* renamed from: b, reason: collision with root package name */
    public final O f310685b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f310686c;

    public D(O o12, dv.b bVar, eH0.e eVar) {
        this.f310684a = eVar;
        this.f310685b = o12;
        this.f310686c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C((L) this.f310685b.get(), (a.InterfaceC4053a) this.f310686c.get(), (eH0.c) this.f310684a.get());
    }
}
