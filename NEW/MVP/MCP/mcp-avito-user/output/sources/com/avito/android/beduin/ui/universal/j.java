package com.avito.android.beduin.ui.universal;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalBeduinIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f104488a;

    public j(dagger.internal.l lVar) {
        this.f104488a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Application) this.f104488a.f393949a);
    }
}
