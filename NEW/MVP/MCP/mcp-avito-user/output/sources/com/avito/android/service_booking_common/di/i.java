package com.avito.android.service_booking_common.di;

import com.avito.android.service_booking_common.link.confirm.ServiceBookingConfirmLink;
import lv.C43834a;

/* compiled from: ServiceBookingCommonLinkHandlerModule_ProvideServiceBookingOrdersConfirmMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_common.link.confirm.e f276517a;

    public i(com.avito.android.service_booking_common.link.confirm.e eVar) {
        this.f276517a = eVar;
    }

    public static C43834a a(com.avito.android.service_booking_common.link.confirm.e eVar) {
        C34929e.f276513a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ServiceBookingConfirmLink.class, new com.avito.android.service_booking_common.link.confirm.f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ServiceBookingConfirmLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f276517a);
    }
}
