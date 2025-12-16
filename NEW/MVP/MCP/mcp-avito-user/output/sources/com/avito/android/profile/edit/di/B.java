package com.avito.android.profile.edit.di;

/* compiled from: EditProfileModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class B implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f222086a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f222087b;

    public B(dagger.internal.f fVar, dagger.internal.u uVar) {
        this.f222086a = fVar;
        this.f222087b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f222086a.get();
        com.avito.konveyor.a aVar2 = (com.avito.konveyor.a) this.f222087b.get();
        C33319d.f222158a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
