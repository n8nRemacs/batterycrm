package com.avito.android.loyalty.ui.criteria_gray.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CriteriaGrayBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.loyalty.ui.criteria_gray.f> f183627a;

    /* renamed from: b, reason: collision with root package name */
    public final u f183628b;

    public g(u uVar, Provider provider) {
        this.f183627a = provider;
        this.f183628b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f183627a.get(), (JW.a) this.f183628b.get());
    }
}
