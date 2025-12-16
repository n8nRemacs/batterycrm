package com.avito.android.verification.inn;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InnListPresenterWatcher_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f323892a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<b> f323893b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f323894c;

    public j(u uVar, Provider provider, Provider provider2) {
        this.f323892a = uVar;
        this.f323893b = provider;
        this.f323894c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.konveyor.adapter.j) this.f323892a.get(), this.f323893b.get(), this.f323894c.get());
    }
}
