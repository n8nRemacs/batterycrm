package ra;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ra.InterfaceC47623b;

/* compiled from: AdvertDetailsNeighboringDatesModule_NeighboringDatesItemsModule_ProvideChipsAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC47623b.a f429871a;

    /* renamed from: b, reason: collision with root package name */
    public final u f429872b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f429873c;

    public d(InterfaceC47623b.a aVar, u uVar, Provider provider) {
        this.f429871a = aVar;
        this.f429872b = uVar;
        this.f429873c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f429872b.get();
        com.avito.konveyor.a aVar2 = this.f429873c.get();
        this.f429871a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
