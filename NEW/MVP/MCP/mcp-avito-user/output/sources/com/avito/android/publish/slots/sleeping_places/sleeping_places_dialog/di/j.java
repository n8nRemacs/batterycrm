package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vf0.C49321b;

/* compiled from: SleepingPlacesSelectorModule_ProvideBedTypeListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final f f244986a;

    /* renamed from: b, reason: collision with root package name */
    public final u f244987b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f244988c;

    public j(f fVar, u uVar, Provider provider) {
        this.f244986a = fVar;
        this.f244987b = uVar;
        this.f244988c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f244987b.get();
        com.avito.konveyor.a aVar2 = this.f244988c.get();
        this.f244986a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, new C49321b());
    }
}
