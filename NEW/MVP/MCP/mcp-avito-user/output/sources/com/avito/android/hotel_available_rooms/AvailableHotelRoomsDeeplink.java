package com.avito.android.hotel_available_rooms;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: AvailableHotelRoomsDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_available_rooms/AvailableHotelRoomsDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "AvailableHotelRoomsData", "_avito_hotel-available-rooms_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final /* data */ class AvailableHotelRoomsDeeplink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<AvailableHotelRoomsDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AvailableHotelRoomsData f162645b;

    /* compiled from: AvailableHotelRoomsDeeplink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/hotel_available_rooms/AvailableHotelRoomsDeeplink$AvailableHotelRoomsData;", "Landroid/os/Parcelable;", "", "itemId", "checkIn", "checkOut", "", "adultsCount", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "", "childAges", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getItemId", "()Ljava/lang/String;", "d", "e", "I", "c", "()I", "g", "Ljava/util/List;", "f", "()Ljava/util/List;", "_avito_hotel-available-rooms_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AvailableHotelRoomsData implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<AvailableHotelRoomsData> CREATOR = new a();

        @com.google.gson.annotations.c("adultsCount")
        private final int adultsCount;

        @com.google.gson.annotations.c("checkIn")
        @Y61.k
        private final String checkIn;

        @com.google.gson.annotations.c("checkOut")
        @Y61.k
        private final String checkOut;

        @com.google.gson.annotations.c("childAges")
        @l
        private final List<Integer> childAges;

        @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
        @l
        private final String from;

        @com.google.gson.annotations.c("itemId")
        @Y61.k
        private final String itemId;

        /* compiled from: AvailableHotelRoomsDeeplink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AvailableHotelRoomsData> {
            @Override // android.os.Parcelable.Creator
            public final AvailableHotelRoomsData createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i12 = parcel.readInt();
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i13 = parcel.readInt();
                    arrayList = new ArrayList(i13);
                    int iD2 = 0;
                    while (iD2 != i13) {
                        iD2 = com.avito.android.advert.item.delivery_suggests.l.d(parcel, arrayList, iD2, 1);
                    }
                }
                return new AvailableHotelRoomsData(string, string2, string3, i12, string4, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AvailableHotelRoomsData[] newArray(int i12) {
                return new AvailableHotelRoomsData[i12];
            }
        }

        public AvailableHotelRoomsData(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, int i12, @l String str4, @l List<Integer> list) {
            this.itemId = str;
            this.checkIn = str2;
            this.checkOut = str3;
            this.adultsCount = i12;
            this.from = str4;
            this.childAges = list;
        }

        /* renamed from: c, reason: from getter */
        public final int getAdultsCount() {
            return this.adultsCount;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getCheckIn() {
            return this.checkIn;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Y61.k
        /* renamed from: e, reason: from getter */
        public final String getCheckOut() {
            return this.checkOut;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AvailableHotelRoomsData)) {
                return false;
            }
            AvailableHotelRoomsData availableHotelRoomsData = (AvailableHotelRoomsData) obj;
            return L.f(this.itemId, availableHotelRoomsData.itemId) && L.f(this.checkIn, availableHotelRoomsData.checkIn) && L.f(this.checkOut, availableHotelRoomsData.checkOut) && this.adultsCount == availableHotelRoomsData.adultsCount && L.f(this.from, availableHotelRoomsData.from) && L.f(this.childAges, availableHotelRoomsData.childAges);
        }

        @l
        public final List<Integer> f() {
            return this.childAges;
        }

        @l
        /* renamed from: g, reason: from getter */
        public final String getFrom() {
            return this.from;
        }

        @Y61.k
        public final String getItemId() {
            return this.itemId;
        }

        public final int hashCode() {
            int iE2 = r.e(this.adultsCount, H.d(H.d(this.itemId.hashCode() * 31, 31, this.checkIn), 31, this.checkOut), 31);
            String str = this.from;
            int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
            List<Integer> list = this.childAges;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AvailableHotelRoomsData(itemId=");
            sb2.append(this.itemId);
            sb2.append(", checkIn=");
            sb2.append(this.checkIn);
            sb2.append(", checkOut=");
            sb2.append(this.checkOut);
            sb2.append(", adultsCount=");
            sb2.append(this.adultsCount);
            sb2.append(", from=");
            sb2.append(this.from);
            sb2.append(", childAges=");
            return H.p(sb2, this.childAges, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.itemId);
            parcel.writeString(this.checkIn);
            parcel.writeString(this.checkOut);
            parcel.writeInt(this.adultsCount);
            parcel.writeString(this.from);
            List<Integer> list = this.childAges;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeInt(((Number) itA.next()).intValue());
            }
        }
    }

    /* compiled from: AvailableHotelRoomsDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AvailableHotelRoomsDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final AvailableHotelRoomsDeeplink createFromParcel(Parcel parcel) {
            return new AvailableHotelRoomsDeeplink(AvailableHotelRoomsData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AvailableHotelRoomsDeeplink[] newArray(int i12) {
            return new AvailableHotelRoomsDeeplink[i12];
        }
    }

    public AvailableHotelRoomsDeeplink(@Y61.k AvailableHotelRoomsData availableHotelRoomsData) {
        this.f162645b = availableHotelRoomsData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AvailableHotelRoomsDeeplink) && L.f(this.f162645b, ((AvailableHotelRoomsDeeplink) obj).f162645b);
    }

    public final int hashCode() {
        return this.f162645b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "AvailableHotelRoomsDeeplink(data=" + this.f162645b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f162645b.writeToParcel(parcel, i12);
    }
}
