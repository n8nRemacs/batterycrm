package com.avito.android.publish;

import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.validation.InterfaceC35998b;
import com.avito.android.validation.c1;
import javax.inject.Provider;

/* compiled from: FeesParamsViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.x, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34151x implements dagger.internal.h<C34149w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.remote.H0> f245785a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f245786b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<CategoryParametersConverter> f245787c;

    /* renamed from: d, reason: collision with root package name */
    public final c1 f245788d;

    public C34151x(Provider provider, Provider provider2, Provider provider3, c1 c1Var) {
        this.f245785a = provider;
        this.f245786b = provider2;
        this.f245787c = provider3;
        this.f245788d = c1Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C34149w(this.f245785a.get(), this.f245786b.get(), this.f245787c.get(), (InterfaceC35998b) this.f245788d.get());
    }
}
