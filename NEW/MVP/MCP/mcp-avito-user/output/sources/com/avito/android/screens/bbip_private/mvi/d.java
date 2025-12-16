package com.avito.android.screens.bbip_private.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BbipPrivateActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f260581a;

    /* renamed from: b, reason: collision with root package name */
    public final u f260582b;

    /* renamed from: c, reason: collision with root package name */
    public final qp0.e f260583c;

    public d(dagger.internal.l lVar, u uVar, qp0.e eVar) {
        this.f260581a = lVar;
        this.f260582b = uVar;
        this.f260583c = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((String) this.f260581a.f393949a, (com.avito.android.screens.bbip_private.domain.a) this.f260582b.get(), (qp0.c) this.f260583c.get());
    }
}
