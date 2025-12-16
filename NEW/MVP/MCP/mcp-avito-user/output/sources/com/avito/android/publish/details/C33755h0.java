package com.avito.android.publish.details;

import javax.inject.Provider;

/* compiled from: PublishDetailsButtonHelperImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.h0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33755h0 implements dagger.internal.h<C33752g0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f234637a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC33675a> f234638b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f234639c;

    public C33755h0(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f234637a = provider;
        this.f234638b = provider2;
        this.f234639c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33752g0(this.f234637a.get(), this.f234638b.get(), (InterfaceC33761j0) this.f234639c.get());
    }
}
