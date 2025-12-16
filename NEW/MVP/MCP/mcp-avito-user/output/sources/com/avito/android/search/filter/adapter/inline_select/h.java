package com.avito.android.search.filter.adapter.inline_select;

import com.avito.android.search.filter.InterfaceC34581l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InlineSelectItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f262403a;

    public h(Provider<InterfaceC34581l> provider) {
        this.f262403a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f262403a.get());
    }
}
