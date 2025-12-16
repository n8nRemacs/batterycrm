package com.avito.android.rating_form.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.photo_list_view.N;
import com.avito.android.photo_list_view.O;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormModule_ProvideActionViewHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<N> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f248118a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f248119b;

    public i(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<InterfaceC28373a> provider2) {
        this.f248118a = provider;
        this.f248119b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f248118a.get();
        InterfaceC28373a interfaceC28373a = this.f248119b.get();
        h.f248117a.getClass();
        return new O(interfaceC28373a, aVar);
    }
}
