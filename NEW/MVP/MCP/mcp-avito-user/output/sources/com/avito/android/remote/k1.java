package com.avito.android.remote;

/* compiled from: SupportApi_Module_ProvideSupportApiFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes17.dex */
public final class k1 implements dagger.internal.h<i1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f253564a;

    public k1(dagger.internal.f fVar) {
        this.f253564a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f253564a.get();
        j1.f253562a.getClass();
        i1 i1Var = (i1) r02.create(i1.class);
        dagger.internal.t.d(i1Var);
        return i1Var;
    }
}
