package com.avito.android.str_insurance.items.flat_form;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Y1;

/* compiled from: StrInsuranceFlatFormPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f288577a;

    /* renamed from: b, reason: collision with root package name */
    public final u f288578b;

    public g(u uVar, Provider provider) {
        this.f288577a = provider;
        this.f288578b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f288577a.get(), (Y1) this.f288578b.get());
    }
}
