package com.avito.android.profile.user_profile.di;

/* compiled from: UserProfileModule_ProvideAdapterPresenter$_avito_profile_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f226097a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f226098b;

    public i(f fVar, dagger.internal.u uVar) {
        this.f226097a = fVar;
        this.f226098b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f226098b.get();
        this.f226097a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
