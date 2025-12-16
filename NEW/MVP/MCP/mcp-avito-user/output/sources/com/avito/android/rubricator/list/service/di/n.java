package com.avito.android.rubricator.list.service.di;

import androidx.view.P0;
import com.avito.android.rubricator.list.service.ServiceListFragment;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceListModule_ProvidesServiceListViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<com.avito.android.rubricator.list.service.h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f255984a;

    /* renamed from: b, reason: collision with root package name */
    public final u f255985b;

    public n(dagger.internal.l lVar, u uVar) {
        this.f255984a = lVar;
        this.f255985b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ServiceListFragment serviceListFragment = (ServiceListFragment) this.f255984a.f393949a;
        P0.c cVar = (P0.c) this.f255985b.get();
        e.f255972a.getClass();
        return (com.avito.android.rubricator.list.service.h) new P0(serviceListFragment, cVar).a(com.avito.android.rubricator.list.service.i.class);
    }
}
