package com.avito.android.publish.screen.step.wizard.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WizardModule_ProvideAdapterPresenter$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f242497a;

    /* renamed from: b, reason: collision with root package name */
    public final u f242498b;

    public g(e eVar, u uVar) {
        this.f242497a = eVar;
        this.f242498b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f242498b.get();
        this.f242497a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
