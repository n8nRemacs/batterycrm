package com.avito.android.advert.item.hotel.hotel_offer;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroup;
import com.avito.android.deep_linking.links.CalendarLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.guests_selector.NewGuestsSelectorDeepLink;
import com.avito.android.guests_selector.io.AvailableAge;
import com.avito.android.guests_selector.io.GuestsDetailed;
import com.avito.android.hotel.model.DateFilter;
import com.avito.android.hotel.model.GuestFilter;
import com.avito.android.hotel.model.HotelActionButton;
import com.avito.android.hotel.model.HotelOfferFilter;
import com.avito.android.hotel.model.HotelOfferRequestParams;
import com.avito.android.hotel_available_rooms.AvailableHotelRoomsDeeplink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.ButtonAction;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AdvertHotelOfferViewStateBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/r;", "Lcom/avito/android/advert/item/hotel/hotel_offer/q;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f76192a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f76193b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.hotel.hotel_offer.converters.g f76194c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.hotel.hotel_offer.converters.e f76195d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final u3.f<SimpleTestGroup> f76196e;

    @Inject
    public r(@I5.i @Y61.k SimpleDateFormat simpleDateFormat, @I5.m @Y61.k SimpleDateFormat simpleDateFormat2, @Y61.k com.avito.android.advert.item.hotel.hotel_offer.converters.g gVar, @Y61.k com.avito.android.advert.item.hotel.hotel_offer.converters.e eVar, @FI.c @Y61.k u3.f<SimpleTestGroup> fVar) {
        this.f76192a = simpleDateFormat;
        this.f76193b = simpleDateFormat2;
        this.f76194c = gVar;
        this.f76195d = eVar;
        this.f76196e = fVar;
    }

    public static HotelOfferFilter d(HotelOfferRequestParams hotelOfferRequestParams) {
        PrintableText printableTextA;
        PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.advert_details_hotel_guest_filter_placeholder, new Serializable[0]);
        Integer adultGuests = hotelOfferRequestParams.f162640d.getAdultGuests();
        int iIntValue = adultGuests != null ? adultGuests.intValue() : 0;
        List<Integer> listD = hotelOfferRequestParams.f162640d.d();
        int size = iIntValue + (listD != null ? listD.size() : 0);
        Integer numValueOf = Integer.valueOf(size);
        if (size <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue2 = numValueOf.intValue();
            printableTextA = com.avito.android.printable_text.b.b(R.plurals.advert_details_hotel_guest_filter_title, iIntValue2, Integer.valueOf(iIntValue2));
        } else {
            printableTextA = com.avito.android.printable_text.b.a();
        }
        return new HotelOfferFilter(R.attr.baseSelectDefaultM, printableTextC, printableTextA, e(hotelOfferRequestParams));
    }

    public static NewGuestsSelectorDeepLink e(HotelOfferRequestParams hotelOfferRequestParams) {
        ArrayList arrayList;
        Integer minCount = hotelOfferRequestParams.f162640d.getMinCount();
        GuestFilter guestFilter = hotelOfferRequestParams.f162640d;
        Integer maxCount = guestFilter.getMaxCount();
        Integer maxAdultCount = guestFilter.getMaxAdultCount();
        Integer maxChildrenCount = guestFilter.getMaxChildrenCount();
        List<Integer> listD = guestFilter.d();
        if (listD != null) {
            List<Integer> list = listD;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        List<DI.a> list2 = DI.b.f3141a;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
        for (DI.a aVar : list2) {
            arrayList3.add(new AvailableAge(aVar.f3139a, aVar.f3140b));
        }
        String str = null;
        GuestsDetailed guestsDetailed = new GuestsDetailed(null, null, guestFilter.getAdultGuests(), arrayList2, null, 16, null);
        return new NewGuestsSelectorDeepLink(null, str, minCount, maxCount, maxAdultCount, maxChildrenCount, Boolean.TRUE, arrayList3, guestsDetailed, null, 515, null);
    }

    public static HotelActionButton.DeeplinkButton g(ButtonAction buttonAction) {
        PrintableText printableTextF = com.avito.android.printable_text.b.f(buttonAction.getTitle());
        DeepLink deeplink = buttonAction.getDeeplink();
        String style = buttonAction.getStyle();
        return new HotelActionButton.DeeplinkButton(printableTextF, style != null ? Integer.valueOf(com.avito.android.lib.util.f.d(style)) : null, buttonAction.isEnabled(), deeplink);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c9  */
    @Override // com.avito.android.advert.item.hotel.hotel_offer.q
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.advert.item.hotel.hotel_offer.HotelOfferState a(@Y61.k com.avito.android.advert.item.hotel.hotel_offer.HotelOfferState r31) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.hotel.hotel_offer.r.a(com.avito.android.advert.item.hotel.hotel_offer.HotelOfferState):com.avito.android.advert.item.hotel.hotel_offer.HotelOfferState");
    }

    public final CalendarLink b(HotelOfferRequestParams hotelOfferRequestParams) {
        String checkIn = hotelOfferRequestParams.f162639c.getCheckIn();
        SimpleDateFormat simpleDateFormat = this.f76193b;
        Date date = checkIn != null ? simpleDateFormat.parse(checkIn) : null;
        DateFilter dateFilter = hotelOfferRequestParams.f162639c;
        String checkOut = dateFilter.getCheckOut();
        Date date2 = checkOut != null ? simpleDateFormat.parse(checkOut) : null;
        return new CalendarLink(new CalendarLink.CalendarData(date2 != null ? date : null, date != null ? date2 : null, dateFilter.getTitle(), null, 8, null));
    }

    public final HotelOfferFilter c(HotelOfferRequestParams hotelOfferRequestParams) {
        PrintableText printableTextC;
        PrintableText printableTextC2 = com.avito.android.printable_text.b.c(R.string.advert_details_hotel_date_filter_placeholder, new Serializable[0]);
        String checkIn = hotelOfferRequestParams.f162639c.getCheckIn();
        SimpleDateFormat simpleDateFormat = this.f76193b;
        Date date = checkIn != null ? simpleDateFormat.parse(checkIn) : null;
        if (date == null) {
            printableTextC = com.avito.android.printable_text.b.a();
        } else {
            String checkOut = hotelOfferRequestParams.f162639c.getCheckOut();
            Date date2 = checkOut != null ? simpleDateFormat.parse(checkOut) : null;
            if (date2 == null) {
                printableTextC = com.avito.android.printable_text.b.a();
            } else {
                SimpleDateFormat simpleDateFormat2 = this.f76192a;
                printableTextC = com.avito.android.printable_text.b.c(R.string.advert_details_hotel_date_filter_title, C43066x.X(".", simpleDateFormat2.format(date)), C43066x.X(".", simpleDateFormat2.format(date2)));
            }
        }
        return new HotelOfferFilter(R.attr.baseSelectDefaultM, printableTextC2, printableTextC, b(hotelOfferRequestParams));
    }

    public final HotelActionButton f(HotelOfferRequestParams hotelOfferRequestParams, String str, boolean z12) {
        String checkIn = hotelOfferRequestParams.f162639c.getCheckIn();
        String checkOut = hotelOfferRequestParams.f162639c.getCheckOut();
        if (checkIn == null || checkOut == null) {
            return new HotelActionButton.DeeplinkButton(com.avito.android.printable_text.b.c(R.string.advert_details_hotel_search_offer_title, new Serializable[0]), Integer.valueOf(R.attr.buttonPayLarge), Boolean.TRUE, b(hotelOfferRequestParams));
        }
        GuestFilter guestFilter = hotelOfferRequestParams.f162640d;
        Integer adultGuests = guestFilter.getAdultGuests();
        int iIntValue = adultGuests != null ? adultGuests.intValue() : 0;
        List<Integer> listD = guestFilter.d();
        int size = iIntValue + (listD != null ? listD.size() : 0);
        Integer minCount = guestFilter.getMinCount();
        if (size < (minCount != null ? minCount.intValue() : 0)) {
            return new HotelActionButton.DeeplinkButton(com.avito.android.printable_text.b.c(R.string.advert_details_hotel_search_offer_title, new Serializable[0]), Integer.valueOf(R.attr.buttonPayLarge), Boolean.TRUE, e(hotelOfferRequestParams));
        }
        if (!z12) {
            return new HotelActionButton.SearchButton(com.avito.android.printable_text.b.c(R.string.advert_details_hotel_search_offer_title, new Serializable[0]), R.attr.buttonPayLarge, Boolean.TRUE);
        }
        Integer adultGuests2 = guestFilter.getAdultGuests();
        return new HotelActionButton.DeeplinkButton(com.avito.android.printable_text.b.c(R.string.advert_details_hotel_search_offer_title, new Serializable[0]), Integer.valueOf(R.attr.buttonPayLarge), Boolean.TRUE, new AvailableHotelRoomsDeeplink(new AvailableHotelRoomsDeeplink.AvailableHotelRoomsData(hotelOfferRequestParams.f162638b, checkIn, checkOut, adultGuests2 != null ? adultGuests2.intValue() : 2, str, guestFilter.d())));
    }
}
