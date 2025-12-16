package com.avito.android.user_adverts.tab_screens.di;

import com.avito.android.user_adverts.tab_screens.di.a;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import d70.C39526b;
import d70.InterfaceC39525a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import xJ0.InterfaceC49849a;

/* compiled from: UserAdvertsListItemsModule_ProvideItemBinder$_avito_user_adverts_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49849a> f315897a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts.tab_screens.advert_list.disclaimer.a> f315898b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.c> f315899c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts.tab_screens.advert_list.loading.f> f315900d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts.tab_screens.advert_list.progress.b> f315901e;

    /* renamed from: f, reason: collision with root package name */
    public final u f315902f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC39525a> f315903g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.personal_selections.view.a> f315904h;

    public g(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f315897a = provider;
        this.f315898b = provider2;
        this.f315899c = provider3;
        this.f315900d = provider4;
        this.f315901e = provider5;
        this.f315902f = uVar;
        this.f315903g = provider6;
        this.f315904h = provider7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        InterfaceC49849a interfaceC49849a = this.f315897a.get();
        com.avito.android.user_adverts.tab_screens.advert_list.disclaimer.a aVar = this.f315898b.get();
        com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.c cVar = this.f315899c.get();
        com.avito.android.user_adverts.tab_screens.advert_list.loading.f fVar = this.f315900d.get();
        com.avito.android.user_adverts.tab_screens.advert_list.progress.b bVar = this.f315901e.get();
        com.avito.android.user_adverts.tab_screens.advert_list.empty_search.b bVar2 = (com.avito.android.user_adverts.tab_screens.advert_list.empty_search.b) this.f315902f.get();
        C39526b c39526bB = ((a.c.k) this.f315903g).f315883a.b();
        com.avito.android.personal_selections.view.a aVar2 = (com.avito.android.personal_selections.view.a) ((a.c.l) this.f315904h).get();
        d dVar = d.f315895a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(fVar);
        c10493a.b(interfaceC49849a.a());
        c10493a.b(aVar);
        c10493a.b(cVar);
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(c39526bB);
        c10493a.b(aVar2);
        return c10493a.a();
    }
}
