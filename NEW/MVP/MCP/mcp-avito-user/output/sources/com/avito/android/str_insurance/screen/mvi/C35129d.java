package com.avito.android.str_insurance.screen.mvi;

import com.avito.android.str_insurance.InsuranceData;
import javax.inject.Provider;

/* compiled from: StrInsuranceBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.str_insurance.screen.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35129d implements dagger.internal.h<C35128c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InsuranceData> f288731a;

    public C35129d(Provider<InsuranceData> provider) {
        this.f288731a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35128c(this.f288731a.get());
    }
}
