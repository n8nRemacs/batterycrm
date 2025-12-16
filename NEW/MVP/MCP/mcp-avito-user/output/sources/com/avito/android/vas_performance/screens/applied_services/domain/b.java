package com.avito.android.vas_performance.screens.applied_services.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zL0.InterfaceC50482a;

/* compiled from: GetAppliedServicesUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f320259a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC50482a> f320260b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f320261c;

    public b(l lVar, Provider provider, Provider provider2) {
        this.f320259a = lVar;
        this.f320260b = provider;
        this.f320261c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f320261c.get(), (String) this.f320259a.f393949a, this.f320260b.get());
    }
}
