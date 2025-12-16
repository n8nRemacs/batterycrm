package com.avito.android.app.task;

import com.avito.android.analytics.InterfaceC28373a;

/* compiled from: SendStartupTimeTask_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class S1 implements dagger.internal.h<R1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f91518a;

    public S1(dagger.internal.f fVar) {
        this.f91518a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new R1((InterfaceC28373a) this.f91518a.get());
    }
}
