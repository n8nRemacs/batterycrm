package com.avito.android.btob_business_trip.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import qk.InterfaceC47408a;

/* compiled from: B2bBusinessTripDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final qk.c f107841a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f107842b;

    public b(qk.c cVar, dv.b bVar) {
        this.f107841a = cVar;
        this.f107842b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC47408a) this.f107841a.get(), (a.InterfaceC4053a) this.f107842b.get());
    }
}
