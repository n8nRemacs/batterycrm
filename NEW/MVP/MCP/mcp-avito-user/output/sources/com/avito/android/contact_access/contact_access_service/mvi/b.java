package com.avito.android.contact_access.contact_access_service.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContactAccessServiceActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f125982a;

    /* renamed from: b, reason: collision with root package name */
    public final u f125983b;

    public b(u uVar, Provider provider) {
        this.f125982a = provider;
        this.f125983b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f125982a.get(), (com.avito.android.contact_access.contact_access_service.domain.a) this.f125983b.get());
    }
}
