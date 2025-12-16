package com.avito.android.checkout.domain;

import Zx.C19616a;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import so.InterfaceC48388a;

/* compiled from: FetchCheckoutUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48388a> f118315a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f118316b;

    /* renamed from: c, reason: collision with root package name */
    public final u f118317c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.checkout.data.c f118318d;

    public i(Provider provider, Provider provider2, u uVar, com.avito.android.checkout.data.c cVar) {
        this.f118315a = provider;
        this.f118316b = provider2;
        this.f118317c = uVar;
        this.f118318d = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC48388a interfaceC48388a = this.f118315a.get();
        R0 r02 = this.f118316b.get();
        C19616a c19616a = (C19616a) this.f118317c.get();
        this.f118318d.getClass();
        return new h(interfaceC48388a, r02, c19616a, new com.avito.android.checkout.data.a());
    }
}
