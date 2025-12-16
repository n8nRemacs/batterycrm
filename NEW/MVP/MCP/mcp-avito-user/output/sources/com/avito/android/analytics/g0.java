package com.avito.android.analytics;

import yc.C50213a;

/* compiled from: PublishValidationLogger_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class g0 implements dagger.internal.h<f0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f90177a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f90178b;

    public g0(dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f90177a = uVar;
        this.f90178b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f0((InterfaceC28373a) this.f90177a.get(), (C50213a) this.f90178b.get());
    }
}
