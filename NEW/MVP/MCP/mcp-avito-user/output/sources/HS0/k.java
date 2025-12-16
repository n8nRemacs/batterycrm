package hs0;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalFilterModule_ProvideVerticalSearchFilterGeoControlItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.geo_control.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.vertical_main.p> f397440a;

    public k(Provider<com.avito.android.serp.adapter.vertical_main.p> provider) {
        this.f397440a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.vertical_main.p pVar = this.f397440a.get();
        C40977a c40977a = C40977a.f397427a;
        return new com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.geo_control.e(pVar);
    }
}
