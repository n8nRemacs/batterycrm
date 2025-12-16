package com.avito.android.theme_settings.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ThemeSettingsModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f301330a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f301331b;

    public g(u uVar, Provider provider) {
        this.f301330a = uVar;
        this.f301331b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f301330a.get();
        com.avito.konveyor.a aVar2 = this.f301331b.get();
        int i12 = d.f301328a;
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
