package com.avito.android.user_advert.advert.items.multiaddresses;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MultiAddressItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f309727a;

    public c(u uVar) {
        this.f309727a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f309727a.get());
    }
}
