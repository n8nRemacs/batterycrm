package com.avito.android.beduin.common.storage;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinPersistentParametersStorage_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final n f103483a;

    public g(n nVar) {
        this.f103483a = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((i) this.f103483a.get());
    }
}
