package com.avito.android.advertising.adapter.items.avito;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ob.InterfaceC44740d;

/* compiled from: AvitoNetworkImageBigBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f87005a;

    /* renamed from: b, reason: collision with root package name */
    public final l f87006b;

    public b(l lVar, Provider provider) {
        this.f87005a = provider;
        this.f87006b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f87005a.get(), (InterfaceC44740d) this.f87006b.f393949a);
    }
}
