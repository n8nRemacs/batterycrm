package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.str_booking.network.models.sections.DetailsContent;
import com.avito.android.str_booking.network.models.sections.DetailsSection;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrBookingDetailsConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/domain/items_converter/s;", "Lcom/avito/android/str_booking/domain/items_converter/r;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.str_booking.domain.items_converter.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35078s implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f285662a;

    @Inject
    public C35078s(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f285662a = interfaceC35863o4;
    }

    @Override // com.avito.android.str_booking.domain.items_converter.r
    @Y61.k
    public final com.avito.android.str_booking.ui.details.c a(@Y61.k DetailsSection detailsSection) {
        String strA;
        DetailsContent content = detailsSection.getContent();
        if (content == null || (strA = content.getHeader()) == null) {
            strA = this.f285662a.a();
        }
        return new com.avito.android.str_booking.ui.details.c(strA, detailsSection.getContent());
    }
}
