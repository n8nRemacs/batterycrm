package com.avito.android.authorization.confirm_3fa;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConfirmEmailListModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final h f93585a;

    /* renamed from: b, reason: collision with root package name */
    public final u f93586b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f93587c;

    public i(h hVar, u uVar, Provider provider) {
        this.f93585a = hVar;
        this.f93586b = uVar;
        this.f93587c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f93586b.get();
        com.avito.konveyor.a aVar2 = this.f93587c.get();
        this.f93585a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
