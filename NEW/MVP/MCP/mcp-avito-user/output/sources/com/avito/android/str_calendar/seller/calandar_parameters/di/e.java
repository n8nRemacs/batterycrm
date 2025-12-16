package com.avito.android.str_calendar.seller.calandar_parameters.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrCalendarParametersAdapterModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f286842a;

    /* renamed from: b, reason: collision with root package name */
    public final u f286843b;

    public e(d dVar, u uVar) {
        this.f286842a = dVar;
        this.f286843b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f286843b.get();
        this.f286842a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
