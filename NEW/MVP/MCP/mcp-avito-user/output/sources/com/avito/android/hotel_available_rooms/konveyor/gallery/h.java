package com.avito.android.hotel_available_rooms.konveyor.gallery;

import android.os.Parcelable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HotelRoomGalleryPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f162943l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f162944m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ HotelRoomGalleryItem f162945n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, i iVar, HotelRoomGalleryItem hotelRoomGalleryItem) {
        super(0);
        this.f162943l = nVar;
        this.f162944m = iVar;
        this.f162945n = hotelRoomGalleryItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Parcelable parcelableD0 = this.f162943l.d0();
        k kVar = this.f162944m.f162946b;
        HotelRoomGalleryItem hotelRoomGalleryItem = this.f162945n;
        kVar.b(parcelableD0, hotelRoomGalleryItem.f162926c);
        hotelRoomGalleryItem.f162928e = parcelableD0;
        return G0.f406611a;
    }
}
