package com.avito.android.comfortable_deal.submitting.promo.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PromoRecyclerModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.submitting.recycler.items.imageBulletItem.b f123144a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.submitting.recycler.items.titleBulletItem.b f123145b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.submitting.recycler.items.NumeratedBulletItem.b f123146c;

    public f(com.avito.android.comfortable_deal.submitting.recycler.items.imageBulletItem.b bVar, com.avito.android.comfortable_deal.submitting.recycler.items.titleBulletItem.b bVar2, com.avito.android.comfortable_deal.submitting.recycler.items.NumeratedBulletItem.b bVar3) {
        this.f123144a = bVar;
        this.f123145b = bVar2;
        this.f123146c = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.comfortable_deal.submitting.recycler.items.imageBulletItem.a aVar = (com.avito.android.comfortable_deal.submitting.recycler.items.imageBulletItem.a) this.f123144a.get();
        com.avito.android.comfortable_deal.submitting.recycler.items.titleBulletItem.a aVar2 = (com.avito.android.comfortable_deal.submitting.recycler.items.titleBulletItem.a) this.f123145b.get();
        com.avito.android.comfortable_deal.submitting.recycler.items.NumeratedBulletItem.a aVar3 = (com.avito.android.comfortable_deal.submitting.recycler.items.NumeratedBulletItem.a) this.f123146c.get();
        d.f123142a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        return c10493a.a();
    }
}
