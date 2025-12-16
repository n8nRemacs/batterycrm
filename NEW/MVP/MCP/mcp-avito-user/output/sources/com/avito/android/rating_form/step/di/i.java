package com.avito.android.rating_form.step.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingFormStepModule_ProvideDiffCalculatorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.rating_form.step.recycler.d f249286a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.rating_form.step.recycler.b f249287b;

    public i(com.avito.android.rating_form.step.recycler.d dVar, com.avito.android.rating_form.step.recycler.b bVar) {
        this.f249286a = dVar;
        this.f249287b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f249286a.getClass();
        com.avito.android.rating_form.step.recycler.c cVar = new com.avito.android.rating_form.step.recycler.c();
        this.f249287b.getClass();
        com.avito.android.rating_form.step.recycler.a aVar = new com.avito.android.rating_form.step.recycler.a();
        e.f249279a.getClass();
        return new com.avito.android.recycler.data_aware.i(aVar, null, false, cVar, 2, null);
    }
}
