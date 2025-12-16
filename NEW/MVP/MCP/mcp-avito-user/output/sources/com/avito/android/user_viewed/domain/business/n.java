package com.avito.android.user_viewed.domain.business;

import dagger.internal.x;
import dagger.internal.y;
import iK0.InterfaceC41310a;
import javax.inject.Provider;

/* compiled from: UserViewedRemoteInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41310a> f318358a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.user_viewed.domain.mapper.i f318359b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.user_viewed.domain.mapper.c f318360c;

    public n(Provider provider, com.avito.android.user_viewed.domain.mapper.i iVar, com.avito.android.user_viewed.domain.mapper.c cVar) {
        this.f318358a = provider;
        this.f318359b = iVar;
        this.f318360c = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC41310a interfaceC41310a = this.f318358a.get();
        this.f318359b.getClass();
        return new m(interfaceC41310a, new com.avito.android.user_viewed.domain.mapper.h(), (com.avito.android.user_viewed.domain.mapper.a) this.f318360c.get());
    }
}
