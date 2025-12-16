package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.ExpandItemsButton;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertHotel.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/hotel/model/Amenities;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/ExpandItemsButton;", "expandButton", "", "Lcom/avito/android/hotel/model/Amenities$AmenityGroup;", "items", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/ExpandItemsButton;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/ExpandItemsButton;", "c", "()Lcom/avito/android/remote/model/ExpandItemsButton;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Amenity", "AmenityGroup", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Amenities implements Parcelable {

    @k
    public static final Parcelable.Creator<Amenities> CREATOR = new a();

    @c("expandButton")
    @l
    private final ExpandItemsButton expandButton;

    @c("items")
    @l
    private final List<AmenityGroup> items;

    @c("title")
    @l
    private final String title;

    /* compiled from: AdvertHotel.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/avito/android/hotel/model/Amenities$Amenity;", "Landroid/os/Parcelable;", "", "attributeId", "title", "price", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getTitle", "getPrice", "getIcon", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Amenity implements Parcelable {

        @k
        public static final Parcelable.Creator<Amenity> CREATOR = new a();

        @c("attributeId")
        @l
        private final String attributeId;

        @c("icon")
        @l
        private final String icon;

        @c("price")
        @l
        private final String price;

        @c("title")
        @l
        private final String title;

        /* compiled from: AdvertHotel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Amenity> {
            @Override // android.os.Parcelable.Creator
            public final Amenity createFromParcel(Parcel parcel) {
                return new Amenity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Amenity[] newArray(int i12) {
                return new Amenity[i12];
            }
        }

        public Amenity(@l String str, @l String str2, @l String str3, @l String str4) {
            this.attributeId = str;
            this.title = str2;
            this.price = str3;
            this.icon = str4;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getAttributeId() {
            return this.attributeId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Amenity)) {
                return false;
            }
            Amenity amenity = (Amenity) obj;
            return L.f(this.attributeId, amenity.attributeId) && L.f(this.title, amenity.title) && L.f(this.price, amenity.price) && L.f(this.icon, amenity.icon);
        }

        @l
        public final String getIcon() {
            return this.icon;
        }

        @l
        public final String getPrice() {
            return this.price;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.attributeId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.price;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.icon;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Amenity(attributeId=");
            sb2.append(this.attributeId);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", price=");
            sb2.append(this.price);
            sb2.append(", icon=");
            return C22026a.c(sb2, this.icon, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.attributeId);
            parcel.writeString(this.title);
            parcel.writeString(this.price);
            parcel.writeString(this.icon);
        }
    }

    /* compiled from: AdvertHotel.kt */
    @d
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/hotel/model/Amenities$AmenityGroup;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/hotel/model/Amenities$Amenity;", "amenities", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AmenityGroup implements Parcelable {

        @k
        public static final Parcelable.Creator<AmenityGroup> CREATOR = new a();

        @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
        @l
        private final List<Amenity> amenities;

        @c("title")
        @l
        private final String title;

        /* compiled from: AdvertHotel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AmenityGroup> {
            @Override // android.os.Parcelable.Creator
            public final AmenityGroup createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(Amenity.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new AmenityGroup(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AmenityGroup[] newArray(int i12) {
                return new AmenityGroup[i12];
            }
        }

        public AmenityGroup(@l String str, @l List<Amenity> list) {
            this.title = str;
            this.amenities = list;
        }

        @l
        public final List<Amenity> c() {
            return this.amenities;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AmenityGroup)) {
                return false;
            }
            AmenityGroup amenityGroup = (AmenityGroup) obj;
            return L.f(this.title, amenityGroup.title) && L.f(this.amenities, amenityGroup.amenities);
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<Amenity> list = this.amenities;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AmenityGroup(title=");
            sb2.append(this.title);
            sb2.append(", amenities=");
            return H.p(sb2, this.amenities, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            List<Amenity> list = this.amenities;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Amenity) itA.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: AdvertHotel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Amenities> {
        @Override // android.os.Parcelable.Creator
        public final Amenities createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            ExpandItemsButton expandItemsButton = (ExpandItemsButton) parcel.readParcelable(Amenities.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(AmenityGroup.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new Amenities(string, expandItemsButton, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Amenities[] newArray(int i12) {
            return new Amenities[i12];
        }
    }

    public Amenities(@l String str, @l ExpandItemsButton expandItemsButton, @l List<AmenityGroup> list) {
        this.title = str;
        this.expandButton = expandItemsButton;
        this.items = list;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ExpandItemsButton getExpandButton() {
        return this.expandButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final List<AmenityGroup> getItems() {
        return this.items;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.expandButton, i12);
        List<AmenityGroup> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((AmenityGroup) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
