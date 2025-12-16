package com.avito.android.guests_selector.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GuestsSelectorKonveyorModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f161429a;

    public f(u uVar) {
        this.f161429a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f161429a.get();
        e.f161428a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
