package com.avito.android.loyalty.ui.criteria.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CriteriaActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.loyalty.ui.criteria.c> f183537a;

    /* renamed from: b, reason: collision with root package name */
    public final u f183538b;

    public e(u uVar, Provider provider) {
        this.f183537a = provider;
        this.f183538b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f183537a.get(), (JW.a) this.f183538b.get());
    }
}
