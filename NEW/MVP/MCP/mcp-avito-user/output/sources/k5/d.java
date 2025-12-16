package K5;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertHotelReviewModule_ProvideHotelBadgesRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final a f9267a;

    /* renamed from: b, reason: collision with root package name */
    public final u f9268b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f9269c;

    public d(a aVar, u uVar, Provider provider) {
        this.f9267a = aVar;
        this.f9268b = uVar;
        this.f9269c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f9268b.get();
        com.avito.konveyor.a aVar2 = this.f9269c.get();
        this.f9267a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
