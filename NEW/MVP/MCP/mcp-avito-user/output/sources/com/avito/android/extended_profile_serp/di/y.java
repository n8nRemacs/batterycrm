package com.avito.android.extended_profile_serp.di;

import com.avito.android.serp.adapter.C34741k;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSerpModule_ProvideItemBinder$_avito_extended_profile_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class y implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.extended_profile_serp.adapter.job_list_item.b f152874a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C34741k> f152875b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.extended_profile_serp.adapter.progress.b f152876c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.extended_profile_serp.adapter.search_correction.b f152877d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.extended_profile_serp.adapter.search_header.b f152878e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.extended_profile_serp.adapter.search_empty.b f152879f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.extended_profile_serp.adapter.search_active_empty.b f152880g;

    public y(com.avito.android.extended_profile_serp.adapter.job_list_item.b bVar, Provider provider, com.avito.android.extended_profile_serp.adapter.progress.b bVar2, com.avito.android.extended_profile_serp.adapter.search_correction.b bVar3, com.avito.android.extended_profile_serp.adapter.search_header.b bVar4, com.avito.android.extended_profile_serp.adapter.search_empty.b bVar5, com.avito.android.extended_profile_serp.adapter.search_active_empty.b bVar6) {
        this.f152874a = bVar;
        this.f152875b = provider;
        this.f152876c = bVar2;
        this.f152877d = bVar3;
        this.f152878e = bVar4;
        this.f152879f = bVar5;
        this.f152880g = bVar6;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.extended_profile_serp.adapter.job_list_item.a aVar = (com.avito.android.extended_profile_serp.adapter.job_list_item.a) this.f152874a.get();
        C34741k c34741k = this.f152875b.get();
        com.avito.android.extended_profile_serp.adapter.progress.a aVar2 = (com.avito.android.extended_profile_serp.adapter.progress.a) this.f152876c.get();
        com.avito.android.extended_profile_serp.adapter.search_correction.a aVar3 = (com.avito.android.extended_profile_serp.adapter.search_correction.a) this.f152877d.get();
        com.avito.android.extended_profile_serp.adapter.search_header.a aVar4 = (com.avito.android.extended_profile_serp.adapter.search_header.a) this.f152878e.get();
        com.avito.android.extended_profile_serp.adapter.search_empty.a aVar5 = (com.avito.android.extended_profile_serp.adapter.search_empty.a) this.f152879f.get();
        com.avito.android.extended_profile_serp.adapter.search_active_empty.a aVar6 = (com.avito.android.extended_profile_serp.adapter.search_active_empty.a) this.f152880g.get();
        C30538h.f152853a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(c34741k);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(aVar4);
        c10493a.b(aVar5);
        c10493a.b(aVar6);
        return c10493a.a();
    }
}
