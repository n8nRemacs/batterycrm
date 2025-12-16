package com.avito.android.service_booking_common.link.confirm;

import Bs0.InterfaceC13182a;
import com.avito.android.remote.error.i;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingOrderActionInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13182a> f276627a;

    /* renamed from: b, reason: collision with root package name */
    public final i f276628b;

    public h(Provider provider, i iVar) {
        this.f276627a = provider;
        this.f276628b = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(dagger.internal.g.b(this.f276627a), (com.avito.android.remote.error.f) this.f276628b.get());
    }
}
