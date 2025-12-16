package com.avito.android.hotel_available_rooms.konveyor.gallery;

import android.os.Parcelable;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HotelRoomGalleryStateProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/gallery/l;", "Lcom/avito/android/hotel_available_rooms/konveyor/gallery/k;", "<init>", "()V", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f162948a = new LinkedHashMap();

    @Inject
    public l() {
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.gallery.k
    @Y61.l
    public final Parcelable a(@Y61.k String str) {
        return (Parcelable) this.f162948a.get(str);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.gallery.k
    public final void b(@Y61.l Parcelable parcelable, @Y61.k String str) {
        this.f162948a.put(str, parcelable);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.gallery.k
    public final void clear() {
        this.f162948a.clear();
    }
}
