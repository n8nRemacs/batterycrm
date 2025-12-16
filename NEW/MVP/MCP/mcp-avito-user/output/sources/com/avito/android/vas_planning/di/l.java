package com.avito.android.vas_planning.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasPlanningModule_ProvideListUpdateCallbackFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final u f322301a;

    public l(u uVar) {
        this.f322301a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f322301a.get();
        h.f322295a.getClass();
        return jVar;
    }
}
