package com.avito.android.remote.imv_cars_details.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsDetailsResponse.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/imv_cars_details/models/DifferenceImvAvgPrice;", "Landroid/os/Parcelable;", "", "header", "avgPriceHeader", "imvHeader", "", "Lcom/avito/android/remote/imv_cars_details/models/DifferenceImvAvgPriceParams;", "avgPriceParams", "imvParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "c", "f", "Ljava/util/List;", "d", "()Ljava/util/List;", "g", "_avito-discouraged_avito-api_imv-cars-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DifferenceImvAvgPrice implements Parcelable {

    @k
    public static final Parcelable.Creator<DifferenceImvAvgPrice> CREATOR = new a();

    @c("avgPriceHeader")
    @l
    private final String avgPriceHeader;

    @c("avgPriceParams")
    @l
    private final List<DifferenceImvAvgPriceParams> avgPriceParams;

    @c("header")
    @l
    private final String header;

    @c("imvHeader")
    @l
    private final String imvHeader;

    @c("imvParams")
    @l
    private final List<DifferenceImvAvgPriceParams> imvParams;

    /* compiled from: ImvCarsDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DifferenceImvAvgPrice> {
        @Override // android.os.Parcelable.Creator
        public final DifferenceImvAvgPrice createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int iC2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(DifferenceImvAvgPriceParams.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(DifferenceImvAvgPriceParams.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new DifferenceImvAvgPrice(string, string2, string3, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final DifferenceImvAvgPrice[] newArray(int i12) {
            return new DifferenceImvAvgPrice[i12];
        }
    }

    public DifferenceImvAvgPrice(@l String str, @l String str2, @l String str3, @l List<DifferenceImvAvgPriceParams> list, @l List<DifferenceImvAvgPriceParams> list2) {
        this.header = str;
        this.avgPriceHeader = str2;
        this.imvHeader = str3;
        this.avgPriceParams = list;
        this.imvParams = list2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getAvgPriceHeader() {
        return this.avgPriceHeader;
    }

    @l
    public final List<DifferenceImvAvgPriceParams> d() {
        return this.avgPriceParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DifferenceImvAvgPrice)) {
            return false;
        }
        DifferenceImvAvgPrice differenceImvAvgPrice = (DifferenceImvAvgPrice) obj;
        return L.f(this.header, differenceImvAvgPrice.header) && L.f(this.avgPriceHeader, differenceImvAvgPrice.avgPriceHeader) && L.f(this.imvHeader, differenceImvAvgPrice.imvHeader) && L.f(this.avgPriceParams, differenceImvAvgPrice.avgPriceParams) && L.f(this.imvParams, differenceImvAvgPrice.imvParams);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getImvHeader() {
        return this.imvHeader;
    }

    @l
    public final List<DifferenceImvAvgPriceParams> g() {
        return this.imvParams;
    }

    public final int hashCode() {
        String str = this.header;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.avgPriceHeader;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imvHeader;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<DifferenceImvAvgPriceParams> list = this.avgPriceParams;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<DifferenceImvAvgPriceParams> list2 = this.imvParams;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DifferenceImvAvgPrice(header=");
        sb2.append(this.header);
        sb2.append(", avgPriceHeader=");
        sb2.append(this.avgPriceHeader);
        sb2.append(", imvHeader=");
        sb2.append(this.imvHeader);
        sb2.append(", avgPriceParams=");
        sb2.append(this.avgPriceParams);
        sb2.append(", imvParams=");
        return H.p(sb2, this.imvParams, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.header);
        parcel.writeString(this.avgPriceHeader);
        parcel.writeString(this.imvHeader);
        List<DifferenceImvAvgPriceParams> list = this.avgPriceParams;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((DifferenceImvAvgPriceParams) itA.next()).writeToParcel(parcel, i12);
            }
        }
        List<DifferenceImvAvgPriceParams> list2 = this.imvParams;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((DifferenceImvAvgPriceParams) itA2.next()).writeToParcel(parcel, i12);
        }
    }
}
