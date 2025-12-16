package com.avito.android.login_suggests_impl;

import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.util.InterfaceC35745a5;
import hD.C40806a;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: LoginSuggestsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34258d> f182937a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f182938b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<B3.c> f182939c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C40806a> f182940d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f182941e;

    public k(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f182937a = provider;
        this.f182938b = provider2;
        this.f182939c = provider3;
        this.f182940d = provider4;
        this.f182941e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f182937a.get(), this.f182938b.get(), this.f182939c.get(), this.f182940d.get(), (Set) this.f182941e.get());
    }
}
