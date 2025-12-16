package com.avito.android.rating_form.step.di;

import androidx.recyclerview.widget.C;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingFormStepModule_ProvideListUpdateCallbackFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f249321a;

    public n(dagger.internal.f fVar) {
        this.f249321a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f249321a.get();
        e.f249279a.getClass();
        return jVar;
    }
}
