package com.avito.android.extended_profile_adverts.di;

import com.avito.android.serp.adapter.C34735h;
import com.avito.android.serp.adapter.C34741k;
import com.avito.android.serp.adapter.C34820s;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import javax.inject.Provider;

/* compiled from: ProfileAdvertsAdapterModule_ProvideItemBinder$_avito_extended_profile_adverts_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30493b f150808a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C34741k> f150809b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C34820s> f150810c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C34735h> f150811d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile_adverts.adapter.placeholder.b> f150812e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.extended_profile_adverts.adapter.error_snippet.c f150813f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile_adverts.adapter.loading_item.c> f150814g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.public_profile.disclaimer.c f150815h;

    public i(C30493b c30493b, Provider provider, Provider provider2, Provider provider3, Provider provider4, com.avito.android.extended_profile_adverts.adapter.error_snippet.c cVar, Provider provider5, com.avito.android.public_profile.disclaimer.c cVar2) {
        this.f150808a = c30493b;
        this.f150809b = provider;
        this.f150810c = provider2;
        this.f150811d = provider3;
        this.f150812e = provider4;
        this.f150813f = cVar;
        this.f150814g = provider5;
        this.f150815h = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        C34741k c34741k = this.f150809b.get();
        C34820s c34820s = this.f150810c.get();
        C34735h c34735h = this.f150811d.get();
        com.avito.android.extended_profile_adverts.adapter.placeholder.b bVar = this.f150812e.get();
        com.avito.android.extended_profile_adverts.adapter.error_snippet.b bVar2 = (com.avito.android.extended_profile_adverts.adapter.error_snippet.b) this.f150813f.get();
        com.avito.android.extended_profile_adverts.adapter.loading_item.c cVar = this.f150814g.get();
        com.avito.android.public_profile.disclaimer.b bVar3 = (com.avito.android.public_profile.disclaimer.b) this.f150815h.get();
        this.f150808a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(c34741k);
        c10493a.b(c34820s);
        c10493a.b(c34735h);
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(cVar);
        c10493a.b(bVar3);
        return c10493a.a();
    }
}
