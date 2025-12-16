package com.avito.android.mortgage.pre_approval.result.mvi.domain;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetScoreInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IZ.a> f202115a;

    /* renamed from: b, reason: collision with root package name */
    public final u f202116b;

    public e(u uVar, Provider provider) {
        this.f202115a = provider;
        this.f202116b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(dagger.internal.g.b(this.f202115a), (f) this.f202116b.get());
    }
}
