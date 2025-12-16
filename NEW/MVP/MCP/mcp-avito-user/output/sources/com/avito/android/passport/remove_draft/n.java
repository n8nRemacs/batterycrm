package com.avito.android.passport.remove_draft;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PassportRemoveDraftProfileInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<I50.a> f213912a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.passport_lib.h> f213913b;

    public n(Provider<I50.a> provider, Provider<com.avito.android.passport_lib.h> provider2) {
        this.f213912a = provider;
        this.f213913b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(dagger.internal.g.b(this.f213912a), this.f213913b.get());
    }
}
