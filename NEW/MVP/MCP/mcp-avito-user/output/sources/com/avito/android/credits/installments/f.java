package com.avito.android.credits.installments;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InstallmentsStickyBlockManagerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final c f128874a;

    public f(c cVar) {
        this.f128874a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f128874a.getClass();
        return new e(new b());
    }
}
