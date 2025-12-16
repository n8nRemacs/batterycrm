package com.avito.android.suggest_addresses;

import com.avito.android.suggest_addresses.mvi.p;
import com.avito.android.suggest_addresses.mvi.q;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestAddressesViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final q f291892a;

    public i(q qVar) {
        this.f291892a = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((p) this.f291892a.get(), null, 2, null);
    }
}
