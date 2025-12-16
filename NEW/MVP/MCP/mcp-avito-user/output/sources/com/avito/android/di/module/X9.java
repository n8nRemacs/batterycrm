package com.avito.android.di.module;

import com.avito.android.util.InterfaceC35745a5;
import f90.C40247A;
import hz.InterfaceC41196a;
import javax.inject.Provider;
import rZ.InterfaceC47619a;

/* compiled from: UnreadNotificationsModule_ProvideNotificationsInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class X9 implements dagger.internal.h<com.avito.android.remote.notification.M> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<TV.f> f144193a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<pZ.d> f144194b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<eH0.h> f144195c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.db.p f144196d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC47619a> f144197e;

    /* renamed from: f, reason: collision with root package name */
    public final C40247A f144198f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f144199g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f144200h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f144201i;

    public X9(Provider provider, Provider provider2, Provider provider3, com.avito.android.db.p pVar, Provider provider4, C40247A c40247a, dagger.internal.u uVar, Provider provider5, Provider provider6) {
        this.f144193a = provider;
        this.f144194b = provider2;
        this.f144195c = provider3;
        this.f144196d = pVar;
        this.f144197e = provider4;
        this.f144198f = c40247a;
        this.f144199g = uVar;
        this.f144200h = provider5;
        this.f144201i = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        TV.f fVar = this.f144193a.get();
        pZ.d dVar = this.f144194b.get();
        eH0.h hVar = this.f144195c.get();
        com.avito.android.db.n nVar = (com.avito.android.db.n) this.f144196d.get();
        InterfaceC47619a interfaceC47619a = this.f144197e.get();
        f90.K k12 = (f90.K) this.f144198f.get();
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f144199g));
        InterfaceC35745a5 interfaceC35745a5 = this.f144200h.get();
        InterfaceC41196a interfaceC41196a = this.f144201i.get();
        int i12 = W9.f144182a;
        return new com.avito.android.remote.notification.S(fVar, dVar, hVar, nVar, interfaceC47619a, k12, eVarA, interfaceC35745a5, interfaceC41196a);
    }
}
