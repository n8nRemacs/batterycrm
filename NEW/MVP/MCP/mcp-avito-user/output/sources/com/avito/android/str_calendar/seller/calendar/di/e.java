package com.avito.android.str_calendar.seller.calendar.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerCalendarModule_ProvideAdapterPresenter$_avito_str_calendar_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f287583a;

    /* renamed from: b, reason: collision with root package name */
    public final u f287584b;

    public e(d dVar, u uVar) {
        this.f287583a = dVar;
        this.f287584b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f287584b.get();
        this.f287583a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
