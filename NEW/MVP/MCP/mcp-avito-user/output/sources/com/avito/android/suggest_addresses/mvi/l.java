package com.avito.android.suggest_addresses.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestAddressesActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f291948a;

    public l(dagger.internal.u uVar) {
        this.f291948a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.suggest_addresses.domain.a) this.f291948a.get());
    }
}
