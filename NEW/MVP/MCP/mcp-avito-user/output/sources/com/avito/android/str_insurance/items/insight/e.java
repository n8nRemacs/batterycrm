package com.avito.android.str_insurance.items.insight;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrInsuranceInsightPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f288595a;

    public e(Provider<com.avito.android.util.text.a> provider) {
        this.f288595a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f288595a.get());
    }
}
