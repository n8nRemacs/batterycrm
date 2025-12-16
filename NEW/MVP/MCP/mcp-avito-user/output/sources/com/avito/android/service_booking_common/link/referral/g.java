package com.avito.android.service_booking_common.link.referral;

import com.avito.android.account.E;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingReferralRegisterLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f276671a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f276672b;

    /* renamed from: c, reason: collision with root package name */
    public final c f276673c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f276674d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<E> f276675e;

    public g(dagger.internal.f fVar, Provider provider, c cVar, dv.b bVar, Provider provider2) {
        this.f276671a = fVar;
        this.f276672b = provider;
        this.f276673c = cVar;
        this.f276674d = bVar;
        this.f276675e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.deeplink_handler.handler.composite.a) this.f276671a.get(), this.f276672b.get(), (a) this.f276673c.get(), (a.g) this.f276674d.get(), this.f276675e.get());
    }
}
