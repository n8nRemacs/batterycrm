package com.avito.android.rubricator.list.service.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceListModule_ProvideListUpdateCallbackFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final u f255979a;

    public j(u uVar) {
        this.f255979a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f255979a.get();
        e.f255972a.getClass();
        return jVar;
    }
}
