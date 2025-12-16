package com.avito.android.hotel_available_rooms.konveyor.gallery;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelRoomGalleryItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/gallery/HotelRoomGalleryItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelRoomGalleryItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<HotelRoomGalleryItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f162925b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f162926c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<ParcelableItem> f162927d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Parcelable f162928e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f162929f;

    /* compiled from: HotelRoomGalleryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelRoomGalleryItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelRoomGalleryItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(HotelRoomGalleryItem.class, parcel, arrayList, iL2, 1);
            }
            return new HotelRoomGalleryItem(string, string2, arrayList, parcel.readParcelable(HotelRoomGalleryItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelRoomGalleryItem[] newArray(int i12) {
            return new HotelRoomGalleryItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HotelRoomGalleryItem(@Y61.k String str, @Y61.k String str2, @Y61.k List<? extends ParcelableItem> list, @Y61.l Parcelable parcelable, @Y61.l Integer num) {
        this.f162925b = str;
        this.f162926c = str2;
        this.f162927d = list;
        this.f162928e = parcelable;
        this.f162929f = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelRoomGalleryItem)) {
            return false;
        }
        HotelRoomGalleryItem hotelRoomGalleryItem = (HotelRoomGalleryItem) obj;
        return L.f(this.f162925b, hotelRoomGalleryItem.f162925b) && L.f(this.f162926c, hotelRoomGalleryItem.f162926c) && L.f(this.f162927d, hotelRoomGalleryItem.f162927d) && L.f(this.f162928e, hotelRoomGalleryItem.f162928e) && L.f(this.f162929f, hotelRoomGalleryItem.f162929f);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154208b() {
        return this.f162925b;
    }

    public final int hashCode() {
        int iE2 = H.e(H.d(this.f162925b.hashCode() * 31, 31, this.f162926c), 31, this.f162927d);
        Parcelable parcelable = this.f162928e;
        int iHashCode = (iE2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        Integer num = this.f162929f;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelRoomGalleryItem(stringId=");
        sb2.append(this.f162925b);
        sb2.append(", roomId=");
        sb2.append(this.f162926c);
        sb2.append(", images=");
        sb2.append(this.f162927d);
        sb2.append(", state=");
        sb2.append(this.f162928e);
        sb2.append(", currentPosition=");
        return s.j(sb2, this.f162929f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f162925b);
        parcel.writeString(this.f162926c);
        Iterator itJ = C0.j(this.f162927d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f162928e, i12);
        Integer num = this.f162929f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
