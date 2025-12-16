package com.avito.android.service_booking_day_settings.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SettingsRecyclerModule_BindItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class s implements dagger.internal.h<com.avito.android.service_booking_day_settings.daysettings.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f277163a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f277164b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f277165c;

    public s(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3) {
        this.f277163a = lVar;
        this.f277164b = lVar2;
        this.f277165c = lVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.l lVar = (Y41.l) this.f277163a.f393949a;
        Y41.q qVar = (Y41.q) this.f277164b.f393949a;
        Y41.q qVar2 = (Y41.q) this.f277165c.f393949a;
        r.f277162a.getClass();
        return new com.avito.android.service_booking_day_settings.daysettings.adapter.h(lVar, qVar, qVar2);
    }
}
