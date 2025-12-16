package com.avito.android.rating_form.step.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormStepModule_ProvideDataAwareAdapterPresenterImplFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f249283a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f249284b;

    /* renamed from: c, reason: collision with root package name */
    public final u f249285c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f249283a = provider;
        this.f249284b = provider2;
        this.f249285c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f249283a);
        com.avito.konveyor.adapter.h hVar = this.f249284b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f249285c.get();
        e.f249279a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
