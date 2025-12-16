package com.avito.android.location_list.di;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.location_list.G;
import com.avito.android.location_list.T;
import com.avito.android.location_list.a0;
import com.avito.android.location_list.di.a;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lW.InterfaceC43691a;
import rW.InterfaceC47603a;

/* compiled from: LocationListModule_ProvidePresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class o implements dagger.internal.h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final d f182036a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<G> f182037b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC47603a> f182038c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f182039d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.location.find.l> f182040e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f182041f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC33034d> f182042g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC43691a> f182043h;

    /* renamed from: i, reason: collision with root package name */
    public final u f182044i;

    public o(d dVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, u uVar) {
        this.f182036a = dVar;
        this.f182037b = provider;
        this.f182038c = provider2;
        this.f182039d = provider3;
        this.f182040e = provider4;
        this.f182041f = provider5;
        this.f182042g = provider6;
        this.f182043h = provider7;
        this.f182044i = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        G g12 = this.f182037b.get();
        InterfaceC47603a interfaceC47603a = this.f182038c.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((a.c.h) this.f182039d).get();
        com.avito.android.location.find.l lVar = this.f182040e.get();
        com.avito.konveyor.adapter.a aVar = this.f182041f.get();
        InterfaceC33034d interfaceC33034d = this.f182042g.get();
        InterfaceC43691a interfaceC43691a = this.f182043h.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f182044i.get();
        d dVar = this.f182036a;
        String str = dVar.f182011k;
        return new a0(g12, interfaceC47603a, interfaceC35745a5, dVar.f182003c, aVar, dVar.f182002b, lVar, dVar.f182005e, dVar.f182004d, dVar.f182006f, dVar.f182007g, dVar.f182008h, dVar.f182009i, dVar.f182010j, str, dVar.f182012l, interfaceC33034d, interfaceC43691a, screenPerformanceTracker);
    }
}
