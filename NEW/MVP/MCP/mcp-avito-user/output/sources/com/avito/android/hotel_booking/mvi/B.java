package com.avito.android.hotel_booking.mvi;

import RI.a;
import com.avito.android.R;
import com.avito.android.hotel.model.BookButton;
import com.avito.android.hotel.model.HotelBookingFormItem;
import com.avito.android.hotel.model.HotelBookingFormResponse;
import com.avito.android.hotel.model.HotelBookingInfo;
import com.avito.android.hotel_booking.mvi.entity.HotelBookingState;
import com.avito.android.hotel_booking.mvi.entity.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: HotelBookingViewStateBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/B;", "Lcom/avito/android/hotel_booking/mvi/A;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class B implements A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.hotel_booking.konveyor.c f163818a;

    /* compiled from: HotelBookingViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[HotelBookingState.LoadingState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                HotelBookingState.LoadingState loadingState = HotelBookingState.LoadingState.f163881b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                HotelBookingState.LoadingState loadingState2 = HotelBookingState.LoadingState.f163881b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public B(@Y61.k com.avito.android.hotel_booking.konveyor.c cVar) {
        this.f163818a = cVar;
    }

    @Override // com.avito.android.hotel_booking.mvi.A
    @Y61.k
    public final HotelBookingState a(@Y61.k HotelBookingState hotelBookingState) {
        com.avito.android.hotel_booking.mvi.entity.a aVarB;
        HotelBookingInfo info;
        BookButton bookButton;
        String title;
        HotelBookingInfo info2;
        BookButton bookButton2;
        String style;
        HotelBookingInfo info3;
        HotelBookingInfo info4;
        int iOrdinal = hotelBookingState.f163878l.ordinal();
        if (iOrdinal == 0) {
            aVarB = hotelBookingState.f163876j instanceof a.C0947a ? b(hotelBookingState) : a.b.f163888a;
        } else if (iOrdinal == 1) {
            aVarB = b(hotelBookingState);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVarB = new a.C4801a(com.avito.android.printable_text.b.c(R.string.hotel_booking_network_error_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.hotel_booking_network_error_description, new Serializable[0]));
        }
        HotelBookingState hotelBookingStateA = HotelBookingState.a(hotelBookingState, null, null, null, null, null, null, null, null, null, false, null, aVarB, null, 6143);
        HotelBookingFormResponse.Form form = hotelBookingStateA.f163875i;
        AttributedText description = null;
        AttributedText price = (form == null || (info4 = form.getInfo()) == null) ? null : info4.getPrice();
        if (form != null && (info3 = form.getInfo()) != null) {
            description = info3.getDescription();
        }
        AttributedText attributedText = description;
        int iD2 = (form == null || (info2 = form.getInfo()) == null || (bookButton2 = info2.getBookButton()) == null || (style = bookButton2.getStyle()) == null) ? R.attr.buttonPayMedium : com.avito.android.lib.util.f.d(style);
        PrintableText printableTextC = (form == null || (info = form.getInfo()) == null || (bookButton = info.getBookButton()) == null || (title = bookButton.getTitle()) == null) ? com.avito.android.printable_text.b.c(R.string.hotel_booking_finish_text, new Serializable[0]) : com.avito.android.printable_text.b.f(title);
        boolean z12 = !hotelBookingStateA.f163877k && (hotelBookingStateA.f163879m instanceof a.c);
        boolean z13 = price == null && attributedText == null;
        hotelBookingStateA.f163880n.getClass();
        return HotelBookingState.a(hotelBookingStateA, null, null, null, null, null, null, null, null, null, false, null, null, new RI.c(price, attributedText, iD2, printableTextC, z12, z13), 4095);
    }

    public final com.avito.android.hotel_booking.mvi.entity.a b(HotelBookingState hotelBookingState) {
        RI.a aVar = hotelBookingState.f163876j;
        if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            String str = bVar.f14264a;
            PrintableText printableTextF = str != null ? com.avito.android.printable_text.b.f(str) : com.avito.android.printable_text.b.c(R.string.hotel_booking_network_error_title, new Serializable[0]);
            String str2 = bVar.f14265b;
            return new a.d(printableTextF, str2 != null ? com.avito.android.printable_text.b.f(str2) : com.avito.android.printable_text.b.c(R.string.hotel_booking_network_error_description, new Serializable[0]), bVar.f14266c);
        }
        if (!(aVar instanceof a.C0947a)) {
            return new a.C4801a(com.avito.android.printable_text.b.c(R.string.hotel_booking_network_error_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.hotel_booking_network_error_description, new Serializable[0]));
        }
        HotelBookingFormResponse.Form form = hotelBookingState.f163875i;
        List<HotelBookingFormItem> items = form != null ? form.getItems() : null;
        if (items == null) {
            items = C42784z0.f406748b;
        }
        return new a.c(this.f163818a.a(items), hotelBookingState.f163878l == HotelBookingState.LoadingState.f163881b);
    }
}
