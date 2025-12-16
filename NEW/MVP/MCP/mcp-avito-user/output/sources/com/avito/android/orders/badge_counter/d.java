package com.avito.android.orders.badge_counter;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OrdersBadgeCounterInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f209943a;

    public d(Provider<e> provider) {
        this.f209943a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f209943a.get());
    }
}
