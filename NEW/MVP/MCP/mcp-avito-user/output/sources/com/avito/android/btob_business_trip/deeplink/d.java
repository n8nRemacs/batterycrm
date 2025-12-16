package com.avito.android.btob_business_trip.deeplink;

import com.avito.android.btob_business_trip.B2bBusinessTripDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: B2bBusinessTripDeeplinkModule_ProvideB2bBusinessTripHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f107844a;

    /* renamed from: b, reason: collision with root package name */
    public final f f107845b;

    public d(b bVar, f fVar) {
        this.f107844a = bVar;
        this.f107845b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f107845b.getClass();
        e eVar = new e();
        b bVar = this.f107844a;
        c.f107843a.getClass();
        return new C43834a(B2bBusinessTripDeeplink.class, eVar, new C43834a.b.C11809b(bVar));
    }
}
