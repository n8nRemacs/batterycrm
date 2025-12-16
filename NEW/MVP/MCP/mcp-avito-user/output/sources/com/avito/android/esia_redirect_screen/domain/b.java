package com.avito.android.esia_redirect_screen.domain;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EsiaRedirectScreenInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f148049a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<IF.a> f148050b;

    public b(Provider<com.avito.android.deep_linking.x> provider, Provider<IF.a> provider2) {
        this.f148049a = provider;
        this.f148050b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f148049a.get(), this.f148050b.get());
    }
}
