package com.avito.android.extended_profile_universal_widget_edit.create.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalWidgetCreateModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f153716a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f153717b;

    public e(u uVar, Provider provider) {
        this.f153716a = uVar;
        this.f153717b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f153716a.get();
        com.avito.konveyor.a aVar2 = this.f153717b.get();
        d.f153715a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
