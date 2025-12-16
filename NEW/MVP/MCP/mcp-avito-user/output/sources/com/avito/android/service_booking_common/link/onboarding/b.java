package com.avito.android.service_booking_common.link.onboarding;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking_persistence.f;
import com.avito.android.service_booking_persistence.i;
import com.avito.android.services_onboarding.di.o;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServicesSteppedOnboardingLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f276650a;

    /* renamed from: b, reason: collision with root package name */
    public final o f276651b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f276652c;

    /* renamed from: d, reason: collision with root package name */
    public final i f276653d;

    public b(dv.b bVar, o oVar, dv.b bVar2, i iVar) {
        this.f276650a = bVar;
        this.f276651b = oVar;
        this.f276652c = bVar2;
        this.f276653d = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f276650a.get(), (com.avito.android.services_onboarding.i) this.f276651b.get(), (a.b) this.f276652c.get(), (f) this.f276653d.get());
    }
}
