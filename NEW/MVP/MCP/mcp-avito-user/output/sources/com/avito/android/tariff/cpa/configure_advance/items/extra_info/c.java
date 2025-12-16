package com.avito.android.tariff.cpa.configure_advance.items.extra_info;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtraInfoItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f294346a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f294347b;

    public c(u uVar, Provider provider) {
        this.f294346a = uVar;
        this.f294347b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f294346a.get(), this.f294347b.get());
    }
}
