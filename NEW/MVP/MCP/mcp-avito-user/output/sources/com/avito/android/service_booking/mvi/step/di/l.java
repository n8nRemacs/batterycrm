package com.avito.android.service_booking.mvi.step.di;

import dagger.internal.x;
import dagger.internal.y;
import java.util.List;
import java.util.Map;

/* compiled from: ServiceBookingMviStepModule_ProvideStepsQueryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<Map<String, List<String>>> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f274634a;

    public l(dagger.internal.l lVar) {
        this.f274634a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Map map = (Map) this.f274634a.f393949a;
        d.f274623a.getClass();
        return com.avito.android.service_booking.mvi.domain.d.c(map);
    }
}
