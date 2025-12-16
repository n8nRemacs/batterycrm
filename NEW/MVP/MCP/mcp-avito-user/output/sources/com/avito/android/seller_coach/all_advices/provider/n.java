package com.avito.android.seller_coach.all_advices.provider;

/* compiled from: AllAdvicesModule_ProvideAdapterPresenter$_avito_seller_coach_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f267359a;

    public n(dagger.internal.u uVar) {
        this.f267359a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f267359a.get();
        m.f267358a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
