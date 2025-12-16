package com.avito.android.publish.price_list;

import androidx.fragment.app.FragmentManager;
import javax.inject.Provider;

/* compiled from: SelectPriceListRouterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<FragmentManager> f238932a;

    public v(Provider<FragmentManager> provider) {
        this.f238932a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u(this.f238932a.get());
    }
}
