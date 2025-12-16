package com.avito.android.notification_center.counter;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotificationCenterPushHandlerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<j> f207503a;

    public m(Provider<j> provider) {
        this.f207503a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f207503a.get());
    }
}
