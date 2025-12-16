package com.avito.android.contact_access.contact_access_service.domain;

import Ae.InterfaceC13022a;
import Zw0.InterfaceC19615a;
import cP.InterfaceC27082a;
import com.avito.android.contact_access.contact_access_service.mvi.m;
import com.avito.android.contact_access.contact_access_service.view.ContactAccessServiceArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContactAccessServiceInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC19615a> f125972a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC27082a> f125973b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC13022a> f125974c;

    /* renamed from: d, reason: collision with root package name */
    public final l f125975d;

    /* renamed from: e, reason: collision with root package name */
    public final m f125976e;

    public g(Provider provider, Provider provider2, Provider provider3, l lVar, m mVar) {
        this.f125972a = provider;
        this.f125973b = provider2;
        this.f125974c = provider3;
        this.f125975d = lVar;
        this.f125976e = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC19615a interfaceC19615a = this.f125972a.get();
        InterfaceC27082a interfaceC27082a = this.f125973b.get();
        InterfaceC13022a interfaceC13022a = this.f125974c.get();
        ContactAccessServiceArguments contactAccessServiceArguments = (ContactAccessServiceArguments) this.f125975d.f393949a;
        this.f125976e.getClass();
        return new f(interfaceC19615a, interfaceC27082a, interfaceC13022a, contactAccessServiceArguments, new com.avito.android.contact_access.contact_access_service.mvi.l());
    }
}
