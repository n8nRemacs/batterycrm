package com.avito.android.publish.screen.step.wizard.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WizardModule_ProvideItemBinder$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f242499a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.wizard.a> f242500b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.header.b> f242501c;

    /* renamed from: d, reason: collision with root package name */
    public final u f242502d;

    public h(e eVar, Provider provider, Provider provider2, u uVar) {
        this.f242499a = eVar;
        this.f242500b = provider;
        this.f242501c = provider2;
        this.f242502d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.blueprints.publish.wizard.a aVar = this.f242500b.get();
        com.avito.android.blueprints.publish.header.b bVar = this.f242501c.get();
        com.avito.android.blueprints.publish.checkable.a aVar2 = (com.avito.android.blueprints.publish.checkable.a) this.f242502d.get();
        this.f242499a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(bVar);
        c10493a.b(aVar2);
        return c10493a.a();
    }
}
