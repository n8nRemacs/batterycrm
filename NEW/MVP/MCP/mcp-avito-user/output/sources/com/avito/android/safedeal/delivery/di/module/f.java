package com.avito.android.safedeal.delivery.di.module;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RdsOrderCancellationBlueprintsModule_ProvideListUpdateCallback$_avito_safedeal_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final u f256066a;

    public f(u uVar) {
        this.f256066a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f256066a.get();
        a.f256059a.getClass();
        return jVar;
    }
}
