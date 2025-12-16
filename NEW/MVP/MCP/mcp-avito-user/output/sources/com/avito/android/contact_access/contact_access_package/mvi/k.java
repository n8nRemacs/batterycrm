package com.avito.android.contact_access.contact_access_package.mvi;

import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContactAccessPackageBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f125913a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f125914b;

    public k(u uVar, Provider provider) {
        this.f125913a = uVar;
        this.f125914b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.contact_access.contact_access_package.domain.a) this.f125913a.get(), this.f125914b.get());
    }
}
