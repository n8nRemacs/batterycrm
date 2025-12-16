package com.avito.android.vas_performance.di.competitive;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CompetitiveVasListModule_ProvideItemBinder$_avito_vas_performance_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class o implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f319957a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.vas_performance.ui.items.header.b f319958b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.vas_performance.ui.items.competitive_vas.b f319959c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.vas_performance.ui.items.competitive_vas_info_action.c f319960d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.vas_performance.ui.items.competitive_vas_tabs.d f319961e;

    public o(l lVar, com.avito.android.vas_performance.ui.items.header.b bVar, com.avito.android.vas_performance.ui.items.competitive_vas.b bVar2, com.avito.android.vas_performance.ui.items.competitive_vas_info_action.c cVar, com.avito.android.vas_performance.ui.items.competitive_vas_tabs.d dVar) {
        this.f319957a = lVar;
        this.f319958b = bVar;
        this.f319959c = bVar2;
        this.f319960d = cVar;
        this.f319961e = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.vas_performance.ui.items.header.a aVar = (com.avito.android.vas_performance.ui.items.header.a) this.f319958b.get();
        com.avito.android.vas_performance.ui.items.competitive_vas.a aVar2 = (com.avito.android.vas_performance.ui.items.competitive_vas.a) this.f319959c.get();
        com.avito.android.vas_performance.ui.items.competitive_vas_info_action.b bVar = (com.avito.android.vas_performance.ui.items.competitive_vas_info_action.b) this.f319960d.get();
        com.avito.android.vas_performance.ui.items.competitive_vas_tabs.c cVar = (com.avito.android.vas_performance.ui.items.competitive_vas_tabs.c) this.f319961e.get();
        this.f319957a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(bVar);
        c10493a.b(cVar);
        return c10493a.a();
    }
}
