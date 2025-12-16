package com.avito.android.tariff_cpt.info.ui.items.level_header;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptInfoLevelHeaderItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f298407a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f298408b;

    public c(u uVar, Provider provider) {
        this.f298407a = uVar;
        this.f298408b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f298407a.get(), this.f298408b.get());
    }
}
