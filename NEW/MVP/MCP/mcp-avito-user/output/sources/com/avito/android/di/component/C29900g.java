package com.avito.android.di.component;

import Kg.InterfaceC14312a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: AvlEntryModule_ProvideShortVideosItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.component.g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29900g implements dagger.internal.h<Jg.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f139294a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Ig.f> f139295b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f139296c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.avl_analytics.a> f139297d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<Jg.c> f139298e;

    public C29900g(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f139294a = uVar;
        this.f139295b = provider;
        this.f139296c = provider2;
        this.f139297d = provider3;
        this.f139298e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14312a interfaceC14312a = (InterfaceC14312a) this.f139294a.get();
        Ig.f fVar = this.f139295b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f139296c.get();
        com.avito.android.avl_analytics.a aVar = this.f139297d.get();
        Jg.c cVar = this.f139298e.get();
        C29898e.f139289a.getClass();
        return cVar.a(interfaceC14312a, interfaceC35745a5, fVar, aVar);
    }
}
