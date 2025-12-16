package com.avito.android.advert_core.auto_select_parameters_v2;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoSelectParametersV2Blueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f82980a;

    /* renamed from: b, reason: collision with root package name */
    public final u f82981b;

    public b(u uVar, Provider provider) {
        this.f82980a = provider;
        this.f82981b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f82980a.get(), (com.avito.konveyor.a) this.f82981b.get());
    }
}
