package com.avito.android.code_check.phone_list;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneListModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final i f118979a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f118980b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f118981c;

    public j(i iVar, dagger.internal.u uVar, Provider provider) {
        this.f118979a = iVar;
        this.f118980b = uVar;
        this.f118981c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f118980b.get();
        com.avito.konveyor.a aVar2 = this.f118981c.get();
        this.f118979a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
