package com.avito.android.iac_dialer.impl_module.notifications.new_impl;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.iac_dialer.impl_module.notifications.channels.IacNotificationChannelManager;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lL.InterfaceC43652a;

/* compiled from: IacNotificationBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f166112a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC43652a> f166113b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<IacNotificationChannelManager> f166114c;

    /* renamed from: d, reason: collision with root package name */
    public final u f166115d;

    public c(C30102l3 c30102l3, u uVar, Provider provider, Provider provider2) {
        this.f166112a = c30102l3;
        this.f166113b = provider;
        this.f166114c = provider2;
        this.f166115d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Context) this.f166112a.get(), this.f166113b.get(), this.f166114c.get(), (k) this.f166115d.get());
    }
}
