package com.avito.android.service_booking_common.link.confirm;

import android.content.Context;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.remote.error.i;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingConfirmLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final C25721c f276615a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f276616b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f276617c;

    /* renamed from: d, reason: collision with root package name */
    public final i f276618d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f276619e;

    /* renamed from: f, reason: collision with root package name */
    public final h f276620f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f276621g;

    /* renamed from: h, reason: collision with root package name */
    public final C30102l3 f276622h;

    public e(C25721c c25721c, Provider provider, dv.b bVar, i iVar, dv.b bVar2, h hVar, Provider provider2, C30102l3 c30102l3) {
        this.f276615a = c25721c;
        this.f276616b = provider;
        this.f276617c = bVar;
        this.f276618d = iVar;
        this.f276619e = bVar2;
        this.f276620f = hVar;
        this.f276621g = provider2;
        this.f276622h = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((C25719a) this.f276615a.get(), this.f276616b.get(), (a.g) this.f276617c.get(), (com.avito.android.remote.error.f) this.f276618d.get(), (a.i) this.f276619e.get(), (ServiceBookingOrderActionInteractor) this.f276620f.get(), this.f276621g.get(), (Context) this.f276622h.get());
    }
}
