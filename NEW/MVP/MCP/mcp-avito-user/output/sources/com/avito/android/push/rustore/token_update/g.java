package com.avito.android.push.rustore.token_update;

import com.avito.android.P;
import com.avito.android.S;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import hg0.InterfaceC40932a;
import javax.inject.Provider;
import lg0.InterfaceC43768b;

/* compiled from: RuStorePushTokenUpdateCheckerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43768b> f246124a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f246125b;

    /* renamed from: c, reason: collision with root package name */
    public final S f246126c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.push.impl_module.features.b f246127d;

    /* renamed from: e, reason: collision with root package name */
    public final u f246128e;

    public g(Provider provider, Provider provider2, S s5, com.avito.android.push.impl_module.features.b bVar, u uVar) {
        this.f246124a = provider;
        this.f246125b = provider2;
        this.f246126c = s5;
        this.f246127d = bVar;
        this.f246128e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC43768b interfaceC43768b = this.f246124a.get();
        com.avito.android.server_time.f fVar = this.f246125b.get();
        P p12 = (P) this.f246126c.get();
        this.f246127d.get();
        return new f(interfaceC43768b, fVar, p12, (InterfaceC40932a) this.f246128e.get());
    }
}
