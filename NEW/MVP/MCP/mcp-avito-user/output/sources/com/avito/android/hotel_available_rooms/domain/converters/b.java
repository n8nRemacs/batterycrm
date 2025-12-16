package com.avito.android.hotel_available_rooms.domain.converters;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.hotel.model.Amenities;
import com.avito.android.hotel_available_rooms.domain.models.HotelBookingDiscount;
import com.avito.android.hotel_available_rooms.domain.models.HotelBookingInstallments;
import com.avito.android.hotel_available_rooms.domain.models.HotelBookingItem;
import com.avito.android.hotel_available_rooms.domain.models.HotelItem;
import com.avito.android.hotel_available_rooms.domain.models.HotelRoom;
import com.avito.android.hotel_available_rooms.domain.models.PromoWidget;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35787f0;
import eJ.C40009a;
import eJ.C40011c;
import eJ.C40012d;
import eJ.h;
import eJ.m;
import eJ.n;
import eJ.o;
import eJ.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: HotelItemsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/domain/converters/b;", "Lcom/avito/android/hotel_available_rooms/domain/converters/a;", "<init>", "()V", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    public static UniversalColor b(C40011c c40011c) {
        String valueName = c40011c.getValueName();
        Integer numA = C35787f0.a(c40011c.getValueDark());
        Color color = numA != null ? new Color(numA.intValue()) : null;
        Integer numA2 = C35787f0.a(c40011c.getValue());
        return new UniversalColor(valueName, color, numA2 != null ? new Color(numA2.intValue()) : null);
    }

    @Override // com.avito.android.hotel_available_rooms.domain.converters.a
    @k
    public final HotelItem a(@k n nVar) {
        ArrayList arrayList;
        DeepLink deepLink;
        ArrayList arrayList2;
        Iterator it;
        DeepLink deepLink2;
        HotelBookingInstallments hotelBookingInstallments;
        HotelBookingDiscount hotelBookingDiscount;
        HotelBookingDiscount hotelBookingDiscount2;
        HotelBookingInstallments.Part part;
        HotelBookingInstallments.Part part2;
        if (!(nVar instanceof n.a)) {
            if (!(nVar instanceof n.b)) {
                throw new NoWhenBranchMatchedException();
            }
            n.b bVar = (n.b) nVar;
            C40011c background = bVar.getBackground();
            UniversalColor universalColorB = background != null ? b(background) : null;
            AttributedText description = bVar.getDescription();
            p image = bVar.getImage();
            UniversalImage universalImage = image != null ? new UniversalImage(image.getValue(), image.getValueDark()) : null;
            o action = bVar.getAction();
            ButtonAction buttonAction = action != null ? new ButtonAction(action.getTitle(), action.getUri(), action.getStyle(), Boolean.TRUE) : null;
            eJ.f onShowEvent = bVar.getOnShowEvent();
            return new PromoWidget(universalColorB, description, universalImage, bVar.getTitle(), buttonAction, onShowEvent != null ? new ParametrizedEvent((int) onShowEvent.getId(), (int) onShowEvent.getVersion(), onShowEvent.b()) : null);
        }
        n.a aVar = (n.a) nVar;
        String id2 = aVar.getId();
        List<Image> listD = aVar.d();
        String title = aVar.getTitle();
        List<C40009a> listA = aVar.a();
        if (listA != null) {
            List<C40009a> list = listA;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (C40009a c40009a : list) {
                arrayList.add(new Amenities.Amenity(null, c40009a.getTitle(), null, c40009a.getIcon()));
            }
        } else {
            arrayList = null;
        }
        AttributedText moreButton = aVar.getMoreButton();
        Integer numValueOf = Integer.valueOf((int) aVar.getLimit());
        DeepLink roomInfoDeeplink = aVar.getRoomInfoDeeplink();
        List<C40012d> listB = aVar.b();
        if (listB != null) {
            List<C40012d> list2 = listB;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C40012d c40012d = (C40012d) it2.next();
                AttributedText price = c40012d.getPrice();
                List<String> listF = c40012d.f();
                eJ.k installments = c40012d.getInstallments();
                if (installments != null) {
                    DeepLink deepLink3 = installments.getDeepLink();
                    m leftPart = installments.getEntryPoint().getLeftPart();
                    if (leftPart != null) {
                        it = it2;
                        AttributedText attributedText = leftPart.getAttributedText();
                        HotelBookingInstallments.HighlightType.a aVar2 = HotelBookingInstallments.HighlightType.f162780b;
                        String highlightType = leftPart.getHighlightType();
                        aVar2.getClass();
                        part = new HotelBookingInstallments.Part(attributedText, HotelBookingInstallments.HighlightType.a.a(highlightType));
                    } else {
                        it = it2;
                        part = null;
                    }
                    m rightPart = installments.getEntryPoint().getRightPart();
                    if (rightPart != null) {
                        deepLink2 = roomInfoDeeplink;
                        AttributedText attributedText2 = rightPart.getAttributedText();
                        HotelBookingInstallments.HighlightType.a aVar3 = HotelBookingInstallments.HighlightType.f162780b;
                        String highlightType2 = rightPart.getHighlightType();
                        aVar3.getClass();
                        part2 = new HotelBookingInstallments.Part(attributedText2, HotelBookingInstallments.HighlightType.a.a(highlightType2));
                    } else {
                        deepLink2 = roomInfoDeeplink;
                        part2 = null;
                    }
                    Long textPartsSpacing = installments.getEntryPoint().getTextPartsSpacing();
                    hotelBookingInstallments = new HotelBookingInstallments(deepLink3, part, part2, textPartsSpacing != null ? Integer.valueOf((int) textPartsSpacing.longValue()) : null);
                } else {
                    it = it2;
                    deepLink2 = roomInfoDeeplink;
                    hotelBookingInstallments = null;
                }
                AttributedText details = c40012d.getDetails();
                h discount = c40012d.getDiscount();
                if (discount != null) {
                    AttributedText originalPrice = discount.getOriginalPrice();
                    if (originalPrice == null) {
                        hotelBookingDiscount2 = null;
                    } else {
                        AttributedText percent = discount.getPercent();
                        C40011c percentBackgroundColor = discount.getPercentBackgroundColor();
                        hotelBookingDiscount2 = new HotelBookingDiscount(originalPrice, percent, percentBackgroundColor != null ? b(percentBackgroundColor) : null);
                    }
                    hotelBookingDiscount = hotelBookingDiscount2;
                } else {
                    hotelBookingDiscount = null;
                }
                arrayList3.add(new HotelBookingItem(price, details, hotelBookingInstallments, listF, new ButtonAction(c40012d.getButton().getTitle(), c40012d.getButton().getUri(), c40012d.getButton().getStyle(), Boolean.TRUE), hotelBookingDiscount));
                it2 = it;
                roomInfoDeeplink = deepLink2;
            }
            deepLink = roomInfoDeeplink;
            arrayList2 = arrayList3;
        } else {
            deepLink = roomInfoDeeplink;
            arrayList2 = null;
        }
        return new HotelRoom(id2, listD, title, arrayList, moreButton, numValueOf, deepLink, arrayList2);
    }
}
