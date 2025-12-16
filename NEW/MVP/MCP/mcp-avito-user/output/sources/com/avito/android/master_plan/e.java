package com.avito.android.master_plan;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MasterPlanIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f186047a;

    public e(dagger.internal.l lVar) {
        this.f186047a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Application) this.f186047a.f393949a);
    }
}
