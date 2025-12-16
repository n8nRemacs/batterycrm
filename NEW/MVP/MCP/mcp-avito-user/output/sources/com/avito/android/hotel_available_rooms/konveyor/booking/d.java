package com.avito.android.hotel_available_rooms.konveyor.booking;

import JI.a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HotelRoomBookingPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ HotelRoomBookingItem f162863l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f162864m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(HotelRoomBookingItem hotelRoomBookingItem, e eVar) {
        super(0);
        this.f162863l = hotelRoomBookingItem;
        this.f162864m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deeplink = this.f162863l.f162855g.getDeeplink();
        if (deeplink != null) {
            e eVar = this.f162864m;
            eVar.f162865b.invoke(new a.c(deeplink));
        }
        return G0.f406611a;
    }
}
