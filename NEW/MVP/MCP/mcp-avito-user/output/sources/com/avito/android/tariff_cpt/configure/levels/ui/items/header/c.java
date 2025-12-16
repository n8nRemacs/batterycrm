package com.avito.android.tariff_cpt.configure.levels.ui.items.header;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCptConfigureLevelsHeaderItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f297935a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f297936b;

    public c(u uVar, Provider provider) {
        this.f297935a = uVar;
        this.f297936b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f297935a.get(), this.f297936b.get());
    }
}
