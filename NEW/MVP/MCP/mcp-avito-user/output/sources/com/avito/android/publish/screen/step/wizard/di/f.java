package com.avito.android.publish.screen.step.wizard.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WizardModule_ProvideAdapter$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final e f242494a;

    /* renamed from: b, reason: collision with root package name */
    public final u f242495b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f242496c;

    public f(e eVar, u uVar, Provider provider) {
        this.f242494a = eVar;
        this.f242495b = uVar;
        this.f242496c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f242495b.get();
        com.avito.konveyor.a aVar2 = this.f242496c.get();
        this.f242494a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
