package com.avito.android.realty_agency.checkerboard.mvi;

import Zh0.C19563e;

/* compiled from: CheckerboardFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final u f251335a;

    /* renamed from: b, reason: collision with root package name */
    public final s f251336b;

    /* renamed from: c, reason: collision with root package name */
    public final C f251337c;

    /* renamed from: d, reason: collision with root package name */
    public final E f251338d;

    public x(u uVar, s sVar, C c12, E e12) {
        this.f251335a = uVar;
        this.f251336b = sVar;
        this.f251337c = c12;
        this.f251338d = e12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        t tVar = (t) this.f251335a.get();
        C34225a c34225a = (C34225a) this.f251336b.get();
        B b12 = (B) this.f251337c.get();
        D d12 = (D) this.f251338d.get();
        C19563e.f20456n.getClass();
        return new w("Checkerboard", C19563e.f20457o, new v(tVar, c34225a, d12, b12));
    }
}
