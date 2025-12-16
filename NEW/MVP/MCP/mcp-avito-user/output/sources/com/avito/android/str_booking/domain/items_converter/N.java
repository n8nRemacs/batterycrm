package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.str_booking.network.di.StrBookingSectionType;
import com.avito.android.str_booking.network.models.sections.ScreenTitleContent;
import com.avito.android.str_booking.network.models.sections.ScreenTitleSection;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrBookingScreenTitleConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/domain/items_converter/N;", "Lcom/avito/android/str_booking/domain/items_converter/M;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class N implements M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f285623a;

    @Inject
    public N(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f285623a = interfaceC35863o4;
    }

    @Override // com.avito.android.str_booking.domain.items_converter.M
    @Y61.k
    public final com.avito.android.str_booking.ui.screen_title.c a(@Y61.k ScreenTitleSection screenTitleSection) {
        ScreenTitleContent content = screenTitleSection.getContent();
        StrBookingSectionType[] strBookingSectionTypeArr = StrBookingSectionType.f285853b;
        return new com.avito.android.str_booking.ui.screen_title.c(content);
    }
}
