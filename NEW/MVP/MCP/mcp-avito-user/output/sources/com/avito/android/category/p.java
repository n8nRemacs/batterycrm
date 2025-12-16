package com.avito.android.category;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CategoryIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class p implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f116722a;

    public p(dagger.internal.l lVar) {
        this.f116722a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n((Application) this.f116722a.f393949a);
    }
}
