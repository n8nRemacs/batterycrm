package com.avito.android.advert_core.equipments.redesign.bottom_sheet;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EquipmentsDialogViewFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f83528a;

    /* renamed from: b, reason: collision with root package name */
    public final u f83529b;

    public n(u uVar, Provider provider) {
        this.f83528a = provider;
        this.f83529b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f83528a.get(), (com.avito.konveyor.adapter.h) this.f83529b.get());
    }
}
