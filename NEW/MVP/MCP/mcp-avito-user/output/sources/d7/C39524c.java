package d7;

import d7.InterfaceC39522a;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsShortTermRentModule_ProvidesModule_ProvideTravelPaymentTogglesAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: d7.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C39524c implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC39522a.C11010a f393703a;

    /* renamed from: b, reason: collision with root package name */
    public final u f393704b;

    public C39524c(InterfaceC39522a.C11010a c11010a, u uVar) {
        this.f393703a = c11010a;
        this.f393704b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f393704b.get();
        this.f393703a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
