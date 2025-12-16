package com.avito.android.iac_dialer.impl_module.notifications.new_impl;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import pK.InterfaceC46970a;

/* compiled from: IacNotificationManagerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f166129a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC46970a> f166130b;

    /* renamed from: c, reason: collision with root package name */
    public final u f166131c;

    public h(dagger.internal.f fVar, u uVar, Provider provider) {
        this.f166129a = fVar;
        this.f166130b = provider;
        this.f166131c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.notification.m) this.f166129a.get(), this.f166130b.get(), (a) this.f166131c.get());
    }
}
