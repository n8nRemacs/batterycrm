package com.avito.android.hotel_available_rooms.domain.converters;

import Y61.k;
import com.avito.android.hotel_available_rooms.domain.models.HotelAvailableRoomsData;
import com.avito.android.hotel_available_rooms.domain.models.HotelDateFilter;
import com.avito.android.hotel_available_rooms.domain.models.HotelFilters;
import com.avito.android.hotel_available_rooms.domain.models.HotelGuestFilter;
import eJ.C40010b;
import eJ.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SearchOffersResponseConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/domain/converters/e;", "Lcom/avito/android/hotel_available_rooms/domain/converters/d;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f162768a;

    @Inject
    public e(@k a aVar) {
        this.f162768a = aVar;
    }

    @Override // com.avito.android.hotel_available_rooms.domain.converters.d
    @k
    public final HotelAvailableRoomsData a(@k C40010b c40010b) {
        ArrayList arrayList;
        Map<String, String> mapA = c40010b.a();
        Integer numValueOf = Integer.valueOf((int) c40010b.getFilters().getGuestFilter().getMinCount());
        Integer numValueOf2 = Integer.valueOf((int) c40010b.getFilters().getGuestFilter().getMaxCount());
        Integer numValueOf3 = Integer.valueOf((int) c40010b.getFilters().getGuestFilter().getMaxAdultsCount());
        Integer numValueOf4 = Integer.valueOf((int) c40010b.getFilters().getGuestFilter().getMaxChildrenCount());
        Integer numValueOf5 = Integer.valueOf((int) c40010b.getFilters().getGuestFilter().getAdultGuests());
        List<Long> listB = c40010b.getFilters().getGuestFilter().b();
        if (listB != null) {
            List<Long> list = listB;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf((int) ((Number) it.next()).longValue()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        HotelFilters hotelFilters = new HotelFilters(new HotelGuestFilter(numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, arrayList), new HotelDateFilter(c40010b.getFilters().getDateFilter().getCheckIn(), c40010b.getFilters().getDateFilter().getCheckOut(), c40010b.getFilters().getDateFilter().getTitle()));
        List<n> listC = c40010b.c();
        ArrayList arrayList3 = new ArrayList(C42745f0.q(listC, 10));
        Iterator<T> it2 = listC.iterator();
        while (it2.hasNext()) {
            arrayList3.add(this.f162768a.a((n) it2.next()));
        }
        return new HotelAvailableRoomsData(mapA, hotelFilters, arrayList3);
    }
}
