package hs0;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalFilterModule_BindVerticalSearchFilterItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.vertical_main.p> f397430a;

    public d(Provider<com.avito.android.serp.adapter.vertical_main.p> provider) {
        this.f397430a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.vertical_main.p pVar = this.f397430a.get();
        C40977a c40977a = C40977a.f397427a;
        return new com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.i(pVar);
    }
}
