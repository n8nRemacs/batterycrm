package com.avito.android.screens.bbip_private.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BbipPrivateBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f260608a;

    /* renamed from: b, reason: collision with root package name */
    public final u f260609b;

    public f(dagger.internal.l lVar, u uVar) {
        this.f260608a = lVar;
        this.f260609b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((String) this.f260608a.f393949a, (com.avito.android.screens.bbip_private.domain.a) this.f260609b.get());
    }
}
