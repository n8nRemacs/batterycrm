package com.avito.android.publish.screen.step.select.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f242150a;

    /* renamed from: b, reason: collision with root package name */
    public final u f242151b;

    public f(d dVar, u uVar) {
        this.f242150a = dVar;
        this.f242151b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f242151b.get();
        this.f242150a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
