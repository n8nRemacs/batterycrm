package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SleepingPlacesSelectorModule_ProvideBedTypeAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f244982a;

    /* renamed from: b, reason: collision with root package name */
    public final u f244983b;

    public h(f fVar, u uVar) {
        this.f244982a = fVar;
        this.f244983b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f244983b.get();
        this.f244982a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
