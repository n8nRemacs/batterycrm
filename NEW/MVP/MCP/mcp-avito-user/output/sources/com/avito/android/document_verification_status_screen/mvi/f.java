package com.avito.android.document_verification_status_screen.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationStatusActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f144850a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.document_verification_status_screen.domain.b f144851b;

    public f(Provider provider, com.avito.android.document_verification_status_screen.domain.b bVar) {
        this.f144850a = provider;
        this.f144851b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f144850a.get(), (com.avito.android.document_verification_status_screen.domain.a) this.f144851b.get());
    }
}
