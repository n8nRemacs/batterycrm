package com.avito.android.app.task;

import com.avito.android.analytics.InterfaceC28373a;

/* compiled from: BaselineProfileStateReportingTask_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class r implements dagger.internal.h<BaselineProfileStateReportingTask> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f91708a;

    public r(dagger.internal.f fVar) {
        this.f91708a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new BaselineProfileStateReportingTask((InterfaceC28373a) this.f91708a.get());
    }
}
