package com.avito.android.service_booking_schedule_repetition_impl.link;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingScheduleRepetitionLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f277612a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f277613b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f277614c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f277615d;

    public c(C25721c c25721c, dv.b bVar, dv.b bVar2, Provider provider) {
        this.f277612a = bVar;
        this.f277613b = bVar2;
        this.f277614c = c25721c;
        this.f277615d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.f fVar = (a.f) this.f277612a.get();
        return new b((C25719a) this.f277614c.get(), (a.d) this.f277613b.get(), fVar, this.f277615d.get());
    }
}
