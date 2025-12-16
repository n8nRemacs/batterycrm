package com.avito.android.service_booking_common.link.cancel;

import android.content.Context;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.remote.error.i;
import com.avito.android.service_booking_common.link.confirm.ServiceBookingOrderActionInteractor;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingCancelLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final C25721c f276585a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f276586b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f276587c;

    /* renamed from: d, reason: collision with root package name */
    public final i f276588d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f276589e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.service_booking_common.link.confirm.h f276590f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f276591g;

    /* renamed from: h, reason: collision with root package name */
    public final C30102l3 f276592h;

    public e(C25721c c25721c, Provider provider, dv.b bVar, i iVar, dv.b bVar2, com.avito.android.service_booking_common.link.confirm.h hVar, Provider provider2, C30102l3 c30102l3) {
        this.f276585a = c25721c;
        this.f276586b = provider;
        this.f276587c = bVar;
        this.f276588d = iVar;
        this.f276589e = bVar2;
        this.f276590f = hVar;
        this.f276591g = provider2;
        this.f276592h = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((C25719a) this.f276585a.get(), this.f276586b.get(), (a.g) this.f276587c.get(), (com.avito.android.remote.error.f) this.f276588d.get(), (a.i) this.f276589e.get(), (ServiceBookingOrderActionInteractor) this.f276590f.get(), this.f276591g.get(), (Context) this.f276592h.get());
    }
}
