package com.avito.android.validation;

/* compiled from: ParametersValidatorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class f1 implements dagger.internal.h<e1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f319372a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f319373b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f319374c;

    public f1(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3) {
        this.f319372a = uVar;
        this.f319373b = uVar2;
        this.f319374c = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e1((g1) this.f319372a.get(), (hJ.i) this.f319373b.get(), (hJ.e) this.f319374c.get());
    }
}
