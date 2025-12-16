package com.avito.android.early_access.di;

import com.avito.android.early_access.o;
import com.avito.android.early_access.p;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EarlyAccessHandlerModule_ProvideEarlyAccessDialogFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final d f145312a;

    public f(d dVar) {
        this.f145312a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f145312a.getClass();
        return new p();
    }
}
