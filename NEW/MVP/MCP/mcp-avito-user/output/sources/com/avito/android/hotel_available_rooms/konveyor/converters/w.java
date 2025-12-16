package com.avito.android.hotel_available_rooms.konveyor.converters;

import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.hotel.model.Amenities;
import com.avito.android.hotel_available_rooms.domain.models.HotelBookingItem;
import com.avito.android.hotel_available_rooms.domain.models.HotelRoom;
import com.avito.android.hotel_available_rooms.konveyor.amenity.HotelRoomAmenityItem;
import com.avito.android.hotel_available_rooms.konveyor.booking.HotelRoomBookingItem;
import com.avito.android.hotel_available_rooms.konveyor.gallery.HotelRoomGalleryItem;
import com.avito.android.hotel_available_rooms.konveyor.gap.HotelRoomGapItem;
import com.avito.android.hotel_available_rooms.konveyor.more.HotelRoomMoreItem;
import com.avito.android.hotel_available_rooms.konveyor.text.HotelRoomTextItem;
import com.avito.android.hotel_available_rooms.konveyor.text.TextData;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import lE.C43624b;

/* compiled from: HotelRoomItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/converters/w;", "Lcom/avito/android/hotel_available_rooms/konveyor/converters/v;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q f162901a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final q f162902b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43624b f162903c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.hotel_available_rooms.konveyor.gallery.k f162904d;

    @Inject
    public w(@Y61.k @com.avito.android.hotel_available_rooms.di.q q qVar, @com.avito.android.hotel_available_rooms.di.r @Y61.k q qVar2, @Y61.k C43624b c43624b, @Y61.k com.avito.android.hotel_available_rooms.konveyor.gallery.k kVar) {
        this.f162901a = qVar;
        this.f162902b = qVar2;
        this.f162903c = c43624b;
        this.f162904d = kVar;
    }

    public static HotelRoomGapItem b(int i12) {
        return new HotelRoomGapItem(AK.c.g(i12, "hotel_room_gap_item"), i12);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.converters.v
    @Y61.k
    public final ArrayList a(@Y61.k Map map, @Y61.k Set set, @Y61.k HotelRoom hotelRoom) {
        List<HotelBookingItem> listE0;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder("hotel_room_gallery_item");
        String str = hotelRoom.f162802b;
        sb2.append(str);
        String string = sb2.toString();
        C43624b c43624b = this.f162903c;
        c43624b.getClass();
        kotlin.reflect.n<Object> nVar = C43624b.f413639o[12];
        boolean zBooleanValue = ((Boolean) c43624b.f413652n.a().invoke()).booleanValue();
        List<Image> list = hotelRoom.f162803c;
        arrayList.add(new HotelRoomGalleryItem(string, str, zBooleanValue ? this.f162902b.a(str, list) : this.f162901a.a(str, list), this.f162904d.a(str), (Integer) map.get(str)));
        DeepLink deepLink = hotelRoom.f162808h;
        String str2 = hotelRoom.f162804d;
        if (str2 != null) {
            arrayList.add(b(14));
            arrayList.add(new HotelRoomTextItem("hotel_room_text_item", new TextData.SimpleTextData(com.avito.android.printable_text.b.f(str2), R.attr.textH25, deepLink)));
        }
        int i12 = 0;
        ArrayList<Amenities.Amenity> arrayList2 = hotelRoom.f162805e;
        if (arrayList2 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Amenities.Amenity amenity : arrayList2) {
                String title = amenity.getTitle();
                if (title == null || C43066x.K(title)) {
                    title = null;
                }
                HotelRoomAmenityItem hotelRoomAmenityItem = title == null ? null : new HotelRoomAmenityItem("hotel_room_amenity_item", amenity.getIcon(), title, deepLink);
                if (hotelRoomAmenityItem != null) {
                    arrayList3.add(hotelRoomAmenityItem);
                }
            }
            Iterator it = arrayList3.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                TV0.a aVar = (TV0.a) next;
                arrayList.add(i13 == 0 ? b(8) : b(2));
                arrayList.add(aVar);
                i13 = i14;
            }
        }
        AttributedText attributedText = hotelRoom.f162806f;
        if (attributedText != null) {
            arrayList.add(b(8));
            arrayList.add(new HotelRoomTextItem("hotel_room_attributed_text_item", new TextData.AttributedTextData(attributedText, deepLink)));
        }
        ArrayList arrayList4 = hotelRoom.f162809i;
        int size = arrayList4 != null ? arrayList4.size() : 0;
        Integer num = hotelRoom.f162807g;
        int iIntValue = num != null ? num.intValue() : size;
        String str3 = hotelRoom.f162802b;
        boolean z12 = set.contains(str3) || size <= iIntValue;
        if (!z12) {
            size = iIntValue;
        }
        if (arrayList4 != null && (listE0 = C42745f0.E0(arrayList4, size)) != null) {
            ArrayList arrayList5 = new ArrayList();
            for (HotelBookingItem hotelBookingItem : listE0) {
                ButtonAction buttonAction = hotelBookingItem.f162789f;
                HotelRoomBookingItem hotelRoomBookingItem = buttonAction == null ? null : new HotelRoomBookingItem("hotel_room_booking_item", hotelBookingItem.f162788e, hotelBookingItem.f162785b, hotelBookingItem.f162786c, hotelBookingItem.f162787d, buttonAction, hotelBookingItem.f162790g);
                if (hotelRoomBookingItem != null) {
                    arrayList5.add(hotelRoomBookingItem);
                }
            }
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i15 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                TV0.a aVar2 = (TV0.a) next2;
                arrayList.add(i12 == 0 ? b(20) : b(16));
                arrayList.add(aVar2);
                i12 = i15;
            }
        }
        if (!z12 && O2.a(arrayList4)) {
            arrayList.add(b(22));
            arrayList.add(new HotelRoomMoreItem("hotel_room_more_item", str3));
        }
        return arrayList;
    }
}
