package com.avito.android.phone_reverification_info.mvi;

import com.avito.android.account.InterfaceC27663a;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneReverificationInfoActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f216150a;

    /* renamed from: b, reason: collision with root package name */
    public final A70.b f216151b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC27663a> f216152c;

    public c(Provider provider, A70.b bVar, Provider provider2) {
        this.f216150a = provider;
        this.f216151b = bVar;
        this.f216152c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f216150a.get(), (A70.a) this.f216151b.get(), this.f216152c.get());
    }
}
