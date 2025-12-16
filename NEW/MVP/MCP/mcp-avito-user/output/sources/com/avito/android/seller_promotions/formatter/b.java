package com.avito.android.seller_promotions.formatter;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: PriceFormatter_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Locale> f267755a;

    public b(Provider<Locale> provider) {
        this.f267755a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f267755a.get());
    }
}
