package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.str_booking.network.models.common.Button;
import com.avito.android.str_booking.network.models.sections.ButtonsContent;
import com.avito.android.str_booking.network.models.sections.ButtonsSection;
import com.avito.android.util.InterfaceC35863o4;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: StrBookingButtonsConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/domain/items_converter/j;", "Lcom/avito/android/str_booking/domain/items_converter/h;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.str_booking.domain.items_converter.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35070j implements InterfaceC35068h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f285632a;

    @Inject
    public C35070j(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f285632a = interfaceC35863o4;
    }

    @Override // com.avito.android.str_booking.domain.items_converter.InterfaceC35068h
    @Y61.l
    public final com.avito.android.str_booking.ui.buttons.c a(@Y61.k ButtonsSection buttonsSection) {
        List<Button> listC;
        List<Button> listC2;
        ButtonsContent content = buttonsSection.getContent();
        if (content == null || (listC = content.c()) == null) {
            return null;
        }
        ButtonsContent content2 = buttonsSection.getContent();
        return new com.avito.android.str_booking.ui.buttons.c((content2 == null || (listC2 = content2.c()) == null) ? this.f285632a.a() : C42745f0.O(listC2, null, null, null, C35069i.f285631l, 31), listC);
    }
}
