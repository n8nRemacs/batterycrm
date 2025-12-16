package com.avito.android.hotel_available_rooms.konveyor.filter;

import Y41.l;
import Y61.k;
import com.avito.android.printable_text.PrintableText;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HotelRoomFilterPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/filter/e;", "LTV0/f;", "Lcom/avito/android/hotel_available_rooms/konveyor/filter/g;", "Lcom/avito/android/hotel_available_rooms/konveyor/filter/HotelRoomFilterItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements TV0.f<g, HotelRoomFilterItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<JI.a, G0> f162921b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super JI.a, G0> lVar) {
        this.f162921b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        HotelRoomFilterItem hotelRoomFilterItem = (HotelRoomFilterItem) aVar;
        gVar.y(hotelRoomFilterItem.f162910c);
        gVar.a(new d(this, hotelRoomFilterItem));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        g gVar = (g) eVar;
        HotelRoomFilterItem hotelRoomFilterItem = (HotelRoomFilterItem) aVar;
        Iterator it = list.iterator();
        Object obj = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null ? next instanceof c : true) {
                obj = next;
            }
        }
        c cVar = (c) (obj instanceof c ? obj : null);
        if (cVar == null) {
            gVar.y(hotelRoomFilterItem.f162910c);
            gVar.a(new d(this, hotelRoomFilterItem));
        } else {
            PrintableText printableText = cVar.f162918a;
            if (printableText != null) {
                gVar.y(printableText);
            }
            gVar.a(new d(this, hotelRoomFilterItem));
        }
    }
}
