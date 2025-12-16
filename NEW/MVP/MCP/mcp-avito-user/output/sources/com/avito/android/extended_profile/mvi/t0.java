package com.avito.android.extended_profile.mvi;

/* compiled from: ExtendedProfileReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class t0 implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f150390a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f150391b;

    /* renamed from: c, reason: collision with root package name */
    public final I30.b f150392c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.extended_profile.di.B f150393d;

    public t0(dagger.internal.l lVar, dagger.internal.u uVar, I30.b bVar, com.avito.android.extended_profile.di.B b12) {
        this.f150390a = lVar;
        this.f150391b = uVar;
        this.f150392c = bVar;
        this.f150393d = b12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C((String) this.f150390a.f393949a, (com.avito.android.extended_profile.search.n) this.f150391b.get(), (I30.d) this.f150392c.get(), (Y41.a) this.f150393d.get());
    }
}
