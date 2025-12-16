package com.avito.android.service_booking_common.di;

import com.avito.android.service_booking_common.link.cancel.ServiceBookingCancelLink;
import lv.C43834a;

/* compiled from: ServiceBookingCommonLinkHandlerModule_ProvideServiceBookingCancelCommonMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.service_booking_common.di.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34930f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_common.link.cancel.e f276514a;

    public C34930f(com.avito.android.service_booking_common.link.cancel.e eVar) {
        this.f276514a = eVar;
    }

    public static C43834a a(com.avito.android.service_booking_common.link.cancel.e eVar) {
        C34929e.f276513a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ServiceBookingCancelLink.class, new com.avito.android.service_booking_common.link.cancel.f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ServiceBookingCancelLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f276514a);
    }
}
