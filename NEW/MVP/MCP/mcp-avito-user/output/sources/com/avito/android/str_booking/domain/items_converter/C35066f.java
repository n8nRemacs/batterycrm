package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.str_booking.network.di.StrBookingSectionType;
import com.avito.android.str_booking.network.models.sections.BannerSection;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrBookingBannerConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/domain/items_converter/f;", "Lcom/avito/android/str_booking/domain/items_converter/e;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.str_booking.domain.items_converter.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35066f implements InterfaceC35065e {
    @Inject
    public C35066f() {
    }

    @Override // com.avito.android.str_booking.domain.items_converter.InterfaceC35065e
    @Y61.k
    public final com.avito.android.str_booking.ui.banner.c a(@Y61.k BannerSection bannerSection) {
        StrBookingSectionType[] strBookingSectionTypeArr = StrBookingSectionType.f285853b;
        return new com.avito.android.str_booking.ui.banner.c(bannerSection.getContent());
    }
}
