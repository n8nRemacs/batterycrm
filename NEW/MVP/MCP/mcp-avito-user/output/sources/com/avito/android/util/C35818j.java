package com.avito.android.util;

import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertNormalizedPriceFormatter_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.util.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35818j implements dagger.internal.h<C35810i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Locale> f318905a;

    public C35818j(Provider<Locale> provider) {
        this.f318905a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35810i(this.f318905a.get());
    }
}
