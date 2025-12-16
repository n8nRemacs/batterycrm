package com.avito.android.str_insurance.screen.mvi;

import com.avito.android.remote.d1;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: StrInsuranceInteractor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class s implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d1> f288780a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f288781b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f288782c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f288783d;

    public s(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f288780a = provider;
        this.f288781b = provider2;
        this.f288782c = provider3;
        this.f288783d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f288780a.get(), this.f288781b.get(), this.f288782c.get(), (e) this.f288783d.get());
    }
}
