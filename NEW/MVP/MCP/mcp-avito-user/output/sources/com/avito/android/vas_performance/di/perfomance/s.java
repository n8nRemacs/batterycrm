package com.avito.android.vas_performance.di.perfomance;

import androidx.view.P0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_performance.InterfaceC36056j;
import com.avito.android.vas_performance.di.perfomance.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PerformanceVasModuleNew_ProvideViewModelFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class s implements dagger.internal.h<P0.c> {

    /* renamed from: a, reason: collision with root package name */
    public final q f320052a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.vas_performance.repository.a> f320053b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f320054c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC36056j> f320055d;

    /* renamed from: e, reason: collision with root package name */
    public final u f320056e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<AK0.l> f320057f;

    public s(q qVar, Provider provider, Provider provider2, Provider provider3, u uVar, Provider provider4) {
        this.f320052a = qVar;
        this.f320053b = provider;
        this.f320054c = provider2;
        this.f320055d = provider3;
        this.f320056e = uVar;
        this.f320057f = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_performance.repository.a aVar = this.f320053b.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((a.c.C9919c) this.f320054c).get();
        InterfaceC36056j interfaceC36056j = this.f320055d.get();
        TL0.a aVar2 = (TL0.a) this.f320056e.get();
        AK0.l lVar = (AK0.l) ((a.c.b) this.f320057f).get();
        q qVar = this.f320052a;
        qVar.getClass();
        return new com.avito.android.vas_performance.ui.l(qVar.f320047a, qVar.f320048b, aVar, interfaceC35745a5, interfaceC36056j, aVar2, lVar);
    }
}
