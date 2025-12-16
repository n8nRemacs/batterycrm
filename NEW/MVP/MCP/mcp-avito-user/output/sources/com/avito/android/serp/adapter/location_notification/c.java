package com.avito.android.serp.adapter.location_notification;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LocationNotificationItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f270254a;

    public c(u uVar) {
        this.f270254a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((f) this.f270254a.get());
    }
}
