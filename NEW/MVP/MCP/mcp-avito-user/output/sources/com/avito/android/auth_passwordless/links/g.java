package com.avito.android.auth_passwordless.links;

import com.avito.android.account.InterfaceC27663a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AuthPasswordlessDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f92640a;

    /* renamed from: b, reason: collision with root package name */
    public final d f92641b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC27663a> f92642c;

    public g(dagger.internal.f fVar, d dVar, Provider provider) {
        this.f92640a = fVar;
        this.f92641b = dVar;
        this.f92642c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f92640a.get();
        this.f92641b.getClass();
        return new e(aVar, new b(), this.f92642c.get());
    }
}
