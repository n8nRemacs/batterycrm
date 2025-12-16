package com.avito.android.tariff_select.ui.items.header;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffSelectHeaderItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f301258a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f301259b;

    public c(u uVar, Provider provider) {
        this.f301258a = uVar;
        this.f301259b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f301258a.get(), this.f301259b.get());
    }
}
