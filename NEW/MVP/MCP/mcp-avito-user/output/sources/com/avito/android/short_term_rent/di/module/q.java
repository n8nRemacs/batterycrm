package com.avito.android.short_term_rent.di.module;

import com.avito.android.str_core.toggle_booking.ToggleOnlineBookingDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: StrToggleBookingDeepLinkModule_ProvideLockBookingDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class q implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.short_term_rent.toggle_booking.i f282348a;

    public q(com.avito.android.short_term_rent.toggle_booking.i iVar) {
        this.f282348a = iVar;
    }

    public static C43834a a(com.avito.android.short_term_rent.toggle_booking.i iVar) {
        p.f282347a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ToggleOnlineBookingDeepLink.class, new ToggleOnlineBookingDeepLink.b(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ToggleOnlineBookingDeepLink.class), iVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f282348a);
    }
}
