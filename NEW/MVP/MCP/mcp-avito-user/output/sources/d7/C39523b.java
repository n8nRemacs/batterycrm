package d7;

import d7.InterfaceC39522a;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsShortTermRentModule_ProvidesModule_ProvideTravelPaymentTogglesAdapterFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: d7.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C39523b implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC39522a.C11010a f393700a;

    /* renamed from: b, reason: collision with root package name */
    public final u f393701b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f393702c;

    public C39523b(InterfaceC39522a.C11010a c11010a, u uVar, Provider provider) {
        this.f393700a = c11010a;
        this.f393701b = uVar;
        this.f393702c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f393701b.get();
        com.avito.konveyor.a aVar2 = this.f393702c.get();
        this.f393700a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
