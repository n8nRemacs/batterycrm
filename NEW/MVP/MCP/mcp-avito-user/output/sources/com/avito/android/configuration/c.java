package com.avito.android.configuration;

import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AppTypeFromBuildConfigProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f125480a;

    public c(l lVar) {
        this.f125480a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f125480a.f393949a);
    }
}
