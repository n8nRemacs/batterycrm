package com.avito.android.rubricator.list.service;

import com.avito.android.rubricator.list.service.model.ServiceListArguments;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import wn0.InterfaceC49655a;

/* compiled from: ServiceListFragmentViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f255952a;

    /* renamed from: b, reason: collision with root package name */
    public final u f255953b;

    public c(l lVar, u uVar) {
        this.f255952a = lVar;
        this.f255953b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((ServiceListArguments) this.f255952a.f393949a, (InterfaceC49655a) this.f255953b.get());
    }
}
