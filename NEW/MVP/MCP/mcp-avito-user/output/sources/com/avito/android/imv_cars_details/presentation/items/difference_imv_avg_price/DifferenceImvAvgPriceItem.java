package com.avito.android.imv_cars_details.presentation.items.difference_imv_avg_price;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.imv_cars_details.models.DifferenceImvAvgPriceParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DifferenceImvAvgPriceItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/difference_imv_avg_price/DifferenceImvAvgPriceItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DifferenceImvAvgPriceItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<DifferenceImvAvgPriceItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f170055b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f170056c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f170057d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f170058e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final List<DifferenceImvAvgPriceParams> f170059f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<DifferenceImvAvgPriceParams> f170060g;

    /* compiled from: DifferenceImvAvgPriceItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DifferenceImvAvgPriceItem> {
        @Override // android.os.Parcelable.Creator
        public final DifferenceImvAvgPriceItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int iL2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(DifferenceImvAvgPriceItem.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(DifferenceImvAvgPriceItem.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new DifferenceImvAvgPriceItem(string, string2, string3, string4, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final DifferenceImvAvgPriceItem[] newArray(int i12) {
            return new DifferenceImvAvgPriceItem[i12];
        }
    }

    public DifferenceImvAvgPriceItem(@k String str, @l String str2, @l String str3, @l String str4, @l List<DifferenceImvAvgPriceParams> list, @l List<DifferenceImvAvgPriceParams> list2) {
        this.f170055b = str;
        this.f170056c = str2;
        this.f170057d = str3;
        this.f170058e = str4;
        this.f170059f = list;
        this.f170060g = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DifferenceImvAvgPriceItem)) {
            return false;
        }
        DifferenceImvAvgPriceItem differenceImvAvgPriceItem = (DifferenceImvAvgPriceItem) obj;
        return L.f(this.f170055b, differenceImvAvgPriceItem.f170055b) && L.f(this.f170056c, differenceImvAvgPriceItem.f170056c) && L.f(this.f170057d, differenceImvAvgPriceItem.f170057d) && L.f(this.f170058e, differenceImvAvgPriceItem.f170058e) && L.f(this.f170059f, differenceImvAvgPriceItem.f170059f) && L.f(this.f170060g, differenceImvAvgPriceItem.f170060g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF301522b() {
        return getF330953b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF330953b() {
        return this.f170055b;
    }

    public final int hashCode() {
        int iHashCode = this.f170055b.hashCode() * 31;
        String str = this.f170056c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f170057d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f170058e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<DifferenceImvAvgPriceParams> list = this.f170059f;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<DifferenceImvAvgPriceParams> list2 = this.f170060g;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DifferenceImvAvgPriceItem(stringId=");
        sb2.append(this.f170055b);
        sb2.append(", header=");
        sb2.append(this.f170056c);
        sb2.append(", avgPriceHeader=");
        sb2.append(this.f170057d);
        sb2.append(", imvHeader=");
        sb2.append(this.f170058e);
        sb2.append(", avgPriceParams=");
        sb2.append(this.f170059f);
        sb2.append(", imvParams=");
        return H.p(sb2, this.f170060g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f170055b);
        parcel.writeString(this.f170056c);
        parcel.writeString(this.f170057d);
        parcel.writeString(this.f170058e);
        List<DifferenceImvAvgPriceParams> list = this.f170059f;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        List<DifferenceImvAvgPriceParams> list2 = this.f170060g;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), i12);
        }
    }

    public /* synthetic */ DifferenceImvAvgPriceItem(String str, String str2, String str3, String str4, List list, List list2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? DifferenceImvAvgPriceItem.class.getName() : str, str2, str3, str4, list, list2);
    }
}
