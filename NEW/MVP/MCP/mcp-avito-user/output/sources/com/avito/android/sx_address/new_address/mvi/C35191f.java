package com.avito.android.sx_address.new_address.mvi;

/* compiled from: SxNewAddressFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.sx_address.new_address.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35191f implements dagger.internal.h<C35190e> {

    /* renamed from: a, reason: collision with root package name */
    public final C35188c f293774a;

    /* renamed from: b, reason: collision with root package name */
    public final y f293775b;

    /* renamed from: c, reason: collision with root package name */
    public final E f293776c;

    /* renamed from: d, reason: collision with root package name */
    public final A f293777d;

    public C35191f(C35188c c35188c, y yVar, E e12, A a12) {
        this.f293774a = c35188c;
        this.f293775b = yVar;
        this.f293776c = e12;
        this.f293777d = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C35187b c35187b = (C35187b) this.f293774a.get();
        w wVar = (w) this.f293775b.get();
        D d12 = (D) this.f293776c.get();
        this.f293777d.getClass();
        z zVar = new z();
        SxNewAddressMviState.f293712j.getClass();
        return new C35190e("SxNewAddress", SxNewAddressMviState.f293713k, new C35189d(c35187b, wVar, d12, zVar));
    }
}
