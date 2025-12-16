package com.avito.android.notification_center.counter;

import Ek0.InterfaceC13498a;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotificationCenterCounterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13498a> f207499a;

    /* renamed from: b, reason: collision with root package name */
    public final u f207500b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f207501c;

    public e(u uVar, Provider provider, Provider provider2) {
        this.f207499a = provider;
        this.f207500b = uVar;
        this.f207501c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(dagger.internal.g.b(this.f207499a), (u3.l) this.f207500b.get(), this.f207501c.get());
    }
}
