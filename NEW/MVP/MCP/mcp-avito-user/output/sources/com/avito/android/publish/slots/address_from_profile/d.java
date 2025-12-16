package com.avito.android.publish.slots.address_from_profile;

import android.content.Context;

/* compiled from: AddressFromProfileResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<C34119c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f242832a;

    public d(dagger.internal.u uVar) {
        this.f242832a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C34119c((Context) this.f242832a.get());
    }
}
