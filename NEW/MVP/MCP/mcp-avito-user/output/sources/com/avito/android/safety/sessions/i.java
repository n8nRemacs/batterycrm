package com.avito.android.safety.sessions;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InternalSessionsIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f257942a;

    public i(dagger.internal.l lVar) {
        this.f257942a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h((Application) this.f257942a.f393949a);
    }
}
