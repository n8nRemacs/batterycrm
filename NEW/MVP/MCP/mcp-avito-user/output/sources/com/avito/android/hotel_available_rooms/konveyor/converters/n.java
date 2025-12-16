package com.avito.android.hotel_available_rooms.konveyor.converters;

import com.avito.android.R;
import com.avito.android.deep_linking.links.CalendarLink;
import com.avito.android.guests_selector.NewGuestsSelectorDeepLink;
import com.avito.android.guests_selector.io.AvailableAge;
import com.avito.android.guests_selector.io.GuestsDetailed;
import com.avito.android.hotel_available_rooms.di.A;
import com.avito.android.hotel_available_rooms.di.y;
import com.avito.android.hotel_available_rooms.domain.models.HotelDateFilter;
import com.avito.android.hotel_available_rooms.domain.models.HotelFilters;
import com.avito.android.hotel_available_rooms.domain.models.HotelGuestFilter;
import com.avito.android.hotel_available_rooms.konveyor.filter.HotelRoomFilterItem;
import com.avito.android.printable_text.PrintableText;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: HotelRoomFiltersItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/converters/n;", "Lcom/avito/android/hotel_available_rooms/konveyor/converters/m;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<Integer, String> f162887a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f162888b;

    @Inject
    public n(@Y61.k @A SimpleDateFormat simpleDateFormat, @Y61.k @y Map map) {
        this.f162887a = map;
        this.f162888b = simpleDateFormat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.hotel_available_rooms.konveyor.converters.m
    @Y61.k
    public final List<com.avito.conveyor_item.a> a(@Y61.l HotelFilters hotelFilters) {
        PrintableText printableTextA;
        ArrayList arrayList;
        String str;
        PrintableText printableTextA2;
        if (hotelFilters == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList2 = new ArrayList();
        HotelDateFilter hotelDateFilter = hotelFilters.f162795c;
        if (hotelDateFilter != null) {
            SimpleDateFormat simpleDateFormat = this.f162888b;
            String str2 = hotelDateFilter.f162791b;
            Date date = str2 != null ? simpleDateFormat.parse(str2) : null;
            String str3 = hotelDateFilter.f162792c;
            if (date == null) {
                printableTextA2 = com.avito.android.printable_text.b.a();
            } else {
                Date date2 = str3 != null ? simpleDateFormat.parse(str3) : null;
                if (date2 == null) {
                    printableTextA2 = com.avito.android.printable_text.b.a();
                } else {
                    int iAbs = (int) (Math.abs(date2.getTime() - date.getTime()) / 86400000);
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date);
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTime(date2);
                    int i12 = calendar.get(5);
                    int i13 = calendar2.get(5);
                    int i14 = calendar.get(2);
                    int i15 = calendar2.get(2);
                    Integer numValueOf = Integer.valueOf(i14);
                    Map<Integer, String> map = this.f162887a;
                    String str4 = map.get(numValueOf);
                    printableTextA2 = (str4 == null || (str = map.get(Integer.valueOf(i15))) == null) ? com.avito.android.printable_text.b.a() : i14 == i15 ? com.avito.android.printable_text.b.b(R.plurals.hotel_available_rooms_date_filter_title_same_month, iAbs, Integer.valueOf(i12), Integer.valueOf(i13), str4, Integer.valueOf(iAbs)) : com.avito.android.printable_text.b.b(R.plurals.hotel_available_rooms_date_filter_title_different_month, iAbs, Integer.valueOf(i12), str4, Integer.valueOf(i13), str, Integer.valueOf(iAbs));
                }
            }
            Date date3 = str2 != null ? simpleDateFormat.parse(str2) : null;
            Date date4 = str3 != null ? simpleDateFormat.parse(str3) : null;
            arrayList2.add(new HotelRoomFilterItem("hotel_room_date_filter_item", printableTextA2, new CalendarLink(new CalendarLink.CalendarData(date4 != null ? date3 : null, date3 != null ? date4 : null, hotelDateFilter.f162793d, null, 8, null))));
        }
        HotelGuestFilter hotelGuestFilter = hotelFilters.f162794b;
        if (hotelGuestFilter != null) {
            List<Integer> list = hotelGuestFilter.f162801g;
            Integer num = hotelGuestFilter.f162800f;
            if (num != null) {
                int size = (list == null ? C42784z0.f406748b : list).size() + num.intValue();
                printableTextA = com.avito.android.printable_text.b.b(R.plurals.hotel_available_rooms_guest_filter_title, size, Integer.valueOf(size));
            } else {
                printableTextA = com.avito.android.printable_text.b.a();
            }
            if (list != null) {
                List<Integer> list2 = list;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(String.valueOf(((Number) it.next()).intValue()));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            List<DI.a> list3 = DI.b.f3141a;
            ArrayList arrayList4 = new ArrayList(C42745f0.q(list3, 10));
            for (DI.a aVar : list3) {
                arrayList4.add(new AvailableAge(aVar.f3139a, aVar.f3140b));
            }
            arrayList2.add(new HotelRoomFilterItem("hotel_room_guest_filter_item", printableTextA, new NewGuestsSelectorDeepLink(null, 0 == true ? 1 : 0, hotelGuestFilter.f162796b, hotelGuestFilter.f162797c, hotelGuestFilter.f162798d, hotelGuestFilter.f162799e, Boolean.TRUE, arrayList4, new GuestsDetailed(null, null, hotelGuestFilter.f162800f, arrayList, null, 16, null), null, 515, null)));
        }
        return arrayList2;
    }
}
