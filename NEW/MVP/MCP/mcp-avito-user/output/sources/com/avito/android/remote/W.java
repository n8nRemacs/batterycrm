package com.avito.android.remote;

/* compiled from: FlowerApi_Module_ProvideFlowerApiFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes17.dex */
public final class W implements dagger.internal.h<U> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f253057a;

    public W(dagger.internal.f fVar) {
        this.f253057a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f253057a.get();
        V.f253056a.getClass();
        U u12 = (U) r02.create(U.class);
        dagger.internal.t.d(u12);
        return u12;
    }
}
