package com.avito.android.search_suggest.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchSuggestModule_ProvideItemBinder$_avito_search_suggest_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.list.banner.g> f264223a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.list.new_text_suggest.b> f264224b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.list.gap.g> f264225c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.list.text_suggest.a> f264226d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.list.title.a> f264227e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.list.toggle.a> f264228f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.list.list_snippet.a> f264229g;

    /* renamed from: h, reason: collision with root package name */
    public final u f264230h;

    public i(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f264223a = provider;
        this.f264224b = provider2;
        this.f264225c = provider3;
        this.f264226d = provider4;
        this.f264227e = provider5;
        this.f264228f = provider6;
        this.f264229g = provider7;
        this.f264230h = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.list.banner.g gVar = this.f264223a.get();
        com.avito.android.list.new_text_suggest.b bVar = this.f264224b.get();
        com.avito.android.list.gap.g gVar2 = this.f264225c.get();
        com.avito.android.list.text_suggest.a aVar = this.f264226d.get();
        com.avito.android.list.title.a aVar2 = this.f264227e.get();
        com.avito.android.list.toggle.a aVar3 = this.f264228f.get();
        com.avito.android.list.list_snippet.a aVar4 = this.f264229g.get();
        com.avito.android.list.grid_snippet.a aVar5 = (com.avito.android.list.grid_snippet.a) this.f264230h.get();
        int i12 = g.f264221a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(gVar);
        c10493a.b(gVar2);
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(aVar4);
        c10493a.b(aVar5);
        return c10493a.a();
    }
}
