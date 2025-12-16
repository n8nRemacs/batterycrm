package com.avito.android.user_adverts.expired_count.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserAdvertsInfoUpdateRunnerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f312139a;

    public i(dagger.internal.f fVar) {
        this.f312139a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.service.short_task.j) this.f312139a.get());
    }
}
