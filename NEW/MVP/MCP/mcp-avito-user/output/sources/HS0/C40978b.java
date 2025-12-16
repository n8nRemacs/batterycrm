package hs0;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalFilterModule_BindVerticalFilterCheckboxItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: hs0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40978b implements dagger.internal.h<com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.checkbox.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.vertical_main.p> f397428a;

    public C40978b(Provider<com.avito.android.serp.adapter.vertical_main.p> provider) {
        this.f397428a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.vertical_main.p pVar = this.f397428a.get();
        C40977a c40977a = C40977a.f397427a;
        return new com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.checkbox.e(pVar);
    }
}
