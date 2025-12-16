package com.avito.android.str_calendar.seller.di;

import com.avito.android.str_calendar.deeplink.StrSellerCalendarLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: StrSellerCalendarDeeplinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f287841a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.str_calendar.seller.deeplink.b f287842b;

    public e(d dVar, com.avito.android.str_calendar.seller.deeplink.b bVar) {
        this.f287841a = dVar;
        this.f287842b = bVar;
    }

    public static C43834a a(d dVar, com.avito.android.str_calendar.seller.deeplink.b bVar) {
        dVar.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(StrSellerCalendarLink.class, new com.avito.android.str_calendar.seller.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(StrSellerCalendarLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f287841a, this.f287842b);
    }
}
