package com.avito.android.notificationdeeplink;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: NotificationDeepLinkViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.notificationdeeplink.mvi.e f207786a;

    public h(com.avito.android.notificationdeeplink.mvi.e eVar) {
        this.f207786a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.notificationdeeplink.mvi.d) this.f207786a.get(), null, 2, null);
    }
}
