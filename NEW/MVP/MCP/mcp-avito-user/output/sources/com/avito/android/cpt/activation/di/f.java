package com.avito.android.cpt.activation.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptActivationModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpt.activation.ui.items.header.c f126231a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.cpt.activation.ui.items.advert.c f126232b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.cpt.activation.ui.items.delivery.c f126233c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.cpt.activation.ui.items.dbs.c f126234d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.cpt.activation.ui.items.cnc.c f126235e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.cpt.activation.ui.items.alert.c f126236f;

    public f(com.avito.android.cpt.activation.ui.items.header.c cVar, com.avito.android.cpt.activation.ui.items.advert.c cVar2, com.avito.android.cpt.activation.ui.items.delivery.c cVar3, com.avito.android.cpt.activation.ui.items.dbs.c cVar4, com.avito.android.cpt.activation.ui.items.cnc.c cVar5, com.avito.android.cpt.activation.ui.items.alert.c cVar6) {
        this.f126231a = cVar;
        this.f126232b = cVar2;
        this.f126233c = cVar3;
        this.f126234d = cVar4;
        this.f126235e = cVar5;
        this.f126236f = cVar6;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.cpt.activation.ui.items.header.b bVar = (com.avito.android.cpt.activation.ui.items.header.b) this.f126231a.get();
        com.avito.android.cpt.activation.ui.items.advert.b bVar2 = (com.avito.android.cpt.activation.ui.items.advert.b) this.f126232b.get();
        com.avito.android.cpt.activation.ui.items.delivery.b bVar3 = (com.avito.android.cpt.activation.ui.items.delivery.b) this.f126233c.get();
        com.avito.android.cpt.activation.ui.items.dbs.b bVar4 = (com.avito.android.cpt.activation.ui.items.dbs.b) this.f126234d.get();
        com.avito.android.cpt.activation.ui.items.cnc.b bVar5 = (com.avito.android.cpt.activation.ui.items.cnc.b) this.f126235e.get();
        com.avito.android.cpt.activation.ui.items.alert.b bVar6 = (com.avito.android.cpt.activation.ui.items.alert.b) this.f126236f.get();
        d.f126229a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(bVar3);
        c10493a.b(bVar4);
        c10493a.b(bVar5);
        c10493a.b(bVar6);
        return c10493a.a();
    }
}
