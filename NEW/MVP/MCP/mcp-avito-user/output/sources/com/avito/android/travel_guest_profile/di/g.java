package com.avito.android.travel_guest_profile.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TravelGuestProfileRecyclerModule_ProvideAdapterPresenter$_avito_travel_guest_profile_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f301924a;

    /* renamed from: b, reason: collision with root package name */
    public final u f301925b;

    public g(f fVar, u uVar) {
        this.f301924a = fVar;
        this.f301925b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f301925b.get();
        this.f301924a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
