package com.avito.android.notifications_settings.screen.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: NotificationsSettingsModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f208085a;

    public e(u uVar) {
        this.f208085a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f208085a.get();
        int i12 = d.f208084a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
