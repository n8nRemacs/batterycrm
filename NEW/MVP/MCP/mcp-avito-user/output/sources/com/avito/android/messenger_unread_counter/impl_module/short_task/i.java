package com.avito.android.messenger_unread_counter.impl_module.short_task;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UpdateUnreadMessagesSchedulerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f197748a;

    public i(dagger.internal.f fVar) {
        this.f197748a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.service.short_task.j) this.f197748a.get());
    }
}
