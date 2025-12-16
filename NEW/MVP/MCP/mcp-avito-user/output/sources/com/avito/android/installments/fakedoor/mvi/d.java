package com.avito.android.installments.fakedoor.mvi;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FakedoorBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.installments.fakedoor.f f172568a;

    /* renamed from: b, reason: collision with root package name */
    public final l f172569b;

    public d(com.avito.android.installments.fakedoor.f fVar, l lVar) {
        this.f172568a = fVar;
        this.f172569b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.installments.fakedoor.e) this.f172568a.get(), ((Boolean) this.f172569b.f393949a).booleanValue());
    }
}
