package com.avito.android.hotel_available_rooms.konveyor.booking;

import JI.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.hotel_available_rooms.domain.models.HotelBookingInstallments;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: HotelRoomBookingPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ HotelRoomBookingItem f162861l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f162862m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(HotelRoomBookingItem hotelRoomBookingItem, e eVar) {
        super(0);
        this.f162861l = hotelRoomBookingItem;
        this.f162862m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        HotelBookingInstallments hotelBookingInstallments = this.f162861l.f162854f;
        if (hotelBookingInstallments != null && (deepLink = hotelBookingInstallments.f162776b) != null) {
            this.f162862m.f162865b.invoke(new a.d(deepLink));
        }
        return G0.f406611a;
    }
}
