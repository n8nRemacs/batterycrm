package com.avito.android.verification.verification_status_list.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StatusListActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f325792a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.verification.verification_status_list.h f325793b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f325794c;

    public d(Provider provider, com.avito.android.verification.verification_status_list.h hVar, Provider provider2) {
        this.f325792a = provider;
        this.f325793b = hVar;
        this.f325794c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f325792a.get(), (com.avito.android.verification.verification_status_list.g) this.f325793b.get(), this.f325794c.get());
    }
}
