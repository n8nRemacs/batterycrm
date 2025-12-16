package com.avito.android.mortgage.manager_usp.interactor;

import com.avito.android.mortgage.manager_usp.model.ManagerUspArguments;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import i00.InterfaceC41203a;
import javax.inject.Provider;
import x00.InterfaceC49712a;

/* compiled from: ManagerUspInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f200403a;

    /* renamed from: b, reason: collision with root package name */
    public final x00.c f200404b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.mortgage.manager_usp.mapper.c f200405c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC41203a> f200406d;

    public c(l lVar, x00.c cVar, com.avito.android.mortgage.manager_usp.mapper.c cVar2, Provider provider) {
        this.f200403a = lVar;
        this.f200404b = cVar;
        this.f200405c = cVar2;
        this.f200406d = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ManagerUspArguments managerUspArguments = (ManagerUspArguments) this.f200403a.f393949a;
        InterfaceC49712a interfaceC49712a = (InterfaceC49712a) this.f200404b.get();
        this.f200405c.getClass();
        return new b(managerUspArguments, interfaceC49712a, new com.avito.android.mortgage.manager_usp.mapper.b(), g.b(this.f200406d));
    }
}
