package com.avito.android.hotel_available_rooms.konveyor.amenity;

import JI.a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: HotelRoomAmenityPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ HotelRoomAmenityItem f162843l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f162844m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(HotelRoomAmenityItem hotelRoomAmenityItem, d dVar) {
        super(0);
        this.f162843l = hotelRoomAmenityItem;
        this.f162844m = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f162843l.f162838e;
        if (deepLink != null) {
            this.f162844m.f162845b.invoke(new a.d(deepLink));
        }
        return G0.f406611a;
    }
}
