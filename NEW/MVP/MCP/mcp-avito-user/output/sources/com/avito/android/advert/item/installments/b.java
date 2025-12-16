package com.avito.android.advert.item.installments;

import aO.InterfaceC19795a;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InstallmentsBlockBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC19795a> f76575a;

    /* renamed from: b, reason: collision with root package name */
    public final u f76576b;

    public b(u uVar, Provider provider) {
        this.f76575a = provider;
        this.f76576b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f76575a.get(), (e) this.f76576b.get());
    }
}
