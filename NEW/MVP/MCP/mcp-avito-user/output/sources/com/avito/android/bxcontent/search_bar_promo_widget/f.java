package com.avito.android.bxcontent.search_bar_promo_widget;

import com.avito.android.C36135w2;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchPromoHeaderWidgetPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.bxcontent.analytics.a> f112877a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C36135w2> f112878b;

    public f(Provider<com.avito.android.bxcontent.analytics.a> provider, Provider<C36135w2> provider2) {
        this.f112877a = provider;
        this.f112878b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f112877a.get(), this.f112878b.get());
    }
}
