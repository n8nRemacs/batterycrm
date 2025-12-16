package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_booking.network.models.sections.AdditionalInfoContent;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingPaymentDetailsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/domain/items_converter/H;", "Lcom/avito/android/str_booking/domain/items_converter/G;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class H implements G {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f285619a;

    @Inject
    public H(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f285619a = interfaceC35863o4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    @Override // com.avito.android.str_booking.domain.items_converter.G
    @Y61.k
    public final ArrayList a(@Y61.k AdditionalInfoContent additionalInfoContent) {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        List<List<AttributedText>> listC = additionalInfoContent.c();
        InterfaceC35863o4 interfaceC35863o4 = this.f285619a;
        if (listC != null) {
            List<List<AttributedText>> list = listC;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.avito.android.str_booking.ui.payment_details.table_row.c((List) it.next(), interfaceC35863o4.a()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = C42784z0.f406748b;
        }
        arrayList2.addAll((Collection) arrayList);
        List<AttributedText> listD = additionalInfoContent.d();
        List<AttributedText> list2 = listD;
        if (list2 != null && !list2.isEmpty()) {
            com.avito.android.str_booking.ui.payment_details.divider.c cVar = new com.avito.android.str_booking.ui.payment_details.divider.c(interfaceC35863o4.a());
            com.avito.android.str_booking.ui.payment_details.table_row.c cVar2 = new com.avito.android.str_booking.ui.payment_details.table_row.c(listD, interfaceC35863o4.a());
            arrayList2.add(cVar);
            arrayList2.add(cVar2);
        }
        return arrayList2;
    }
}
