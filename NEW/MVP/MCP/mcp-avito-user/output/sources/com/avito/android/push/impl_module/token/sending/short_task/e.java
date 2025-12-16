package com.avito.android.push.impl_module.token.sending.short_task;

import com.avito.android.service.short_task.j;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SendPushTokenShortTaskSchedulerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f246083a;

    public e(dagger.internal.f fVar) {
        this.f246083a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((j) this.f246083a.get());
    }
}
