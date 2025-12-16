package I5;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsHotelOfferModule_ProvideHotelOffersRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final a f7939a;

    /* renamed from: b, reason: collision with root package name */
    public final u f7940b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f7941c;

    public g(a aVar, u uVar, Provider provider) {
        this.f7939a = aVar;
        this.f7940b = uVar;
        this.f7941c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f7940b.get();
        com.avito.konveyor.a aVar2 = this.f7941c.get();
        this.f7939a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
