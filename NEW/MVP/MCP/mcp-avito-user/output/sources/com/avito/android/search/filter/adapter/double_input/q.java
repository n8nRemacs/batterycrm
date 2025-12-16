package com.avito.android.search.filter.adapter.double_input;

import com.avito.android.search.filter.InterfaceC34581l;
import javax.inject.Provider;

/* compiled from: DoubleInputItemPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f262242a;

    public q(Provider<InterfaceC34581l> provider) {
        this.f262242a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f262242a.get());
    }
}
