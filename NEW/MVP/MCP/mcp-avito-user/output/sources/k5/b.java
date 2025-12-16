package K5;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertHotelReviewModule_ProvideHotelBadgesAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final a f9263a;

    /* renamed from: b, reason: collision with root package name */
    public final u f9264b;

    public b(a aVar, u uVar) {
        this.f9263a = aVar;
        this.f9264b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f9264b.get();
        this.f9263a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
