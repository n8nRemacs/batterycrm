package com.avito.android.service_booking.mvi.di;

import com.avito.android.service_booking.deeplinks.create_by_seller.ServiceBookingCreateBySellerLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ServiceBookingLinkHandlerModule_ProvideServiceBookingCreateBySellerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking.deeplinks.create_by_seller.c f274339a;

    public m(com.avito.android.service_booking.deeplinks.create_by_seller.c cVar) {
        this.f274339a = cVar;
    }

    public static C43834a a(com.avito.android.service_booking.deeplinks.create_by_seller.c cVar) {
        l.f274338a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ServiceBookingCreateBySellerLink.class, new com.avito.android.service_booking.deeplinks.create_by_seller.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ServiceBookingCreateBySellerLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f274339a);
    }
}
