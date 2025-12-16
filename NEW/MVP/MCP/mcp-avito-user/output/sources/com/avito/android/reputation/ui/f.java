package com.avito.android.reputation.ui;

import Im0.InterfaceC14131a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReputationInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14131a> f254811a;

    /* renamed from: b, reason: collision with root package name */
    public final l f254812b;

    public f(l lVar, Provider provider) {
        this.f254811a = provider;
        this.f254812b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f254811a.get(), (ReputationArgs) this.f254812b.f393949a);
    }
}
