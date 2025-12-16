package com.avito.android.rating.user_contacts.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserContactsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<n> f247832a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f247833b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f247834c;

    public j(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f247832a = provider;
        this.f247833b = provider2;
        this.f247834c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f247832a.get(), this.f247833b.get(), ((Boolean) this.f247834c.f393949a).booleanValue());
    }
}
