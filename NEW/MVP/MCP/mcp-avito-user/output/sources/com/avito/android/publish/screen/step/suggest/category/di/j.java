package com.avito.android.publish.screen.step.suggest.category.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuggestCategoryModule_ProvideItemBinder$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.wizard.a> f242335a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.checkable.a> f242336b;

    /* renamed from: c, reason: collision with root package name */
    public final u f242337c;

    public j(u uVar, Provider provider, Provider provider2) {
        this.f242335a = provider;
        this.f242336b = provider2;
        this.f242337c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.blueprints.publish.wizard.a aVar = this.f242335a.get();
        com.avito.android.blueprints.publish.checkable.a aVar2 = this.f242336b.get();
        com.avito.android.blueprints.publish.header.b bVar = (com.avito.android.blueprints.publish.header.b) this.f242337c.get();
        d.f242328a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar2);
        c10493a.b(aVar);
        c10493a.b(bVar);
        return c10493a.a();
    }
}
