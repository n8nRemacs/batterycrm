package com.avito.android.profile.pro.impl.converters;

import javax.inject.Provider;
import v90.InterfaceC49182a;

/* compiled from: ProfileProItemConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final A f222469a;

    /* renamed from: b, reason: collision with root package name */
    public final x f222470b;

    /* renamed from: c, reason: collision with root package name */
    public final o f222471c;

    /* renamed from: d, reason: collision with root package name */
    public final v90.c f222472d;

    /* renamed from: e, reason: collision with root package name */
    public final C33354i f222473e;

    /* renamed from: f, reason: collision with root package name */
    public final C33348c f222474f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<SK0.b> f222475g;

    /* renamed from: h, reason: collision with root package name */
    public final l f222476h;

    /* renamed from: i, reason: collision with root package name */
    public final u f222477i;

    /* renamed from: j, reason: collision with root package name */
    public final G f222478j;

    public r(A a12, x xVar, o oVar, v90.c cVar, C33354i c33354i, C33348c c33348c, Provider provider, l lVar, u uVar, G g12) {
        this.f222469a = a12;
        this.f222470b = xVar;
        this.f222471c = oVar;
        this.f222472d = cVar;
        this.f222473e = c33354i;
        this.f222474f = c33348c;
        this.f222475g = provider;
        this.f222476h = lVar;
        this.f222477i = uVar;
        this.f222478j = g12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        y yVar = (y) this.f222469a.get();
        v vVar = (v) this.f222470b.get();
        this.f222471c.getClass();
        n nVar = new n();
        InterfaceC49182a interfaceC49182a = (InterfaceC49182a) this.f222472d.get();
        this.f222473e.getClass();
        C33353h c33353h = new C33353h();
        this.f222474f.getClass();
        C33347b c33347b = new C33347b();
        SK0.b bVar = this.f222475g.get();
        InterfaceC33355j interfaceC33355j = (InterfaceC33355j) this.f222476h.get();
        this.f222477i.getClass();
        t tVar = new t();
        this.f222478j.getClass();
        return new q(yVar, vVar, nVar, interfaceC49182a, c33353h, c33347b, bVar, interfaceC33355j, tVar, new F());
    }
}
