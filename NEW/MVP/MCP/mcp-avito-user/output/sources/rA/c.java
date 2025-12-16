package ra;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import ra.InterfaceC47623b;

/* compiled from: AdvertDetailsNeighboringDatesModule_NeighboringDatesItemsModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC47623b.a f429869a;

    /* renamed from: b, reason: collision with root package name */
    public final u f429870b;

    public c(InterfaceC47623b.a aVar, u uVar) {
        this.f429869a = aVar;
        this.f429870b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f429870b.get();
        this.f429869a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
