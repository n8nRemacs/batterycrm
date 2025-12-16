package com.avito.android.str_calendar.seller.calandar_parameters.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrCalendarParametersAdapterModule_ProvideCheckmarkAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f286844a;

    /* renamed from: b, reason: collision with root package name */
    public final u f286845b;

    public f(d dVar, u uVar) {
        this.f286844a = dVar;
        this.f286845b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f286845b.get();
        this.f286844a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
