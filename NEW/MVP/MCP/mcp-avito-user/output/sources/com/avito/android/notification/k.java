package com.avito.android.notification;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetAskNotificationCheckResultInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f207451a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<u3.g<SimpleTestGroupWithNone>> f207452b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f207453c;

    public k(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f207451a = uVar;
        this.f207452b = provider;
        this.f207453c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((b) this.f207451a.get(), this.f207452b.get(), this.f207453c.get());
    }
}
