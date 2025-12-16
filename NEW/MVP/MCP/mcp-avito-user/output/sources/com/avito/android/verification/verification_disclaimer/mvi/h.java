package com.avito.android.verification.verification_disclaimer.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DisclaimerBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.verification_disclaimer.h f325109a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f325110b;

    public h(com.avito.android.verification.verification_disclaimer.h hVar, Provider provider) {
        this.f325109a = hVar;
        this.f325110b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f325110b.get(), (com.avito.android.verification.verification_disclaimer.g) this.f325109a.get());
    }
}
