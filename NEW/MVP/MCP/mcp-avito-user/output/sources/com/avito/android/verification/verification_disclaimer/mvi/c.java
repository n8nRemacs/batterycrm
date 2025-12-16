package com.avito.android.verification.verification_disclaimer.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DisclaimerActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f325086a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.verification.verification_disclaimer.h f325087b;

    public c(com.avito.android.verification.verification_disclaimer.h hVar, Provider provider) {
        this.f325086a = provider;
        this.f325087b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f325086a.get(), (com.avito.android.verification.verification_disclaimer.g) this.f325087b.get());
    }
}
