package com.avito.android.map.mvi;

import com.avito.android.C36135w2;
import javax.inject.Provider;
import lW.InterfaceC43691a;

/* compiled from: MapActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.map.mvi.s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31629s implements dagger.internal.h<C31612a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC31635y> f185299a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<T> f185300b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f185301c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f185302d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC43691a> f185303e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C36135w2> f185304f;

    public C31629s(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f185299a = provider;
        this.f185300b = provider2;
        this.f185301c = provider3;
        this.f185302d = uVar;
        this.f185303e = provider4;
        this.f185304f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C31612a(this.f185299a.get(), this.f185300b.get(), this.f185301c.get(), (com.avito.android.map.analytics.a) this.f185302d.get(), this.f185303e.get(), this.f185304f.get());
    }
}
