package com.avito.android.tariff_lf_constructor.configure.setting.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConstructorSettingModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f300047a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f300048b;

    public f(u uVar, Provider provider) {
        this.f300047a = uVar;
        this.f300048b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f300047a.get();
        com.avito.konveyor.a aVar2 = this.f300048b.get();
        b bVar = b.f300043a;
        return new j(aVar, aVar2);
    }
}
