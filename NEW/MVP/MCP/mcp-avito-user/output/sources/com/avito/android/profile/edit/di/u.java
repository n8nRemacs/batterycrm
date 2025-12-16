package com.avito.android.profile.edit.di;

import com.avito.android.geo_common.interactor.InterfaceC30715a;
import com.avito.android.profile.edit.V;
import com.avito.android.profile.edit.b0;
import com.avito.android.profile.edit.d0;
import com.avito.android.profile.edit.di.C33316a;
import com.avito.android.remote.X;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import javax.inject.Provider;

/* compiled from: EditProfileModule_ProvideLocationInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class u implements dagger.internal.h<V> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30715a> f222193a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<X> f222194b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f222195c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<d0> f222196d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f222197e;

    public u(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f222193a = provider;
        this.f222194b = provider2;
        this.f222195c = provider3;
        this.f222196d = provider4;
        this.f222197e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC30715a interfaceC30715a = (InterfaceC30715a) ((C33316a.c.h) this.f222193a).get();
        X x12 = (X) ((C33316a.c.f) this.f222194b).get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((C33316a.c.k) this.f222195c).get();
        d0 d0Var = this.f222196d.get();
        Kundle kundle = (Kundle) this.f222197e.f393949a;
        C33319d.f222158a.getClass();
        return new b0(interfaceC30715a, x12, interfaceC35745a5, d0Var, kundle);
    }
}
