package com.avito.android.search.filter.adapter.switcher;

import com.avito.android.search.filter.InterfaceC34581l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SwitcherItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f262612a;

    public g(Provider<InterfaceC34581l> provider) {
        this.f262612a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f262612a.get());
    }
}
