package com.avito.android.bundles.vas_union.di;

/* compiled from: VasUnionModule_ProvideBundleBenefitAdapterPresenter$_avito_vas_bundles_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class r implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final q f108544a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f108545b;

    public r(q qVar, dagger.internal.u uVar) {
        this.f108544a = qVar;
        this.f108545b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f108545b.get();
        this.f108544a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
