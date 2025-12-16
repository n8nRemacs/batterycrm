package com.avito.android.search.filter.adapter.chips;

import com.avito.android.search.filter.InterfaceC34581l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChipsSingleSelectItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f262184a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f262185b;

    public u(dagger.internal.u uVar, Provider provider) {
        this.f262184a = provider;
        this.f262185b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t((com.avito.android.deeplink_handler.handler.composite.a) this.f262185b.get(), this.f262184a.get());
    }
}
