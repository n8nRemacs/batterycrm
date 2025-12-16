package com.avito.android.loyalty.ui.criteria_gray.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CriteriaGrayActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.loyalty.ui.criteria_gray.f> f183616a;

    /* renamed from: b, reason: collision with root package name */
    public final u f183617b;

    public e(u uVar, Provider provider) {
        this.f183616a = provider;
        this.f183617b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f183616a.get(), (JW.a) this.f183617b.get());
    }
}
