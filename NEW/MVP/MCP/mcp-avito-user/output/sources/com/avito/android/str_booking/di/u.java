package com.avito.android.str_booking.di;

import com.avito.android.str_core.OpenSellerOrderBookingDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: StrBookingOrderLinkHandlerModule_ProvideOpenSellerOrderBookingLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class u implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.str_booking.deeplink.f f285571a;

    public u(com.avito.android.str_booking.deeplink.f fVar) {
        this.f285571a = fVar;
    }

    public static C43834a a(com.avito.android.str_booking.deeplink.f fVar) {
        s.f285569a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(OpenSellerOrderBookingDeepLink.class, new OpenSellerOrderBookingDeepLink.b(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(OpenSellerOrderBookingDeepLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f285571a);
    }
}
