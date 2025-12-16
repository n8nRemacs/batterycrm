package com.avito.android.universal_transaction.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TransactionBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.universal_transaction.mvi.domain.b f306450a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f306451b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f306452c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f306453d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f306454e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f306455f;

    public l(com.avito.android.universal_transaction.mvi.domain.b bVar, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, dagger.internal.l lVar5) {
        this.f306450a = bVar;
        this.f306451b = lVar;
        this.f306452c = lVar2;
        this.f306453d = lVar3;
        this.f306454e = lVar4;
        this.f306455f = lVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.universal_transaction.mvi.domain.a) this.f306450a.get(), (String) this.f306451b.f393949a, (String) this.f306452c.f393949a, (String) this.f306453d.f393949a, (String) this.f306454e.f393949a, (String) this.f306455f.f393949a);
    }
}
