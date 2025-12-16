package com.avito.android.advert_core.equipments.redesign.bottom_sheet;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import x9.InterfaceC49794a;

/* compiled from: EquipmentsDialogPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f83523a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49794a> f83524b;

    /* renamed from: c, reason: collision with root package name */
    public final u f83525c;

    public k(u uVar, u uVar2, Provider provider) {
        this.f83523a = uVar;
        this.f83524b = provider;
        this.f83525c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((d) this.f83523a.get(), this.f83524b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f83525c.get());
    }
}
