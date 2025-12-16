package com.avito.android.advert.item.service_booking;

import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28265d> f79864a;

    public o(Provider<InterfaceC28265d> provider) {
        this.f79864a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f79864a.get());
    }
}
