package com.avito.android.hotel_available_rooms.konveyor.gallery;

import TV0.g;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import lE.C43624b;

/* compiled from: HotelRoomGalleryBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/gallery/b;", "LTV0/b;", "Lcom/avito/android/hotel_available_rooms/konveyor/gallery/n;", "Lcom/avito/android/hotel_available_rooms/konveyor/gallery/HotelRoomGalleryItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements TV0.b<n, HotelRoomGalleryItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f162932a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.hotel_available_rooms.di.m f162933b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f162934c;

    @Inject
    public b(@Y61.k i iVar, @Y61.k @com.avito.android.hotel_available_rooms.di.i com.avito.android.hotel_available_rooms.di.m mVar, @Y61.k C43624b c43624b) {
        this.f162932a = iVar;
        this.f162933b = mVar;
        this.f162934c = new g.a<>(R.layout.hotel_room_gallery_item, new a(c43624b, this));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f162932a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f162934c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof HotelRoomGalleryItem;
    }
}
