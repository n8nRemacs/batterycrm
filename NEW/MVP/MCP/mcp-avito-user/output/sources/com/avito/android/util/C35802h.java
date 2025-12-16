package com.avito.android.util;

import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertLongPriceFormatter_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.util.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35802h implements dagger.internal.h<C35794g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Locale> f318888a;

    public C35802h(Provider<Locale> provider) {
        this.f318888a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35794g(this.f318888a.get());
    }
}
