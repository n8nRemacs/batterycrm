package com.avito.android.str_booking.domain.polling;

import Nx0.InterfaceC14622b;
import Px0.InterfaceC14851a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lE.C43624b;

/* compiled from: StrBookingPollingDelegateImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f285714a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14622b> f285715b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC14851a> f285716c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C43624b> f285717d;

    public h(l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f285714a = lVar;
        this.f285715b = provider;
        this.f285716c = provider2;
        this.f285717d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((String) this.f285714a.f393949a, this.f285715b.get(), this.f285716c.get(), this.f285717d.get());
    }
}
