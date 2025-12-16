package com.avito.android.service_booking_common.link.referral;

import Bs0.InterfaceC13182a;
import com.avito.android.remote.error.i;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingReferralInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13182a> f276659a;

    /* renamed from: b, reason: collision with root package name */
    public final i f276660b;

    public c(Provider provider, i iVar) {
        this.f276659a = provider;
        this.f276660b = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(dagger.internal.g.b(this.f276659a), (com.avito.android.remote.error.f) this.f276660b.get());
    }
}
