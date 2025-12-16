package bw0;

import Y61.k;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.short_term_rent.bookingform.items.ItemAction;
import com.avito.android.short_term_rent.bookingform.items.booking_preview.BookingPreviewItem;
import com.avito.android.short_term_rent.bookingform.items.booking_preview.g;
import com.avito.android.short_term_rent.bookingform.items.dotted_text.DottedTextItem;
import com.avito.android.short_term_rent.bookingform.items.dotted_text.g;
import com.avito.android.short_term_rent.bookingform.items.dotted_text.h;
import com.avito.android.short_term_rent.bookingform.items.image_with_text.ImageWithTextItem;
import com.avito.android.short_term_rent.bookingform.items.image_with_text.h;
import com.avito.android.short_term_rent.bookingform.items.info_banner.InfoBannerItem;
import com.avito.android.short_term_rent.bookingform.items.info_banner.c;
import com.avito.android.short_term_rent.bookingform.items.input.FormInputItem;
import com.avito.android.short_term_rent.bookingform.items.input.FormInputState;
import com.avito.android.short_term_rent.bookingform.items.input.h;
import com.avito.android.short_term_rent.bookingform.items.select.FormSelectItem;
import com.avito.android.short_term_rent.bookingform.items.select.FormSelectState;
import com.avito.android.short_term_rent.bookingform.items.select.h;
import com.avito.android.short_term_rent.bookingform.items.text.FormTextItem;
import com.avito.android.short_term_rent.bookingform.items.text.h;
import com.avito.android.short_term_rent.bookingform.items.text.i;
import com.avito.android.short_term_rent.bookingform.items.toggle.ToggleOptionsItem;
import com.avito.android.short_term_rent.bookingform.items.toggle.g;
import com.avito.android.travel_payment_methods.items.loan_terms.LoanTermsItem;
import com.avito.android.travel_payment_methods.items.payment_method.PaymentMethodItem;
import com.avito.android.travel_payment_methods.items.payment_method.q;
import com.avito.android.travel_payment_methods.items.payment_method.r;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingFormDiffUtilCallback.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lbw0/d;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bw0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C25731d extends C23424o.f<TV0.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final i f57547a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.short_term_rent.bookingform.items.image_with_text.i f57548b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h f57549c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.short_term_rent.bookingform.items.booking_preview.h f57550d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.short_term_rent.bookingform.items.select.i f57551e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.short_term_rent.bookingform.items.input.i f57552f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.short_term_rent.bookingform.items.toggle.h f57553g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final r f57554h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.travel_payment_methods.items.loan_terms.h f57555i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.short_term_rent.bookingform.items.info_banner.d f57556j;

    @Inject
    public C25731d(@k i iVar, @k com.avito.android.short_term_rent.bookingform.items.image_with_text.i iVar2, @k h hVar, @k com.avito.android.short_term_rent.bookingform.items.booking_preview.h hVar2, @k com.avito.android.short_term_rent.bookingform.items.select.i iVar3, @k com.avito.android.short_term_rent.bookingform.items.input.i iVar4, @k com.avito.android.short_term_rent.bookingform.items.toggle.h hVar3, @k r rVar, @k com.avito.android.travel_payment_methods.items.loan_terms.h hVar4, @k com.avito.android.short_term_rent.bookingform.items.info_banner.d dVar) {
        this.f57547a = iVar;
        this.f57548b = iVar2;
        this.f57549c = hVar;
        this.f57550d = hVar2;
        this.f57551e = iVar3;
        this.f57552f = iVar4;
        this.f57553g = hVar3;
        this.f57554h = rVar;
        this.f57555i = hVar4;
        this.f57556j = dVar;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF282036b() == aVar4.getF282036b() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        ArrayList arrayList;
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof FormTextItem) && (aVar4 instanceof FormTextItem)) {
            FormTextItem formTextItem = (FormTextItem) aVar3;
            FormTextItem formTextItem2 = (FormTextItem) aVar4;
            this.f57547a.getClass();
            arrayList = new ArrayList();
            if (!L.f(formTextItem.f281671c, formTextItem2.f281671c)) {
                arrayList.add(new h.b());
            }
            ItemAction itemAction = formTextItem.f281672d;
            ItemAction itemAction2 = formTextItem2.f281672d;
            if (!L.f(itemAction, itemAction2)) {
                arrayList.add(new h.a(itemAction2));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
        } else if ((aVar3 instanceof ImageWithTextItem) && (aVar4 instanceof ImageWithTextItem)) {
            ImageWithTextItem imageWithTextItem = (ImageWithTextItem) aVar3;
            ImageWithTextItem imageWithTextItem2 = (ImageWithTextItem) aVar4;
            this.f57548b.getClass();
            arrayList = new ArrayList();
            UniversalImage universalImage = imageWithTextItem.f281503c;
            UniversalImage universalImage2 = imageWithTextItem2.f281503c;
            if (!L.f(universalImage, universalImage2)) {
                arrayList.add(new h.a(universalImage2));
            }
            AttributedText attributedText = imageWithTextItem.f281504d;
            AttributedText attributedText2 = imageWithTextItem2.f281504d;
            if (!L.f(attributedText, attributedText2)) {
                arrayList.add(new h.c(attributedText2));
            }
            ItemAction itemAction3 = imageWithTextItem.f281505e;
            ItemAction itemAction4 = imageWithTextItem2.f281505e;
            if (!L.f(itemAction3, itemAction4)) {
                arrayList.add(new h.b(itemAction4));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
        } else if ((aVar3 instanceof BookingPreviewItem) && (aVar4 instanceof BookingPreviewItem)) {
            BookingPreviewItem bookingPreviewItem = (BookingPreviewItem) aVar3;
            BookingPreviewItem bookingPreviewItem2 = (BookingPreviewItem) aVar4;
            this.f57550d.getClass();
            arrayList = new ArrayList();
            Image image = bookingPreviewItem.f281448c;
            Image image2 = bookingPreviewItem2.f281448c;
            if (!L.f(image, image2)) {
                arrayList.add(new g.a(image2));
            }
            AttributedText attributedText3 = bookingPreviewItem.f281449d;
            AttributedText attributedText4 = bookingPreviewItem2.f281449d;
            if (!L.f(attributedText3, attributedText4)) {
                arrayList.add(new g.c(attributedText4));
            }
            if (!L.f(bookingPreviewItem.f281450e, bookingPreviewItem2.f281450e)) {
                arrayList.add(new g.b());
            }
            if (arrayList.isEmpty()) {
                return null;
            }
        } else if ((aVar3 instanceof DottedTextItem) && (aVar4 instanceof DottedTextItem)) {
            DottedTextItem dottedTextItem = (DottedTextItem) aVar3;
            DottedTextItem dottedTextItem2 = (DottedTextItem) aVar4;
            this.f57549c.getClass();
            arrayList = new ArrayList();
            AttributedText attributedText5 = dottedTextItem.f281483c;
            AttributedText attributedText6 = dottedTextItem2.f281483c;
            if (!L.f(attributedText5, attributedText6)) {
                arrayList.add(new g.a(attributedText6));
            }
            AttributedText attributedText7 = dottedTextItem.f281484d;
            AttributedText attributedText8 = dottedTextItem2.f281484d;
            if (!L.f(attributedText7, attributedText8)) {
                arrayList.add(new g.b(attributedText8));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
        } else if ((aVar3 instanceof FormSelectItem) && (aVar4 instanceof FormSelectItem)) {
            FormSelectItem formSelectItem = (FormSelectItem) aVar3;
            FormSelectItem formSelectItem2 = (FormSelectItem) aVar4;
            this.f57551e.getClass();
            arrayList = new ArrayList();
            boolean z12 = formSelectItem.f281632c;
            boolean z13 = formSelectItem2.f281632c;
            if (z12 != z13) {
                arrayList.add(new h.a(z13));
            }
            String str = formSelectItem.f281633d;
            String str2 = formSelectItem2.f281633d;
            boolean zF2 = L.f(str, str2);
            String str3 = formSelectItem2.f281634e;
            if (!zF2 || !L.f(formSelectItem.f281634e, str3)) {
                arrayList.add(new h.d(str2, str3));
            }
            FormSelectState formSelectState = formSelectItem.f281635f;
            FormSelectState formSelectState2 = formSelectItem2.f281635f;
            if (!L.f(formSelectState, formSelectState2)) {
                arrayList.add(new h.c(formSelectState2));
            }
            ItemAction itemAction5 = formSelectItem.f281636g;
            ItemAction itemAction6 = formSelectItem2.f281636g;
            if (!L.f(itemAction5, itemAction6)) {
                arrayList.add(new h.b(itemAction6));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
        } else if ((aVar3 instanceof FormInputItem) && (aVar4 instanceof FormInputItem)) {
            FormInputItem formInputItem = (FormInputItem) aVar3;
            FormInputItem formInputItem2 = (FormInputItem) aVar4;
            this.f57552f.getClass();
            arrayList = new ArrayList();
            String str4 = formInputItem.f281541d;
            String str5 = formInputItem2.f281541d;
            if (!L.f(str4, str5)) {
                arrayList.add(new h.e(str5));
            }
            String str6 = formInputItem.f281542e;
            String str7 = formInputItem2.f281542e;
            if (!L.f(str6, str7)) {
                arrayList.add(new h.a(str7));
            }
            boolean z14 = formInputItem.f281546i;
            boolean z15 = formInputItem2.f281546i;
            if (z14 != z15) {
                arrayList.add(new h.b(z15));
            }
            FormInputState formInputState = formInputItem.f281547j;
            FormInputState formInputState2 = formInputItem2.f281547j;
            if (!L.f(formInputState, formInputState2)) {
                arrayList.add(new h.d(formInputState2));
            }
            Integer num = formInputItem.f281545h;
            Integer num2 = formInputItem2.f281545h;
            boolean zF3 = L.f(num, num2);
            Integer num3 = formInputItem2.f281544g;
            if (!zF3 || !L.f(formInputItem.f281544g, num3)) {
                arrayList.add(new h.c(num2, num3));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
        } else if ((aVar3 instanceof ToggleOptionsItem) && (aVar4 instanceof ToggleOptionsItem)) {
            ToggleOptionsItem toggleOptionsItem = (ToggleOptionsItem) aVar3;
            ToggleOptionsItem toggleOptionsItem2 = (ToggleOptionsItem) aVar4;
            this.f57553g.getClass();
            arrayList = new ArrayList();
            ArrayList arrayList2 = toggleOptionsItem.f281702e;
            ArrayList arrayList3 = toggleOptionsItem2.f281702e;
            if (!arrayList2.equals(arrayList3)) {
                arrayList.add(new g.a(arrayList3));
            }
            int i12 = toggleOptionsItem.f281703f;
            int i13 = toggleOptionsItem2.f281703f;
            if (i12 != i13) {
                arrayList.add(new g.b(i13));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
        } else if ((aVar3 instanceof PaymentMethodItem) && (aVar4 instanceof PaymentMethodItem)) {
            this.f57554h.getClass();
            arrayList = new ArrayList();
            if (((PaymentMethodItem) aVar3).f302517c.f302552d != ((PaymentMethodItem) aVar4).f302517c.f302552d) {
                arrayList.add(new q.a());
            }
            if (arrayList.isEmpty()) {
                return null;
            }
        } else {
            if ((aVar3 instanceof LoanTermsItem) && (aVar4 instanceof LoanTermsItem)) {
                this.f57555i.getClass();
                return com.avito.android.travel_payment_methods.items.loan_terms.h.a((LoanTermsItem) aVar3, (LoanTermsItem) aVar4);
            }
            if (!(aVar3 instanceof InfoBannerItem) || !(aVar4 instanceof InfoBannerItem)) {
                return null;
            }
            InfoBannerItem infoBannerItem = (InfoBannerItem) aVar3;
            InfoBannerItem infoBannerItem2 = (InfoBannerItem) aVar4;
            this.f57556j.getClass();
            arrayList = new ArrayList();
            AttributedText attributedText9 = infoBannerItem.f281527c;
            AttributedText attributedText10 = infoBannerItem2.f281527c;
            if (!L.f(attributedText9, attributedText10)) {
                arrayList.add(new c.b(attributedText10));
            }
            UniversalImage universalImage3 = infoBannerItem.f281528d;
            UniversalImage universalImage4 = infoBannerItem2.f281528d;
            if (!L.f(universalImage3, universalImage4)) {
                arrayList.add(new c.a(universalImage4));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
        }
        return arrayList;
    }
}
