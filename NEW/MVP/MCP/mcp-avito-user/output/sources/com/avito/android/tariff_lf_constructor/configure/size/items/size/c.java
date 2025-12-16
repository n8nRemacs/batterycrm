package com.avito.android.tariff_lf_constructor.configure.size.items.size;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConfigureSizeItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f300316a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f300317b;

    public c(u uVar, Provider provider) {
        this.f300316a = uVar;
        this.f300317b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f300316a.get(), this.f300317b.get());
    }
}
