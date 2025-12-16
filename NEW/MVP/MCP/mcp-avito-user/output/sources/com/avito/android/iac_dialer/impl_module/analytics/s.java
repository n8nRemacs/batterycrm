package com.avito.android.iac_dialer.impl_module.analytics;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TabletDetectorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f165700a;

    public s(dagger.internal.l lVar) {
        this.f165700a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new r((Application) this.f165700a.f393949a);
    }
}
