package com.avito.android.multigeo_flow.deeplink;

import android.app.Application;

/* compiled from: JobMultiGeoIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class F implements dagger.internal.h<E> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f206815a;

    public F(dagger.internal.l lVar) {
        this.f206815a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new E((Application) this.f206815a.f393949a);
    }
}
