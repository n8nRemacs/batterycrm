package com.avito.android.contact_access.contact_access_service.domain;

import com.avito.android.remote.X;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IncompleteSocialInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<X> f125979a;

    public k(Provider<X> provider) {
        this.f125979a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f125979a.get());
    }
}
