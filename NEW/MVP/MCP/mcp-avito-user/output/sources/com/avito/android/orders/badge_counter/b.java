package com.avito.android.orders.badge_counter;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OrdersBadgeAuthorizationPlugin_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f209941a;

    public b(u uVar) {
        this.f209941a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f209941a.get());
    }
}
