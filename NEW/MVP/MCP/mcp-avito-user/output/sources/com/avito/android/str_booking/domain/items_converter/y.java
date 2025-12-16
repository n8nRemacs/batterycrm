package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.str_booking.network.models.sections.InfoContent;
import com.avito.android.str_booking.network.models.sections.InfoSection;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrBookingInfoConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/domain/items_converter/y;", "Lcom/avito/android/str_booking/domain/items_converter/x;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class y implements x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f285665a;

    @Inject
    public y(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f285665a = interfaceC35863o4;
    }

    @Override // com.avito.android.str_booking.domain.items_converter.x
    @Y61.k
    public final com.avito.android.str_booking.ui.info.c a(@Y61.k InfoSection infoSection) {
        String strA;
        InfoContent content = infoSection.getContent();
        if (content == null || (strA = content.getHeader()) == null) {
            strA = this.f285665a.a();
        }
        return new com.avito.android.str_booking.ui.info.c(strA, infoSection.getContent());
    }
}
