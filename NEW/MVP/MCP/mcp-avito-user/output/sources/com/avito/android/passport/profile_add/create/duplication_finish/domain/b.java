package com.avito.android.passport.profile_add.create.duplication_finish.domain;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BusinessVerificationDuplicationFinishInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<I50.a> f211295a;

    public b(Provider<I50.a> provider) {
        this.f211295a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f211295a.get());
    }
}
