package com.avito.android.checkout.domain;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LoadCheckoutUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final i f118324a;

    public k(i iVar) {
        this.f118324a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((h) this.f118324a.get());
    }
}
