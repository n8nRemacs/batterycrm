package com.avito.android.hotel_available_rooms.konveyor.more;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: HotelRoomMorePresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/more/d;", "LTV0/d;", "Lcom/avito/android/hotel_available_rooms/konveyor/more/f;", "Lcom/avito/android/hotel_available_rooms/konveyor/more/HotelRoomMoreItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements TV0.d<f, HotelRoomMoreItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<JI.a, G0> f163041b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super JI.a, G0> lVar) {
        this.f163041b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((f) eVar).a(new c(this, (HotelRoomMoreItem) aVar));
    }
}
