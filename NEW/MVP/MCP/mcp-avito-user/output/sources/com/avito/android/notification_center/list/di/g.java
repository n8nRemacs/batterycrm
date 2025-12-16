package com.avito.android.notification_center.list.di;

import com.avito.android.notification_center.list.item.j;
import com.avito.android.notification_center.list.item.k;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: NotificationCenterListModule_ProvideItemBinder$_avito_notification_center_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final k f207587a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.notification_center.list.item.b f207588b;

    public g(k kVar, com.avito.android.notification_center.list.item.b bVar) {
        this.f207587a = kVar;
        this.f207588b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        j jVar = (j) this.f207587a.get();
        com.avito.android.notification_center.list.item.a aVar = (com.avito.android.notification_center.list.item.a) this.f207588b.get();
        d.f207580a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(jVar);
        c10493a.b(aVar);
        return c10493a.a();
    }
}
