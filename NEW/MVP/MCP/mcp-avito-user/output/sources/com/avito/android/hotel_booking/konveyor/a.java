package com.avito.android.hotel_booking.konveyor;

import Y61.k;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.hotel.model.HotelBookingRadioGroupItem;
import com.avito.android.hotel_booking.konveyor.input.BookingFormInputState;
import com.avito.android.hotel_booking.konveyor.radiogroup.d;
import com.avito.android.hotel_booking.konveyor.select.BookingFormSelectState;
import com.avito.android.hotel_booking.konveyor.text.BookingFormTextItem;
import com.avito.android.hotel_booking.konveyor.text.g;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.travel_payment_methods.items.loan_terms.LoanTermsItem;
import com.avito.android.travel_payment_methods.items.loan_terms.h;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormDiffUtilCallback.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/a;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends C23424o.f<TV0.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f163617a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.hotel_booking.konveyor.radiogroup.e f163618b;

    @Inject
    public a(@k h hVar, @k com.avito.android.hotel_booking.konveyor.radiogroup.e eVar) {
        this.f163617a = hVar;
        this.f163618b = eVar;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF113526b() == aVar4.getF113526b() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        Object dVar;
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof com.avito.android.hotel_booking.konveyor.input.c) && (aVar4 instanceof com.avito.android.hotel_booking.konveyor.input.c)) {
            com.avito.android.hotel_booking.konveyor.input.c cVar = (com.avito.android.hotel_booking.konveyor.input.c) aVar4;
            com.avito.android.hotel_booking.konveyor.input.c cVar2 = (com.avito.android.hotel_booking.konveyor.input.c) aVar3;
            String str = cVar2.f163672c;
            String str2 = cVar.f163672c;
            if (L.f(str, str2)) {
                str2 = null;
            }
            String str3 = cVar2.f163674e;
            String str4 = cVar.f163674e;
            if (L.f(str3, str4)) {
                str4 = null;
            }
            BookingFormInputState bookingFormInputState = cVar2.f163676g;
            BookingFormInputState bookingFormInputState2 = cVar.f163676g;
            if (L.f(bookingFormInputState, bookingFormInputState2)) {
                bookingFormInputState2 = null;
            }
            boolean z12 = cVar.f163673d;
            Boolean boolValueOf = Boolean.valueOf(z12);
            if (cVar2.f163673d == z12) {
                boolValueOf = null;
            }
            dVar = new com.avito.android.hotel_booking.konveyor.input.d(str2, str4, bookingFormInputState2, boolValueOf);
            if (str2 == null && str4 == null && bookingFormInputState2 == null && boolValueOf == null) {
                return null;
            }
        } else if ((aVar3 instanceof com.avito.android.hotel_booking.konveyor.select.c) && (aVar4 instanceof com.avito.android.hotel_booking.konveyor.select.c)) {
            com.avito.android.hotel_booking.konveyor.select.c cVar3 = (com.avito.android.hotel_booking.konveyor.select.c) aVar4;
            com.avito.android.hotel_booking.konveyor.select.c cVar4 = (com.avito.android.hotel_booking.konveyor.select.c) aVar3;
            String str5 = cVar4.f163762f;
            String str6 = cVar3.f163762f;
            if (L.f(str5, str6)) {
                str6 = null;
            }
            String str7 = cVar4.f163761e;
            String str8 = cVar3.f163761e;
            if (L.f(str7, str8)) {
                str8 = null;
            }
            BookingFormSelectState bookingFormSelectState = cVar4.f163760d;
            BookingFormSelectState bookingFormSelectState2 = cVar3.f163760d;
            if (L.f(bookingFormSelectState, bookingFormSelectState2)) {
                bookingFormSelectState2 = null;
            }
            boolean z13 = cVar3.f163759c;
            Boolean boolValueOf2 = Boolean.valueOf(z13);
            if (cVar4.f163759c == z13) {
                boolValueOf2 = null;
            }
            dVar = new com.avito.android.hotel_booking.konveyor.select.d(str6, str8, bookingFormSelectState2, boolValueOf2);
            if (str6 == null && str8 == null && bookingFormSelectState2 == null && boolValueOf2 == null) {
                return null;
            }
        } else if ((aVar3 instanceof com.avito.android.hotel_booking.konveyor.checkbox.c) && (aVar4 instanceof com.avito.android.hotel_booking.konveyor.checkbox.c)) {
            com.avito.android.hotel_booking.konveyor.checkbox.c cVar5 = (com.avito.android.hotel_booking.konveyor.checkbox.c) aVar4;
            boolean z14 = cVar5.f163632c;
            Boolean boolValueOf3 = Boolean.valueOf(z14);
            com.avito.android.hotel_booking.konveyor.checkbox.c cVar6 = (com.avito.android.hotel_booking.konveyor.checkbox.c) aVar3;
            if (cVar6.f163632c == z14) {
                boolValueOf3 = null;
            }
            boolean z15 = cVar5.f163633d;
            Boolean boolValueOf4 = Boolean.valueOf(z15);
            if (cVar6.f163633d == z15) {
                boolValueOf4 = null;
            }
            String str9 = cVar6.f163634e;
            String str10 = cVar5.f163634e;
            if (L.f(str9, str10)) {
                str10 = null;
            }
            String str11 = cVar6.f163635f;
            String str12 = cVar5.f163635f;
            if (L.f(str11, str12)) {
                str12 = null;
            }
            dVar = new com.avito.android.hotel_booking.konveyor.checkbox.d(boolValueOf3, boolValueOf4, str10, str12);
            if (boolValueOf3 == null && boolValueOf4 == null && str10 == null && str12 == null) {
                return null;
            }
        } else if ((aVar3 instanceof BookingFormTextItem) && (aVar4 instanceof BookingFormTextItem)) {
            BookingFormTextItem bookingFormTextItem = (BookingFormTextItem) aVar4;
            BookingFormTextItem bookingFormTextItem2 = (BookingFormTextItem) aVar3;
            AttributedText attributedText = bookingFormTextItem2.f163784c;
            AttributedText attributedText2 = bookingFormTextItem.f163784c;
            if (L.f(attributedText, attributedText2)) {
                attributedText2 = null;
            }
            int i12 = bookingFormTextItem.f163785d;
            Integer numValueOf = Integer.valueOf(i12);
            if (bookingFormTextItem2.f163785d == i12) {
                numValueOf = null;
            }
            dVar = new g(attributedText2, numValueOf);
            if (attributedText2 == null && numValueOf == null) {
                return null;
            }
        } else {
            if (!(aVar3 instanceof com.avito.android.hotel_booking.konveyor.dotted_text.c) || !(aVar4 instanceof com.avito.android.hotel_booking.konveyor.dotted_text.c)) {
                if ((aVar3 instanceof com.avito.android.hotel_booking.konveyor.installments.c) && (aVar4 instanceof com.avito.android.hotel_booking.konveyor.installments.c)) {
                    LoanTermsItem loanTermsItem = ((com.avito.android.hotel_booking.konveyor.installments.c) aVar3).f163704c;
                    LoanTermsItem loanTermsItem2 = ((com.avito.android.hotel_booking.konveyor.installments.c) aVar4).f163704c;
                    this.f163617a.getClass();
                    return h.a(loanTermsItem, loanTermsItem2);
                }
                if (!(aVar3 instanceof com.avito.android.hotel_booking.konveyor.radiogroup.c) || !(aVar4 instanceof com.avito.android.hotel_booking.konveyor.radiogroup.c)) {
                    return null;
                }
                com.avito.android.hotel_booking.konveyor.radiogroup.c cVar7 = (com.avito.android.hotel_booking.konveyor.radiogroup.c) aVar3;
                com.avito.android.hotel_booking.konveyor.radiogroup.c cVar8 = (com.avito.android.hotel_booking.konveyor.radiogroup.c) aVar4;
                this.f163618b.getClass();
                ArrayList arrayList = new ArrayList();
                AttributedText attributedText3 = cVar8.f163730d;
                boolean zF2 = L.f(attributedText3, cVar7.f163730d);
                boolean z16 = cVar8.f163732f;
                if (!zF2 || z16 != cVar7.f163732f) {
                    arrayList.add(new d.C4797d(attributedText3, z16));
                }
                AttributedText attributedText4 = cVar7.f163731e;
                AttributedText attributedText5 = cVar8.f163731e;
                if (!L.f(attributedText5, attributedText4)) {
                    arrayList.add(new d.a(attributedText5));
                }
                HotelBookingRadioGroupItem.OptionIcon optionIcon = cVar7.f163733g;
                HotelBookingRadioGroupItem.OptionIcon optionIcon2 = cVar8.f163733g;
                if (!L.f(optionIcon2, optionIcon)) {
                    arrayList.add(new d.b(optionIcon2));
                }
                boolean z17 = cVar7.f163734h;
                boolean z18 = cVar8.f163734h;
                if (z18 != z17) {
                    arrayList.add(new d.c(z18));
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return arrayList;
            }
            com.avito.android.hotel_booking.konveyor.dotted_text.c cVar9 = (com.avito.android.hotel_booking.konveyor.dotted_text.c) aVar4;
            com.avito.android.hotel_booking.konveyor.dotted_text.c cVar10 = (com.avito.android.hotel_booking.konveyor.dotted_text.c) aVar3;
            AttributedText attributedText6 = cVar10.f163654d;
            AttributedText attributedText7 = cVar9.f163654d;
            if (L.f(attributedText6, attributedText7)) {
                attributedText7 = null;
            }
            AttributedText attributedText8 = cVar10.f163655e;
            AttributedText attributedText9 = cVar9.f163655e;
            if (L.f(attributedText8, attributedText9)) {
                attributedText9 = null;
            }
            dVar = new com.avito.android.hotel_booking.konveyor.dotted_text.d(attributedText7, attributedText9);
            if (attributedText7 == null && attributedText9 == null) {
                return null;
            }
        }
        return dVar;
    }
}
