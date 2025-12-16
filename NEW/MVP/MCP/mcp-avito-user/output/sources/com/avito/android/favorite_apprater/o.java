package com.avito.android.favorite_apprater;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PrefFavoriteAppRaterStorage_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final u f155283a;

    public o(u uVar) {
        this.f155283a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((AK0.l) this.f155283a.get());
    }
}
