package com.avito.android.document_verification_status_screen.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerificationStatusBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.document_verification_status_screen.domain.b f144853a;

    public h(com.avito.android.document_verification_status_screen.domain.b bVar) {
        this.f144853a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.document_verification_status_screen.domain.a) this.f144853a.get());
    }
}
