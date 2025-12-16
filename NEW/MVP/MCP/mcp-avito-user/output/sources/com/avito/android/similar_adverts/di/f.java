package com.avito.android.similar_adverts.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SimilarAdvertsBlueprintsModule_ProvideItemBinder$_avito_similar_adverts_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.similar_adverts.adapter.a> f283912a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.similar_adverts.adapter.g f283913b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.similar_adverts.adapter.e f283914c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.similar_adverts.adapter.skeleton_title.b f283915d;

    public f(Provider provider, com.avito.android.similar_adverts.adapter.g gVar, com.avito.android.similar_adverts.adapter.e eVar, com.avito.android.similar_adverts.adapter.skeleton_title.b bVar) {
        this.f283912a = provider;
        this.f283913b = gVar;
        this.f283914c = eVar;
        this.f283915d = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.similar_adverts.adapter.a aVar = this.f283912a.get();
        com.avito.android.similar_adverts.adapter.f fVar = (com.avito.android.similar_adverts.adapter.f) this.f283913b.get();
        com.avito.android.similar_adverts.adapter.d dVar = (com.avito.android.similar_adverts.adapter.d) this.f283914c.get();
        com.avito.android.similar_adverts.adapter.skeleton_title.a aVar2 = (com.avito.android.similar_adverts.adapter.skeleton_title.a) this.f283915d.get();
        b bVar = b.f283906a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(fVar);
        c10493a.b(dVar);
        c10493a.b(aVar2);
        return c10493a.a();
    }
}
