package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task;

import com.avito.android.service.short_task.j;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacLogSendingShortTaskSchedulerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f168036a;

    public e(dagger.internal.f fVar) {
        this.f168036a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((j) this.f168036a.get());
    }
}
