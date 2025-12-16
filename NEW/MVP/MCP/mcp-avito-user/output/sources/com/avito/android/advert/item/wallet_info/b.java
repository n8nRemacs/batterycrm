package com.avito.android.advert.item.wallet_info;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletInfoBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f80725a;

    public b(u uVar) {
        this.f80725a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f80725a.get());
    }
}
