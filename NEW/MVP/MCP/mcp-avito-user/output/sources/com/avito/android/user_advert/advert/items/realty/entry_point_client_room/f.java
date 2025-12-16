package com.avito.android.user_advert.advert.items.realty.entry_point_client_room;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EntryPointToAccountOwnerItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f309911a;

    /* renamed from: b, reason: collision with root package name */
    public final u f309912b;

    public f(u uVar, Provider provider) {
        this.f309911a = provider;
        this.f309912b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f309911a.get(), (a) this.f309912b.get());
    }
}
