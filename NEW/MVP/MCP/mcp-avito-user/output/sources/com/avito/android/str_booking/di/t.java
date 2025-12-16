package com.avito.android.str_booking.di;

import com.avito.android.str_core.OpenBuyerOrderBookingDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: StrBookingOrderLinkHandlerModule_ProvideOpenBuyerOrderBookingLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class t implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.str_booking.deeplink.c f285570a;

    public t(com.avito.android.str_booking.deeplink.c cVar) {
        this.f285570a = cVar;
    }

    public static C43834a a(com.avito.android.str_booking.deeplink.c cVar) {
        s.f285569a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(OpenBuyerOrderBookingDeepLink.class, new OpenBuyerOrderBookingDeepLink.b(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(OpenBuyerOrderBookingDeepLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f285570a);
    }
}
