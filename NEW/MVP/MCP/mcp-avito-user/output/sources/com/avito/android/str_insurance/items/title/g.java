package com.avito.android.str_insurance.items.title;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrInsuranceTitlePresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f288608a;

    public g(Provider<com.avito.android.util.text.a> provider) {
        this.f288608a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f288608a.get());
    }
}
