package com.avito.android.comfortable_deal.stages_transition.item.reasonslist.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReasonsListViewModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.stages_transition.item.reasonslist.reason.f f122918a;

    public e(com.avito.android.comfortable_deal.stages_transition.item.reasonslist.reason.f fVar) {
        this.f122918a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.comfortable_deal.stages_transition.item.reasonslist.reason.e eVar = (com.avito.android.comfortable_deal.stages_transition.item.reasonslist.reason.e) this.f122918a.get();
        int i12 = c.f122916a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(new com.avito.android.comfortable_deal.stages_transition.item.reasonslist.reason.a(eVar));
        return c10493a.a();
    }
}
