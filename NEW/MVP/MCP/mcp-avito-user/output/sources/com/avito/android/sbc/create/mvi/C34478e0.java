package com.avito.android.sbc.create.mvi;

import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;

/* compiled from: CreateDiscountDispatchFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.sbc.create.mvi.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34478e0 implements dagger.internal.h<C34476d0> {

    /* renamed from: a, reason: collision with root package name */
    public final Z f259603a;

    /* renamed from: b, reason: collision with root package name */
    public final C34472b0 f259604b;

    /* renamed from: c, reason: collision with root package name */
    public final G0 f259605c;

    public C34478e0(Z z12, C34472b0 c34472b0, G0 g02) {
        this.f259603a = z12;
        this.f259604b = c34472b0;
        this.f259605c = g02;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34469a c34469a = (C34469a) this.f259603a.get();
        this.f259604b.getClass();
        C34470a0 c34470a0 = new C34470a0();
        this.f259605c.getClass();
        F0 f02 = new F0();
        CreateDiscountDispatchState.f259615a.getClass();
        return new C34476d0("CreateDiscountDispatch", CreateDiscountDispatchState.a.f259759b, new C34474c0(c34469a, f02, c34470a0));
    }
}
