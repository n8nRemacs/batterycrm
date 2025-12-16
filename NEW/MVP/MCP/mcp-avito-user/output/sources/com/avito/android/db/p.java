package com.avito.android.db;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SearchSubscriptionDaoImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final u f132732a;

    public p(u uVar) {
        this.f132732a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o((f) this.f132732a.get());
    }
}
