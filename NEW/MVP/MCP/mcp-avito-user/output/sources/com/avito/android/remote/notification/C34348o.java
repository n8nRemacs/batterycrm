package com.avito.android.remote.notification;

import com.avito.android.di.module.C30214v6;

/* compiled from: NotificationCounterStorageImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.remote.notification.o, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34348o implements dagger.internal.h<C34347n> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f254067a;

    public C34348o(C30214v6 c30214v6) {
        this.f254067a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C34347n((AK0.l) this.f254067a.get());
    }
}
