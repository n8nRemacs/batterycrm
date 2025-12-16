package com.avito.android.tariff.cpa.configure_info.items.feature;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConfigureFeatureItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f294502a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f294503b;

    public c(u uVar, Provider provider) {
        this.f294502a = uVar;
        this.f294503b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f294502a.get(), this.f294503b.get());
    }
}
