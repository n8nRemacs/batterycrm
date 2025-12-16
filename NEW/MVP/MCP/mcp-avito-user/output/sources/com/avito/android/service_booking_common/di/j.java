package com.avito.android.service_booking_common.di;

import com.avito.android.service_booking_common.link.referral.ServiceBookingReferralRegisterLink;
import lv.C43834a;

/* compiled from: ServiceBookingCommonLinkHandlerModule_ProvideServiceBookingReferralRegisterMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_common.link.referral.g f276518a;

    public j(com.avito.android.service_booking_common.link.referral.g gVar) {
        this.f276518a = gVar;
    }

    public static C43834a a(com.avito.android.service_booking_common.link.referral.g gVar) {
        C34929e.f276513a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ServiceBookingReferralRegisterLink.class, new com.avito.android.service_booking_common.link.referral.h(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ServiceBookingReferralRegisterLink.class), gVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f276518a);
    }
}
