package com.avito.android.parameters_sheet.di;

import androidx.recyclerview.widget.C;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ParametersListDialogModule_ProvideListUpdateListenerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class o implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f210799a;

    public o(dagger.internal.f fVar) {
        this.f210799a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f210799a.get();
        d.f210761a.getClass();
        return jVar;
    }
}
