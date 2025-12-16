package com.avito.android.category_items_tree.screens.items_screen;

import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: PriceFormatter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Locale> f117008a;

    public o(Provider<Locale> provider) {
        this.f117008a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f117008a.get());
    }
}
