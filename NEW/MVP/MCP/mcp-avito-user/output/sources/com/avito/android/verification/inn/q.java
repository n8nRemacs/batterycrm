package com.avito.android.verification.inn;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationInnListItemConverter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.inn.validation.c f324126a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<vM0.f> f324127b;

    public q(com.avito.android.verification.inn.validation.c cVar, Provider provider) {
        this.f324126a = cVar;
        this.f324127b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f324126a.getClass();
        return new p(new com.avito.android.verification.inn.validation.b(), this.f324127b.get());
    }
}
