package com.avito.android.search.filter.adapter.switcher_with_hint;

import com.avito.android.search.filter.InterfaceC34581l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SwitcherWithHintItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f262626a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f262627b;

    public h(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<InterfaceC34581l> provider2) {
        this.f262626a = provider;
        this.f262627b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f262626a.get(), this.f262627b.get());
    }
}
