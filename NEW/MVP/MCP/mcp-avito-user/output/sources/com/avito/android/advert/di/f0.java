package com.avito.android.advert.di;

import android.content.res.Resources;
import com.avito.android.advert.di.t0;
import com.avito.android.util.L0;
import javax.inject.Provider;

/* compiled from: AdvertFragmentModule_ProvideSectionVerticalAdapterBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class f0 implements dagger.internal.h<com.avito.android.section.vertical.adapter.b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f69396a;

    /* renamed from: b, reason: collision with root package name */
    public final Tp0.s f69397b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f69398c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f69399d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<L0> f69400e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f69401f;

    public f0(dagger.internal.u uVar, Tp0.s sVar, Provider provider, Provider provider2, Provider provider3, dagger.internal.l lVar) {
        this.f69396a = uVar;
        this.f69397b = sVar;
        this.f69398c = provider;
        this.f69399d = provider2;
        this.f69400e = provider3;
        this.f69401f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.section.vertical.adapter.c cVar = (com.avito.android.section.vertical.adapter.c) this.f69396a.get();
        com.avito.konveyor.a aVar = this.f69398c.get();
        com.avito.android.advert.item.similars.j jVar = this.f69399d.get();
        L0 l02 = (L0) ((t0.b.C27735i0) this.f69400e).get();
        Resources resources = (Resources) this.f69401f.f393949a;
        C27710t.f69463a.getClass();
        return new com.avito.android.section.vertical.adapter.b(cVar, this.f69397b, aVar, jVar.a(), new com.avito.android.advert_core.advert.q(jVar.a(), resources, l02, 0, 8, null));
    }
}
