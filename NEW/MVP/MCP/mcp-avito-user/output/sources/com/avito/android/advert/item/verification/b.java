package com.avito.android.advert.item.verification;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertVerificationBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f80665a;

    public b(u uVar) {
        this.f80665a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f80665a.get());
    }
}
