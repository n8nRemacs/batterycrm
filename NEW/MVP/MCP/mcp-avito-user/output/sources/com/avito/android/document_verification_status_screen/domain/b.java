package com.avito.android.document_verification_status_screen.domain;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationStatusInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f144827a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<EF.a> f144828b;

    public b(Provider<com.avito.android.deep_linking.x> provider, Provider<EF.a> provider2) {
        this.f144827a = provider;
        this.f144828b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f144827a.get(), this.f144828b.get());
    }
}
