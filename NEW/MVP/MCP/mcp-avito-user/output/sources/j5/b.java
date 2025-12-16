package J5;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsHotelOffersScrollListener_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f8750a;

    public b(u uVar) {
        this.f8750a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.advert.item.hotel.hotel_offer.b) this.f8750a.get());
    }
}
