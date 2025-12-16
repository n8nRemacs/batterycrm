package com.avito.android.vas_planning_checkout.item.price;

import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: VasPlanPriceFormatterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Locale> f322982a;

    public i(Provider<Locale> provider) {
        this.f322982a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f322982a.get());
    }
}
