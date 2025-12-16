package com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single;

import com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SingleCheckBoxItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f299545a;

    public f(Provider<l> provider) {
        this.f299545a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f299545a.get());
    }
}
