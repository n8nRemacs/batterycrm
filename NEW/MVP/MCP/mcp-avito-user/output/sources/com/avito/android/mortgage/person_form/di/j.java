package com.avito.android.mortgage.person_form.di;

import androidx.recyclerview.widget.GridLayoutManager;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PersonFormModule_ProvideSpanSizeCountFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<GridLayoutManager.c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f200560a;

    public j(u uVar) {
        this.f200560a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.mortgage.util.f fVar = (com.avito.android.mortgage.util.f) this.f200560a.get();
        e eVar = e.f200552a;
        return new f(fVar);
    }
}
