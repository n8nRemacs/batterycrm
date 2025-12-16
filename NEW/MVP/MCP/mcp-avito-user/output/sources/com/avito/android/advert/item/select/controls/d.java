package com.avito.android.advert.item.select.controls;

import Hr.InterfaceC14024a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoSelectControlsPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f79401a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f79402b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC14024a> f79403c;

    public d(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f79401a = lVar;
        this.f79402b = provider;
        this.f79403c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((String) this.f79401a.f393949a, this.f79402b.get(), this.f79403c.get());
    }
}
