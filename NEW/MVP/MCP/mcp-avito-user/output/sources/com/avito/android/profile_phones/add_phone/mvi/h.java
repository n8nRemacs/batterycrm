package com.avito.android.profile_phones.add_phone.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AddPhoneBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f226928a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.profile_phones.add_phone.n> f226929b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f226930c;

    public h(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f226928a = provider;
        this.f226929b = provider2;
        this.f226930c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f226928a.get(), this.f226929b.get(), (String) this.f226930c.f393949a);
    }
}
