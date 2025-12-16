package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_booking.network.di.StrBookingSectionType;
import com.avito.android.str_booking.network.models.sections.AdditionalInfo;
import com.avito.android.str_booking.network.models.sections.AdditionalInfoContent;
import com.avito.android.str_booking.network.models.sections.CalculationContent;
import com.avito.android.str_booking.network.models.sections.CalculationContentItem;
import com.avito.android.str_booking.network.models.sections.CalculationSection;
import com.avito.android.str_booking.network.models.sections.TermsInfo;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: StrBookingCalculationConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/domain/items_converter/m;", "Lcom/avito/android/str_booking/domain/items_converter/l;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.str_booking.domain.items_converter.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35073m implements InterfaceC35072l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final G f285634a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final P f285635b;

    @Inject
    public C35073m(@Y61.k G g12, @Y61.k P p12) {
        this.f285634a = g12;
        this.f285635b = p12;
    }

    @Override // com.avito.android.str_booking.domain.items_converter.InterfaceC35072l
    @Y61.k
    public final com.avito.android.str_booking.ui.calculation.d a(@Y61.k CalculationSection calculationSection) {
        com.avito.android.str_booking.ui.calculation.a aVar;
        AdditionalInfo additionalInfo;
        CalculationContent content = calculationSection.getContent();
        AdditionalInfoContent content2 = (content == null || (additionalInfo = content.getAdditionalInfo()) == null) ? null : additionalInfo.getContent();
        CalculationContent content3 = calculationSection.getContent();
        TermsInfo terms = content3 != null ? content3.getTerms() : null;
        CalculationContent content4 = calculationSection.getContent();
        String header = content4 != null ? content4.getHeader() : null;
        SuggestAnalyticsEvent onTapEvent = terms != null ? terms.getOnTapEvent() : null;
        CalculationContent content5 = calculationSection.getContent();
        List<CalculationContentItem> items = content5 != null ? content5.getItems() : null;
        com.avito.android.str_booking.ui.calculation.n nVar = terms != null ? new com.avito.android.str_booking.ui.calculation.n(terms.getTitle(), this.f285635b.a(terms.getContent())) : null;
        if (content2 != null) {
            String title = content2.getTitle();
            List<AttributedText> listE = content2.e();
            if (listE == null) {
                listE = C42784z0.f406748b;
            }
            aVar = new com.avito.android.str_booking.ui.calculation.a(title, listE, this.f285634a.a(content2));
        } else {
            aVar = null;
        }
        StrBookingSectionType[] strBookingSectionTypeArr = StrBookingSectionType.f285853b;
        CalculationContent content6 = calculationSection.getContent();
        String header2 = content6 != null ? content6.getHeader() : null;
        if (header2 == null) {
            header2 = "";
        }
        return new com.avito.android.str_booking.ui.calculation.d(header, onTapEvent, items, nVar, aVar, "calculation".concat(header2));
    }
}
