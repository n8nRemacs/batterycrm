package com.avito.android.hotel_available_rooms.konveyor.image;

import JI.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HotelRoomImagePresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f162991l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ HotelRoomImageItem f162992m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f162993n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, HotelRoomImageItem hotelRoomImageItem, int i12) {
        super(0);
        this.f162991l = iVar;
        this.f162992m = hotelRoomImageItem;
        this.f162993n = i12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f162991l.f162994b.invoke(new a.h(this.f162992m.f162965c, this.f162993n));
        return G0.f406611a;
    }
}
