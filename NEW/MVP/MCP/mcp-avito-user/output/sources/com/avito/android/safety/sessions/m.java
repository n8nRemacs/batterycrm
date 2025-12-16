package com.avito.android.safety.sessions;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SessionsIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f257993a;

    public m(dagger.internal.l lVar) {
        this.f257993a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((Application) this.f257993a.f393949a);
    }
}
