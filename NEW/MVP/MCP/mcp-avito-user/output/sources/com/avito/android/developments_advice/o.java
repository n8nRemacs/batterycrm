package com.avito.android.developments_advice;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DevelopmentsAdviceIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class o implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f136190a;

    public o(dagger.internal.l lVar) {
        this.f136190a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((Application) this.f136190a.f393949a);
    }
}
