package com.avito.android.suggest_addresses.mvi;

import com.avito.android.suggest_addresses.entity.SuggestAddressesParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestAddressesBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f291950a;

    public n(dagger.internal.l lVar) {
        this.f291950a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((SuggestAddressesParams) this.f291950a.f393949a);
    }
}
