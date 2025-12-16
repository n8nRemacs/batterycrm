package com.avito.android.notification_center.list;

import Ek0.InterfaceC13498a;
import com.avito.android.remote.model.notification.NotificationResponseMapper_Factory;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotificationCenterListInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13498a> f207719a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationResponseMapper_Factory f207720b;

    public n(Provider provider, NotificationResponseMapper_Factory notificationResponseMapper_Factory) {
        this.f207719a = provider;
        this.f207720b = notificationResponseMapper_Factory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f207719a.get(), this.f207720b.get());
    }
}
