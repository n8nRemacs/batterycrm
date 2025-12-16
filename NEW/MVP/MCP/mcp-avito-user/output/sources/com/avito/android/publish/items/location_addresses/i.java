package com.avito.android.publish.items.location_addresses;

import com.avito.android.publish.C0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LocationAddressesItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f237012a;

    /* renamed from: b, reason: collision with root package name */
    public final u f237013b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f237014c;

    /* renamed from: d, reason: collision with root package name */
    public final u f237015d;

    public i(u uVar, u uVar2, u uVar3, Provider provider) {
        this.f237012a = uVar;
        this.f237013b = uVar2;
        this.f237014c = provider;
        this.f237015d = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((C0) this.f237012a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f237013b.get(), this.f237014c.get(), (InterfaceC33535v) this.f237015d.get());
    }
}
