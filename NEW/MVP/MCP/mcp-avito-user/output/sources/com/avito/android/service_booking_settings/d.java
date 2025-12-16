package com.avito.android.service_booking_settings;

import android.content.Context;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingWorkHoursLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f277778a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f277779b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f277780c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f277781d;

    public d(C25721c c25721c, C30102l3 c30102l3, dv.b bVar, dv.b bVar2) {
        this.f277778a = bVar;
        this.f277779b = c30102l3;
        this.f277780c = bVar2;
        this.f277781d = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f277778a.get();
        return new c((Context) this.f277779b.get(), (C25719a) this.f277781d.get(), interfaceC4053a, (a.b) this.f277780c.get());
    }
}
