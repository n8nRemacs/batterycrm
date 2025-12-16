package com.avito.android.advert.item.leasing_calculator.formatters;

import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertLeasingPriceFormatterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Locale> f77390a;

    public m(Provider<Locale> provider) {
        this.f77390a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f77390a.get());
    }
}
