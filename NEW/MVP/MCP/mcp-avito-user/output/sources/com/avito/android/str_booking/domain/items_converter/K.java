package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.str_booking.network.models.sections.PromoBannerSection;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrBookingPromoBannerConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/domain/items_converter/K;", "Lcom/avito/android/str_booking/domain/items_converter/J;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class K implements J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f285621a;

    @Inject
    public K(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f285621a = interfaceC35863o4;
    }

    @Override // com.avito.android.str_booking.domain.items_converter.J
    @Y61.k
    public final com.avito.android.str_booking.ui.promo_banner.a a(@Y61.k PromoBannerSection promoBannerSection) {
        String title = promoBannerSection.getContent().getTitle();
        if (title == null) {
            title = this.f285621a.a();
        }
        return new com.avito.android.str_booking.ui.promo_banner.a(title, promoBannerSection.getContent());
    }
}
