package com.avito.android.notification_center.list.mvi;

import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotificationCenterReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final u f207717a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f207718b;

    public p(u uVar, Provider provider) {
        this.f207717a = uVar;
        this.f207718b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((com.avito.android.notification_center.list.f) this.f207717a.get(), this.f207718b.get());
    }
}
