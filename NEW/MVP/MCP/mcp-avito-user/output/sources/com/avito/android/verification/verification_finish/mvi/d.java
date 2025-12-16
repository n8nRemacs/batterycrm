package com.avito.android.verification.verification_finish.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FinishActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f325279a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.verification.verification_finish.m f325280b;

    public d(Provider provider, com.avito.android.verification.verification_finish.m mVar) {
        this.f325279a = provider;
        this.f325280b = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f325279a.get(), (com.avito.android.verification.verification_finish.i) this.f325280b.get());
    }
}
