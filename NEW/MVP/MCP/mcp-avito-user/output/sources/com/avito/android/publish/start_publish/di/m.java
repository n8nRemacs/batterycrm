package com.avito.android.publish.start_publish.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StartPublishSheetModule_ProvideItemBinder$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f245399a;

    /* renamed from: b, reason: collision with root package name */
    public final u f245400b;

    public m(j jVar, u uVar) {
        this.f245399a = jVar;
        this.f245400b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.publish.start_publish.blueprint.a aVar = (com.avito.android.publish.start_publish.blueprint.a) this.f245400b.get();
        this.f245399a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
