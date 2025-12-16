package com.avito.android.screens.bbip_v2.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import up0.C49093e;
import up0.InterfaceC49091c;

/* compiled from: BbipV2Actor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f261525a;

    /* renamed from: b, reason: collision with root package name */
    public final u f261526b;

    /* renamed from: c, reason: collision with root package name */
    public final C49093e f261527c;

    public d(dagger.internal.l lVar, u uVar, C49093e c49093e) {
        this.f261525a = lVar;
        this.f261526b = uVar;
        this.f261527c = c49093e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((String) this.f261525a.f393949a, (com.avito.android.screens.bbip_v2.domain.a) this.f261526b.get(), (InterfaceC49091c) this.f261527c.get());
    }
}
