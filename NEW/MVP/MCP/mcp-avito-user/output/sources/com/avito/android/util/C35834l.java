package com.avito.android.util;

import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertOldPriceFormatter_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.util.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35834l implements dagger.internal.h<C35826k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Locale> f318921a;

    public C35834l(Provider<Locale> provider) {
        this.f318921a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35826k(this.f318921a.get());
    }
}
