package com.avito.android.str_calendar.seller.last_minute_offer;

import com.avito.android.remote.d1;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LastMinuteOfferInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d1> f287903a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f287904b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f287905c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f287906d;

    /* renamed from: e, reason: collision with root package name */
    public final u f287907e;

    public i(dagger.internal.l lVar, dagger.internal.l lVar2, u uVar, Provider provider, Provider provider2) {
        this.f287903a = provider;
        this.f287904b = provider2;
        this.f287905c = lVar;
        this.f287906d = lVar2;
        this.f287907e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f287903a.get(), this.f287904b.get(), (String) this.f287905c.f393949a, (SelectedDateRange) this.f287906d.f393949a, (k) this.f287907e.get());
    }
}
