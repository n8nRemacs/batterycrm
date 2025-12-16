package com.avito.android.tariff_cpt.info.ui.items.level_banner;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptInfoLevelBannerItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f298383a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f298384b;

    public c(u uVar, Provider provider) {
        this.f298383a = uVar;
        this.f298384b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f298383a.get(), this.f298384b.get());
    }
}
