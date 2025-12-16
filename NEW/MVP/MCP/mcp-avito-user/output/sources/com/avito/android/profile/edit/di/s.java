package com.avito.android.profile.edit.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import javax.inject.Provider;

/* compiled from: EditProfileModule_ProvideItemBinder$_avito_profile_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class s implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.profile.edit.adapter.a> f222185a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.profile.edit.adapter.f> f222186b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.profile.edit.adapter.g> f222187c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.profile.edit.adapter.l> f222188d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.profile.edit.adapter.k> f222189e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.profile.edit.adapter.e> f222190f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f222191g;

    public s(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f222185a = provider;
        this.f222186b = provider2;
        this.f222187c = provider3;
        this.f222188d = provider4;
        this.f222189e = provider5;
        this.f222190f = provider6;
        this.f222191g = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.profile.edit.adapter.a aVar = this.f222185a.get();
        com.avito.android.profile.edit.adapter.f fVar = this.f222186b.get();
        com.avito.android.profile.edit.adapter.g gVar = this.f222187c.get();
        com.avito.android.profile.edit.adapter.l lVar = this.f222188d.get();
        com.avito.android.profile.edit.adapter.k kVar = this.f222189e.get();
        com.avito.android.profile.edit.adapter.e eVar = this.f222190f.get();
        com.avito.android.profile.edit.adapter.m mVar = (com.avito.android.profile.edit.adapter.m) this.f222191g.get();
        C33319d.f222158a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(fVar);
        c10493a.b(gVar);
        c10493a.b(lVar);
        c10493a.b(kVar);
        c10493a.b(eVar);
        c10493a.b(mVar);
        return c10493a.a();
    }
}
