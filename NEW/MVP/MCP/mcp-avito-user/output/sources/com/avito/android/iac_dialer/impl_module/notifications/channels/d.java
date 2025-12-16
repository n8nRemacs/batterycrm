package com.avito.android.iac_dialer.impl_module.notifications.channels;

import android.app.Application;
import com.avito.android.notification.m;
import com.avito.android.remote.notification.A;
import com.avito.android.remote.notification.C;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacNotificationChannelManagerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<IacNotificationChannelManagerImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final l f166091a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<HK.a> f166092b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f166093c;

    /* renamed from: d, reason: collision with root package name */
    public final C f166094d;

    public d(l lVar, Provider provider, dagger.internal.f fVar, C c12) {
        this.f166091a = lVar;
        this.f166092b = provider;
        this.f166093c = fVar;
        this.f166094d = c12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new IacNotificationChannelManagerImpl((Application) this.f166091a.f393949a, this.f166092b.get(), (m) this.f166093c.get(), (A) this.f166094d.get());
    }
}
