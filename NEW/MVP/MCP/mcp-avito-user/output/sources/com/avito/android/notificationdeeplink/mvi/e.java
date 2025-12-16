package com.avito.android.notificationdeeplink.mvi;

import com.avito.android.notificationdeeplink.mvi.entity.NotificationDeepLinkState;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: NotificationDeepLinkFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final g f207814a;

    /* renamed from: b, reason: collision with root package name */
    public final b f207815b;

    public e(g gVar, b bVar) {
        this.f207814a = gVar;
        this.f207815b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f207814a.getClass();
        f fVar = new f();
        a aVar = (a) this.f207815b.get();
        NotificationDeepLinkState.f207816c.getClass();
        return new d("NotificationDeepLink", NotificationDeepLinkState.f207817d, new c(aVar, fVar));
    }
}
