package com.avito.android.di.module;

import com.avito.android.permissions.C33035e;
import com.avito.android.permissions.InterfaceC33034d;
import javax.inject.Provider;

/* compiled from: DefaultSearchLocationModule_ProvideLocationPermissionDialogPresenter$_avito_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class C4 implements dagger.internal.h<InterfaceC33034d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.permissions.q> f143871a;

    public C4(Provider<com.avito.android.permissions.q> provider) {
        this.f143871a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.permissions.q qVar = this.f143871a.get();
        int i12 = C30245y4.f144719a;
        return new C33035e(qVar);
    }
}
