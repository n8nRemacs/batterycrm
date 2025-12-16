package com.avito.android.passport.profile_add.create.business_vrf_duplication.domain;

import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BusinessVrfDuplicationProfileCreationInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<I50.a> f211236a;

    public c(Provider<I50.a> provider) {
        this.f211236a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(g.a(w.a(this.f211236a)));
    }
}
