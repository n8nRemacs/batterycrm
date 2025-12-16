package hs0;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalFilterModule_ProvideVerticalFilterSwitcherItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.switcher.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.vertical_main.p> f397439a;

    public j(Provider<com.avito.android.serp.adapter.vertical_main.p> provider) {
        this.f397439a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.vertical_main.p pVar = this.f397439a.get();
        C40977a c40977a = C40977a.f397427a;
        return new com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.switcher.e(pVar);
    }
}
