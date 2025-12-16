package com.avito.android.feedback_adverts.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeedbackAdvertsModule_ProvideVHFactory$_avito_feedback_adverts_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.feedback_adverts.adapter.b f157814a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.feedback_adverts.adapter.j f157815b;

    public m(com.avito.android.feedback_adverts.adapter.b bVar, com.avito.android.feedback_adverts.adapter.j jVar) {
        this.f157814a = bVar;
        this.f157815b = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.feedback_adverts.adapter.a aVar = (com.avito.android.feedback_adverts.adapter.a) this.f157814a.get();
        this.f157815b.getClass();
        com.avito.android.feedback_adverts.adapter.i iVar = new com.avito.android.feedback_adverts.adapter.i();
        e.f157805a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(iVar);
        return c10493a.a();
    }
}
