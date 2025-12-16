package com.avito.android.notification_center.list.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: NotificationCenterListModule_ProvideAdapterPresenter$_avito_notification_center_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f207586a;

    public f(u uVar) {
        this.f207586a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f207586a.get();
        d.f207580a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
