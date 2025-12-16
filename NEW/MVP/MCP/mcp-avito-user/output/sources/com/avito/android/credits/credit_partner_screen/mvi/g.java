package com.avito.android.credits.credit_partner_screen.mvi;

import dagger.internal.x;
import dagger.internal.y;
import ys.InterfaceC50289d;

/* compiled from: CreditPartnerFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f128834a;

    /* renamed from: b, reason: collision with root package name */
    public final b f128835b;

    /* renamed from: c, reason: collision with root package name */
    public final i f128836c;

    /* renamed from: d, reason: collision with root package name */
    public final k f128837d;

    public g(d dVar, b bVar, i iVar, k kVar) {
        this.f128834a = dVar;
        this.f128835b = bVar;
        this.f128836c = iVar;
        this.f128837d = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f128834a.get();
        a aVar = (a) this.f128835b.get();
        this.f128836c.getClass();
        h hVar = new h();
        this.f128837d.getClass();
        j jVar = new j();
        InterfaceC50289d.f443541a.getClass();
        return new f("CreditPartner", InterfaceC50289d.a.f443543b, new e(cVar, aVar, jVar, hVar));
    }
}
