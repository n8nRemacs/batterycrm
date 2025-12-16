package com.avito.android.verification.verification_status_list.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StatusListBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f325809a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.verification.verification_status_list.h f325810b;

    public h(Provider provider, com.avito.android.verification.verification_status_list.h hVar) {
        this.f325809a = provider;
        this.f325810b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f325809a.get(), (com.avito.android.verification.verification_status_list.g) this.f325810b.get());
    }
}
