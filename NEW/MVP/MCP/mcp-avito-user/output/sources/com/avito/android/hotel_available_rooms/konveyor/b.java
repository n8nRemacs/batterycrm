package com.avito.android.hotel_available_rooms.konveyor;

import android.net.Uri;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.hotel_available_rooms.konveyor.booking.HotelRoomBookingItem;
import com.avito.android.hotel_available_rooms.konveyor.filter.HotelRoomFilterItem;
import com.avito.android.hotel_available_rooms.konveyor.gallery.HotelRoomGalleryItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.ButtonAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: HotelRoomItemCallback.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/b;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends C23424o.f<TV0.a> {
    @Inject
    public b() {
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof HotelRoomGalleryItem) && (aVar4 instanceof HotelRoomGalleryItem)) {
            HotelRoomGalleryItem hotelRoomGalleryItem = (HotelRoomGalleryItem) aVar3;
            HotelRoomGalleryItem hotelRoomGalleryItem2 = (HotelRoomGalleryItem) aVar4;
            if (!L.f(hotelRoomGalleryItem.f162925b, hotelRoomGalleryItem2.f162925b) || !L.f(hotelRoomGalleryItem.f162926c, hotelRoomGalleryItem2.f162926c) || !L.f(hotelRoomGalleryItem.f162927d, hotelRoomGalleryItem2.f162927d) || !L.f(hotelRoomGalleryItem.f162929f, hotelRoomGalleryItem2.f162929f)) {
                return false;
            }
        } else {
            if (!(aVar3 instanceof HotelRoomBookingItem) || !(aVar4 instanceof HotelRoomBookingItem)) {
                return aVar3.equals(aVar4);
            }
            HotelRoomBookingItem hotelRoomBookingItem = (HotelRoomBookingItem) aVar3;
            HotelRoomBookingItem hotelRoomBookingItem2 = (HotelRoomBookingItem) aVar4;
            if (!L.f(hotelRoomBookingItem.f162850b, hotelRoomBookingItem2.f162850b) || !L.f(hotelRoomBookingItem.f162851c, hotelRoomBookingItem2.f162851c) || !L.f(hotelRoomBookingItem.f162852d, hotelRoomBookingItem2.f162852d)) {
                return false;
            }
            ButtonAction buttonAction = hotelRoomBookingItem.f162855g;
            String title = buttonAction.getTitle();
            ButtonAction buttonAction2 = hotelRoomBookingItem2.f162855g;
            if (!L.f(title, buttonAction2.getTitle()) || !L.f(buttonAction.isEnabled(), buttonAction2.isEnabled()) || !L.f(buttonAction.getStyle(), buttonAction2.getStyle())) {
                return false;
            }
            DeepLink deeplink = buttonAction.getDeeplink();
            Uri uri = deeplink != null ? deeplink.getUri() : null;
            DeepLink deeplink2 = buttonAction2.getDeeplink();
            if (!L.f(uri, deeplink2 != null ? deeplink2.getUri() : null)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF83558b() == aVar4.getF83558b() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        Object dVar;
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof HotelRoomFilterItem) && (aVar4 instanceof HotelRoomFilterItem)) {
            PrintableText printableText = ((HotelRoomFilterItem) aVar3).f162910c;
            PrintableText printableText2 = ((HotelRoomFilterItem) aVar4).f162910c;
            if (L.f(printableText2, printableText)) {
                printableText2 = null;
            }
            dVar = new com.avito.android.hotel_available_rooms.konveyor.filter.c(printableText2);
            if (printableText2 == null) {
                return null;
            }
        } else {
            if (!(aVar3 instanceof HotelRoomGalleryItem) || !(aVar4 instanceof HotelRoomGalleryItem)) {
                return null;
            }
            Integer num = ((HotelRoomGalleryItem) aVar4).f162929f;
            if (num == null || num.equals(((HotelRoomGalleryItem) aVar3).f162929f)) {
                num = null;
            }
            dVar = new com.avito.android.hotel_available_rooms.konveyor.gallery.d(num);
            if (num == null) {
                return null;
            }
        }
        return dVar;
    }
}
