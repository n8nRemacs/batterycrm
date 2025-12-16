package com.avito.android.messenger.service;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OpenErrorTrackerSchedulerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f197299a;

    public r(dagger.internal.u uVar) {
        this.f197299a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q((com.avito.android.service.short_task.j) this.f197299a.get());
    }
}
