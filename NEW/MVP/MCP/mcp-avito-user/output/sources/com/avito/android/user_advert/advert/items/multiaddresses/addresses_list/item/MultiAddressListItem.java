package com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.user_address_public.api.AddressComponents;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiAddressListItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multiaddresses/addresses_list/item/MultiAddressListItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MultiAddressListItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<MultiAddressListItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309703b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AddressComponents f309704c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Coordinates f309705d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<GeoReference> f309706e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f309707f;

    /* compiled from: MultiAddressListItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MultiAddressListItem> {
        @Override // android.os.Parcelable.Creator
        public final MultiAddressListItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            AddressComponents addressComponents = (AddressComponents) parcel.readParcelable(MultiAddressListItem.class.getClassLoader());
            Coordinates coordinates = (Coordinates) parcel.readParcelable(MultiAddressListItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(MultiAddressListItem.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new MultiAddressListItem(string, addressComponents, coordinates, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MultiAddressListItem[] newArray(int i12) {
            return new MultiAddressListItem[i12];
        }
    }

    public MultiAddressListItem(@k String str, @k AddressComponents addressComponents, @k Coordinates coordinates, @l List<GeoReference> list, @l String str2) {
        this.f309703b = str;
        this.f309704c = addressComponents;
        this.f309705d = coordinates;
        this.f309706e = list;
        this.f309707f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiAddressListItem)) {
            return false;
        }
        MultiAddressListItem multiAddressListItem = (MultiAddressListItem) obj;
        return L.f(this.f309703b, multiAddressListItem.f309703b) && L.f(this.f309704c, multiAddressListItem.f309704c) && L.f(this.f309705d, multiAddressListItem.f309705d) && L.f(this.f309706e, multiAddressListItem.f309706e) && L.f(this.f309707f, multiAddressListItem.f309707f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309542b() {
        return this.f309703b;
    }

    public final int hashCode() {
        int iHashCode = (this.f309705d.hashCode() + ((this.f309704c.hashCode() + (this.f309703b.hashCode() * 31)) * 31)) * 31;
        List<GeoReference> list = this.f309706e;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f309707f;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiAddressListItem(stringId=");
        sb2.append(this.f309703b);
        sb2.append(", components=");
        sb2.append(this.f309704c);
        sb2.append(", coords=");
        sb2.append(this.f309705d);
        sb2.append(", geoReference=");
        sb2.append(this.f309706e);
        sb2.append(", deliveryInfo=");
        return C22026a.c(sb2, this.f309707f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f309703b);
        parcel.writeParcelable(this.f309704c, i12);
        parcel.writeParcelable(this.f309705d, i12);
        List<GeoReference> list = this.f309706e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeString(this.f309707f);
    }
}
