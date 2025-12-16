package com.avito.android.search.filter.adapter.chips;

import com.avito.android.search.filter.InterfaceC34581l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChipsMultiSelectItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f262170a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f262171b;

    public l(dagger.internal.u uVar, Provider provider) {
        this.f262170a = provider;
        this.f262171b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.deeplink_handler.handler.composite.a) this.f262171b.get(), this.f262170a.get());
    }
}
