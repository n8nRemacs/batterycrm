package com.avito.android.search.filter.adapter.double_select;

import com.avito.android.search.filter.InterfaceC34581l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DoubleSelectItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f262289a;

    public n(Provider<InterfaceC34581l> provider) {
        this.f262289a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f262289a.get());
    }
}
