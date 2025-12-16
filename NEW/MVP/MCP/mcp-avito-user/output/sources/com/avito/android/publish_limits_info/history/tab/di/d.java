package com.avito.android.publish_limits_info.history.tab.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HistoryAdvertsListModule_ProvideItemBinder$_avito_publish_limits_info_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.publish_limits_info.history.tab.advert.c f245913a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.publish_limits_info.history.tab.info.c f245914b;

    public d(com.avito.android.publish_limits_info.history.tab.advert.c cVar, com.avito.android.publish_limits_info.history.tab.info.c cVar2) {
        this.f245913a = cVar;
        this.f245914b = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.publish_limits_info.history.tab.advert.b bVar = (com.avito.android.publish_limits_info.history.tab.advert.b) this.f245913a.get();
        com.avito.android.publish_limits_info.history.tab.info.b bVar2 = (com.avito.android.publish_limits_info.history.tab.info.b) this.f245914b.get();
        b bVar3 = b.f245911a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        return c10493a.a();
    }
}
