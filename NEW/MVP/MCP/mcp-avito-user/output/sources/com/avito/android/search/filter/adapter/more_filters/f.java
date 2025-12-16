package com.avito.android.search.filter.adapter.more_filters;

import com.avito.android.search.filter.InterfaceC34581l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MoreFiltersItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f262533a;

    public f(Provider<InterfaceC34581l> provider) {
        this.f262533a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f262533a.get());
    }
}
