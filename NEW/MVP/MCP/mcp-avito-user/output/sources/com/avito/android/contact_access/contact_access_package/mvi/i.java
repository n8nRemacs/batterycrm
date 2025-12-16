package com.avito.android.contact_access.contact_access_package.mvi;

import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContactAccessPackageActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.contact_access.contact_access_package.domain.a> f125905a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f125906b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f125907c;

    public i(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f125905a = provider;
        this.f125906b = provider2;
        this.f125907c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f125905a.get(), this.f125906b.get(), ((Boolean) this.f125907c.f393949a).booleanValue());
    }
}
