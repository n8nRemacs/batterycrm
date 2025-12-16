package com.avito.android.notification_center.list.item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: NotificationCenterListItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f207624a;

    public k(u uVar) {
        this.f207624a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((m) this.f207624a.get());
    }
}
