package com.avito.android.service_booking.mvi.di;

import com.avito.android.service_booking.deeplinks.verify_phone.ServiceBookingVerifyPhoneLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ServiceBookingLinkHandlerModule_ProvideServiceBookingVerifyPhoneLinkFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking.deeplinks.verify_phone.d f274342a;

    public p(com.avito.android.service_booking.deeplinks.verify_phone.d dVar) {
        this.f274342a = dVar;
    }

    public static C43834a a(com.avito.android.service_booking.deeplinks.verify_phone.d dVar) {
        l.f274338a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ServiceBookingVerifyPhoneLink.class, new com.avito.android.service_booking.deeplinks.verify_phone.e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ServiceBookingVerifyPhoneLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f274342a);
    }
}
