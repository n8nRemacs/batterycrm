package com.avito.android.advert.item.mortgage_calculation;

import c6.InterfaceC26946a;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MortgageCalculationPresenterImpl_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f77655a;

    /* renamed from: b, reason: collision with root package name */
    public final u f77656b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28265d> f77657c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage_calculator.data.b> f77658d;

    public c(l lVar, u uVar, Provider provider, Provider provider2) {
        this.f77655a = lVar;
        this.f77656b = uVar;
        this.f77657c = provider;
        this.f77658d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((String) this.f77655a.f393949a, (InterfaceC26946a) this.f77656b.get(), this.f77657c.get(), this.f77658d.get());
    }
}
