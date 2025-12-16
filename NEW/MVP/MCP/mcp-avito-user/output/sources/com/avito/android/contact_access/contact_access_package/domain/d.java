package com.avito.android.contact_access.contact_access_package.domain;

import cP.InterfaceC27082a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContactAccessPackageInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27082a> f125881a;

    /* renamed from: b, reason: collision with root package name */
    public final l f125882b;

    /* renamed from: c, reason: collision with root package name */
    public final l f125883c;

    public d(l lVar, l lVar2, Provider provider) {
        this.f125881a = provider;
        this.f125882b = lVar;
        this.f125883c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f125881a.get(), (String) this.f125882b.f393949a, ((Boolean) this.f125883c.f393949a).booleanValue());
    }
}
