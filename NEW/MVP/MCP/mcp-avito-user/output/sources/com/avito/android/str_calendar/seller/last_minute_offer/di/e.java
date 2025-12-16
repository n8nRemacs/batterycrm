package com.avito.android.str_calendar.seller.last_minute_offer.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.StrSellerCalendarLastMinuteOffer;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LastMinuteOfferModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f287878a;

    public e(l lVar) {
        this.f287878a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f287878a.f393949a;
        d.f287877a.getClass();
        return new C28478k(StrSellerCalendarLastMinuteOffer.f90517d, rVar, null, 4, null);
    }
}
