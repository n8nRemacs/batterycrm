package com.avito.android.sx_address.list.mvi;

import com.avito.android.sx_address.list.mvi.entity.ListState;

/* compiled from: SxAddressListFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class E implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final B f293217a;

    /* renamed from: b, reason: collision with root package name */
    public final y f293218b;

    /* renamed from: c, reason: collision with root package name */
    public final G f293219c;

    /* renamed from: d, reason: collision with root package name */
    public final I f293220d;

    public E(B b12, y yVar, G g12, I i12) {
        this.f293217a = b12;
        this.f293218b = yVar;
        this.f293219c = g12;
        this.f293220d = i12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        z zVar = (z) this.f293217a.get();
        x xVar = (x) this.f293218b.get();
        this.f293219c.getClass();
        F f12 = new F();
        H h12 = (H) this.f293220d.get();
        ListState.f293243f.getClass();
        return new D("SxAddressList", ListState.f293244g, new C(zVar, xVar, h12, f12));
    }
}
