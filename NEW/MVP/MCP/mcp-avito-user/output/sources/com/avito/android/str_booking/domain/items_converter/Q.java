package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.str_booking.network.models.sections.TermsContent;
import com.avito.android.str_booking.network.models.sections.TermsItem;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingTermsDetailsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/domain/items_converter/Q;", "Lcom/avito/android/str_booking/domain/items_converter/P;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Q implements P {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f285625a;

    @Inject
    public Q(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f285625a = interfaceC35863o4;
    }

    @Override // com.avito.android.str_booking.domain.items_converter.P
    @Y61.k
    public final List<com.avito.conveyor_item.a> a(@Y61.l TermsContent termsContent) {
        ArrayList arrayList;
        List<TermsItem> listC;
        if (termsContent == null || (listC = termsContent.c()) == null) {
            arrayList = null;
        } else {
            List<TermsItem> list = listC;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (TermsItem termsItem : list) {
                arrayList.add(new com.avito.android.str_booking.ui.payment_details.terms.c(termsItem.getTitle(), termsItem.getValue(), termsItem.getSubtitle(), termsItem.getHint(), this.f285625a.a()));
            }
        }
        return arrayList == null ? C42784z0.f406748b : arrayList;
    }
}
