package com.avito.android.advert.item.beduin;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import fa.InterfaceC40383a;
import javax.inject.Provider;

/* compiled from: AdvertDetailsBeduinInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40383a> f73223a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f73224b;

    public c(Provider<InterfaceC40383a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f73223a = provider;
        this.f73224b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f73223a.get(), this.f73224b.get());
    }
}
