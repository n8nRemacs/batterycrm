package iy0;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import iy0.InterfaceC42138d;
import javax.inject.Provider;

/* compiled from: StrBookingPaymentModule_InnerProvider_ProvidePaymentRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f405412a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f405413b;

    public f(u uVar, Provider provider) {
        this.f405412a = uVar;
        this.f405413b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f405412a.get();
        com.avito.konveyor.a aVar2 = this.f405413b.get();
        InterfaceC42138d.a.f405408a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
