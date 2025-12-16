package com.avito.android.passport.profile_add.merge.accounts_profile_error.recycler;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PassportProfileErrorBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f212452a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f212453b;

    public b(u uVar, Provider provider) {
        this.f212452a = uVar;
        this.f212453b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f212452a.get(), this.f212453b.get());
    }
}
