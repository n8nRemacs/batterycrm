package com.avito.android.service_booking.mvi.di;

import Es0.C13525a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.service_booking.BookingFlow;
import com.avito.android.service_booking.BookingFlowSource;
import com.avito.android.service_booking.mvi.di.c;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ys0.InterfaceC50295f;

/* compiled from: ServiceBookingMviModule_ProvideEventTracker$_avito_service_booking_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class t implements dagger.internal.h<InterfaceC50295f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f274344a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f274345b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f274346c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f274347d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f274348e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f274349f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f274350g;

    public t(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, dagger.internal.l lVar5, dagger.internal.l lVar6, Provider provider) {
        this.f274344a = lVar;
        this.f274345b = lVar2;
        this.f274346c = lVar3;
        this.f274347d = lVar4;
        this.f274348e = lVar5;
        this.f274349f = lVar6;
        this.f274350g = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f274344a.f393949a;
        String str2 = (String) this.f274345b.f393949a;
        String str3 = (String) this.f274346c.f393949a;
        String str4 = (String) this.f274347d.f393949a;
        BookingFlow bookingFlow = (BookingFlow) this.f274348e.f393949a;
        BookingFlowSource bookingFlowSource = (BookingFlowSource) this.f274349f.f393949a;
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((c.C8147c.a) this.f274350g).get();
        s.f274343a.getClass();
        if (bookingFlow == BookingFlow.f274122d) {
            return new C13525a(interfaceC28373a);
        }
        BookingFlow bookingFlow2 = BookingFlow.f274121c;
        return (bookingFlow == bookingFlow2 && bookingFlowSource == BookingFlowSource.f274126d) ? new Es0.d(interfaceC28373a, str2, str3) : bookingFlow == bookingFlow2 ? new Es0.c(interfaceC28373a, str2, str3) : new Es0.b(str, str3, str4, interfaceC28373a);
    }
}
