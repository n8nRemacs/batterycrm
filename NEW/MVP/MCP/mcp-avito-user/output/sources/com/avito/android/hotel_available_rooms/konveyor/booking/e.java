package com.avito.android.hotel_available_rooms.konveyor.booking;

import Y41.l;
import Y61.k;
import com.avito.android.R;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HotelRoomBookingPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/booking/e;", "LTV0/d;", "Lcom/avito/android/hotel_available_rooms/konveyor/booking/g;", "Lcom/avito/android/hotel_available_rooms/konveyor/booking/HotelRoomBookingItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements TV0.d<g, HotelRoomBookingItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<JI.a, G0> f162865b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super JI.a, G0> lVar) {
        this.f162865b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        HotelRoomBookingItem hotelRoomBookingItem = (HotelRoomBookingItem) aVar;
        AttributedText attributedText = hotelRoomBookingItem.f162852d;
        gVar.dd(attributedText);
        gVar.Wj(hotelRoomBookingItem.f162851c);
        gVar.O40(hotelRoomBookingItem.f162854f);
        ButtonAction buttonAction = hotelRoomBookingItem.f162855g;
        String style = buttonAction.getStyle();
        gVar.EN(style != null ? com.avito.android.lib.util.f.d(style) : R.attr.buttonPayMedium);
        Boolean boolIsEnabled = buttonAction.isEnabled();
        gVar.oB(boolIsEnabled != null ? boolIsEnabled.booleanValue() : true);
        gVar.V0(buttonAction.getTitle());
        gVar.mu(hotelRoomBookingItem.f162856h);
        gVar.Nc(hotelRoomBookingItem.f162853e);
        gVar.h4(new c(hotelRoomBookingItem, this));
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new com.avito.android.cpt.pre_activation.ui.c(this, 11));
        }
        gVar.Y(new d(hotelRoomBookingItem, this));
    }
}
