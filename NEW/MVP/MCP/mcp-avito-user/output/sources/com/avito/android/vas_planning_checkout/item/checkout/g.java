package com.avito.android.vas_planning_checkout.item.checkout;

import com.avito.android.vas_planning_checkout.InterfaceC36080a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PlanCheckoutPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f322933a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<a> f322934b;

    public g(u uVar, Provider provider) {
        this.f322933a = uVar;
        this.f322934b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((InterfaceC36080a) this.f322933a.get(), this.f322934b.get());
    }
}
