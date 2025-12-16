package com.avito.android.search.filter.adapter.entry_point;

import com.avito.android.features.auto.ab_tests.configs.AutoGlowFiltersTestGroup;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EntryPointItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f262308a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<u3.g<AutoGlowFiltersTestGroup>> f262309b;

    public g(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<u3.g<AutoGlowFiltersTestGroup>> provider2) {
        this.f262308a = provider;
        this.f262309b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f262308a.get(), this.f262309b.get());
    }
}
