package com.avito.android.tariff_cpt.info.ui.items.card;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptInfoCardItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f298278a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f298279b;

    public c(u uVar, Provider provider) {
        this.f298278a = uVar;
        this.f298279b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f298278a.get(), this.f298279b.get());
    }
}
