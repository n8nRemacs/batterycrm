package com.avito.android.user_address_public.api;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiAddressesItem.kt */
@d
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b!\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\"\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b#\u0010 ¨\u0006$"}, d2 = {"Lcom/avito/android/user_address_public/api/MultiAddressesItem;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/user_address_public/api/AddressComponents;", "components", "Lcom/avito/android/remote/model/Coordinates;", "coords", "", "Lcom/avito/android/remote/model/GeoReference;", "geoReference", "", "deliveryInfo", "assignment", "mapBadgeText", "bottomSheetTitle", "<init>", "(ILcom/avito/android/user_address_public/api/AddressComponents;Lcom/avito/android/remote/model/Coordinates;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "I", "i", "()I", "Lcom/avito/android/user_address_public/api/AddressComponents;", "e", "()Lcom/avito/android/user_address_public/api/AddressComponents;", "Lcom/avito/android/remote/model/Coordinates;", "f", "()Lcom/avito/android/remote/model/Coordinates;", "Ljava/util/List;", "h", "()Ljava/util/List;", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "c", "j", "d", "_avito_user-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MultiAddressesItem implements Parcelable {

    @k
    public static final Parcelable.Creator<MultiAddressesItem> CREATOR = new a();

    @c("assignment")
    @l
    private final String assignment;

    @c("bottomSheetTitle")
    @l
    private final String bottomSheetTitle;

    @c("addressComponents")
    @k
    private final AddressComponents components;

    @c(ServiceTransportationWidget.LocationField.COORDINATES)
    @k
    private final Coordinates coords;

    @c("deliveryInfo")
    @l
    private final String deliveryInfo;

    @c("geoReferences")
    @l
    private final List<GeoReference> geoReference;

    @c("addressId")
    private final int id;

    @c("mapBadgeText")
    @l
    private final String mapBadgeText;

    /* compiled from: MultiAddressesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MultiAddressesItem> {
        @Override // android.os.Parcelable.Creator
        public final MultiAddressesItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i12 = parcel.readInt();
            AddressComponents addressComponentsCreateFromParcel = AddressComponents.CREATOR.createFromParcel(parcel);
            Coordinates coordinates = (Coordinates) parcel.readParcelable(MultiAddressesItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(MultiAddressesItem.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new MultiAddressesItem(i12, addressComponentsCreateFromParcel, coordinates, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MultiAddressesItem[] newArray(int i12) {
            return new MultiAddressesItem[i12];
        }
    }

    public MultiAddressesItem(int i12, @k AddressComponents addressComponents, @k Coordinates coordinates, @l List<GeoReference> list, @l String str, @l String str2, @l String str3, @l String str4) {
        this.id = i12;
        this.components = addressComponents;
        this.coords = coordinates;
        this.geoReference = list;
        this.deliveryInfo = str;
        this.assignment = str2;
        this.mapBadgeText = str3;
        this.bottomSheetTitle = str4;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getAssignment() {
        return this.assignment;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getBottomSheetTitle() {
        return this.bottomSheetTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AddressComponents getComponents() {
        return this.components;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiAddressesItem)) {
            return false;
        }
        MultiAddressesItem multiAddressesItem = (MultiAddressesItem) obj;
        return this.id == multiAddressesItem.id && L.f(this.components, multiAddressesItem.components) && L.f(this.coords, multiAddressesItem.coords) && L.f(this.geoReference, multiAddressesItem.geoReference) && L.f(this.deliveryInfo, multiAddressesItem.deliveryInfo) && L.f(this.assignment, multiAddressesItem.assignment) && L.f(this.mapBadgeText, multiAddressesItem.mapBadgeText) && L.f(this.bottomSheetTitle, multiAddressesItem.bottomSheetTitle);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final Coordinates getCoords() {
        return this.coords;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getDeliveryInfo() {
        return this.deliveryInfo;
    }

    @l
    public final List<GeoReference> h() {
        return this.geoReference;
    }

    public final int hashCode() {
        int iHashCode = (this.coords.hashCode() + ((this.components.hashCode() + (Integer.hashCode(this.id) * 31)) * 31)) * 31;
        List<GeoReference> list = this.geoReference;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.deliveryInfo;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.assignment;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mapBadgeText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bottomSheetTitle;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final String getMapBadgeText() {
        return this.mapBadgeText;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiAddressesItem(id=");
        sb2.append(this.id);
        sb2.append(", components=");
        sb2.append(this.components);
        sb2.append(", coords=");
        sb2.append(this.coords);
        sb2.append(", geoReference=");
        sb2.append(this.geoReference);
        sb2.append(", deliveryInfo=");
        sb2.append(this.deliveryInfo);
        sb2.append(", assignment=");
        sb2.append(this.assignment);
        sb2.append(", mapBadgeText=");
        sb2.append(this.mapBadgeText);
        sb2.append(", bottomSheetTitle=");
        return C22026a.c(sb2, this.bottomSheetTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.id);
        this.components.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.coords, i12);
        List<GeoReference> list = this.geoReference;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeString(this.deliveryInfo);
        parcel.writeString(this.assignment);
        parcel.writeString(this.mapBadgeText);
        parcel.writeString(this.bottomSheetTitle);
    }
}
