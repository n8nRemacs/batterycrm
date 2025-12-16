package com.avito.android.hotel_available_rooms.konveyor.gallery;

import android.os.Parcelable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: HotelRoomGalleryPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ HotelRoomGalleryItem f162941l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f162942m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(HotelRoomGalleryItem hotelRoomGalleryItem, n nVar) {
        super(0);
        this.f162941l = hotelRoomGalleryItem;
        this.f162942m = nVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        G0 g02;
        Parcelable parcelable = this.f162941l.f162928e;
        n nVar = this.f162942m;
        if (parcelable != null) {
            nVar.gb(parcelable);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            nVar.s4(0);
        }
        return G0.f406611a;
    }
}
