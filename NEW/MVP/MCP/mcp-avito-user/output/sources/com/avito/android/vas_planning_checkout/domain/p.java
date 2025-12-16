package com.avito.android.vas_planning_checkout.domain;

import com.avito.android.J0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasPlanResultConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J0> f322894a;

    public p(Provider<J0> provider) {
        this.f322894a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f322894a.get());
    }
}
