package com.avito.android.service_booking_additional_settings.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdditionalSettingsBookingToggleModule_ProvideListUpdateCallbackFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final u f275173a;

    public h(u uVar) {
        this.f275173a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f275173a.get();
        a.f275161a.getClass();
        return jVar;
    }
}
