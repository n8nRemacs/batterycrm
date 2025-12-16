package com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement;

import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PairElementPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f287244a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.str_calendar.seller.calandar_parameters.items.input.h f287245b;

    public e(l lVar, com.avito.android.str_calendar.seller.calandar_parameters.items.input.h hVar) {
        this.f287244a = lVar;
        this.f287245b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Y41.l) this.f287244a.f393949a, (com.avito.android.str_calendar.seller.calandar_parameters.items.input.g) this.f287245b.get());
    }
}
