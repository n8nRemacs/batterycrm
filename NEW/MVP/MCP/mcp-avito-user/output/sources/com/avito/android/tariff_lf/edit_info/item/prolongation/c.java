package com.avito.android.tariff_lf.edit_info.item.prolongation;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffProlongationItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f299046a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f299047b;

    public c(u uVar, Provider provider) {
        this.f299046a = uVar;
        this.f299047b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f299046a.get(), this.f299047b.get());
    }
}
